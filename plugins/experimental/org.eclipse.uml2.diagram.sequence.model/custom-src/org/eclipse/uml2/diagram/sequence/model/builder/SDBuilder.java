package org.eclipse.uml2.diagram.sequence.model.builder;

import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFactory;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode;
import org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDModelImpl;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.StateInvariant;

public class SDBuilder {

	private final Interaction myInteraction;
	private final StartAndFinishRegistry myStartsAndFinishes;
	private final LifeLineCallStack myCallStack;
	private final MessageNumbers myMessageNumbers; 
	private SDModel mySDModel;
	
	public SDBuilder(Interaction interaction) {
		myInteraction = interaction;
		myStartsAndFinishes = new StartAndFinishRegistry(myInteraction);
		myCallStack = new LifeLineCallStack();
		myMessageNumbers = new MessageNumbers(this);
	}
	
	public Interaction getInteraction() {
		return myInteraction;
	}
	
	public void updateMessageNumbers(){
		myMessageNumbers.updateMessageNumbers();
	}
	
	/**
	 * For tests only
	 */
	public LifeLineCallStack getCallStack() {
		return myCallStack;
	}
	
	public SDModel getSDFrame(){
		if (mySDModel == null){
			reBuildFrame();
		}
		return mySDModel;
	}
	
	public SDModel reBuildFrame() {
		myCallStack.clear();
		myStartsAndFinishes.forceRemap();
		mySDModel = SDFactory.eINSTANCE.createSDModel();
		mySDModel.setUmlInteraction(myInteraction);
		
		/**
		 * intentionally cast to implementation -- we don't want to allow clients to call this 
		 */
		((SDModelImpl)mySDModel).setUMLTracing(new SDBuilderTrace());

		buildGates(mySDModel, myInteraction);
		buildLifeLines(mySDModel, myInteraction);

		for (Iterator<InteractionFragment> fragments = myInteraction.getFragments().iterator(); fragments.hasNext();) {
			buildBrackets(fragments);
		}
		
		updateMessageNumbers();

		return mySDModel;
	}
	
	private void buildGates(SDModel model, Interaction interaction) {
		for (Gate umlGate : interaction.getFormalGates()) {
			SDGate sdGate = SDFactory.eINSTANCE.createSDGate();
			sdGate.setUmlGate(umlGate);
			model.getGates().add(sdGate);
		}
	}

	private void buildLifeLines(SDModel model, Interaction interaction) {
		assert model.getLifelines().isEmpty();
		for (Lifeline umlLifeline : interaction.getLifelines()) {
			SDLifeLine sdLifeLine = getTraceImpl().bindNewLifeline(umlLifeline);
			model.getLifelines().add(sdLifeLine);
			myCallStack.push(umlLifeline, sdLifeLine);
		}
	}

	private void buildBrackets(Iterator<InteractionFragment> orderedFragments) {
		if (!orderedFragments.hasNext()) {
			return;
		}
		InteractionFragment fragment = orderedFragments.next();
		if (fragment instanceof StateInvariant) {
			buildSimpleNode(fragment);
			return;
		}
		if (fragment instanceof ActionExecutionSpecification) {
			buildSimpleNode(fragment);
			return;
		}
		if (fragment instanceof CombinedFragment) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof Continuation) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof Interaction) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof InteractionOperand) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof InteractionUse) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof ExecutionOccurrenceSpecification) {
			unsupportedFragment(fragment);
			return;
		}
		if (fragment instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageEnd = (MessageOccurrenceSpecification) fragment;
			Lifeline lifeline = ensureSingleCovered(messageEnd);
			if (lifeline == null) {
				warning("MessageOccurrenceSpecification without a lifeline: " + messageEnd);
				return;
			}
			Message message = messageEnd.getMessage();
			if (message == null) {
				processPossibleExecutionFinish(orderedFragments, messageEnd, lifeline);
				return;
			}
			if (message.getSendEvent() == messageEnd) {
				buildMessageSource(orderedFragments, messageEnd);
				return;
			}
			if (message.getReceiveEvent() == fragment) {
				buildMessageTarget(orderedFragments, messageEnd);
				return;
			}
		}
		if (fragment instanceof ExecutionSpecification){
			buildExecutionSpecification((ExecutionSpecification)fragment);
			return;
		}
	}

	private void processPossibleExecutionFinish(Iterator<InteractionFragment> orderedFragments, MessageOccurrenceSpecification messageEnd, Lifeline lifeline) {
		ExecutionSpecification umlFinishedExecution = myStartsAndFinishes.findFinishedExecution(messageEnd);
		if (umlFinishedExecution == null){
			warning("Lost message end (no message) is found (will be ignored):" + messageEnd);
			return;
		}
		
		if (ensureSingleCovered(umlFinishedExecution) != lifeline){
			throw new UMLModelProblem("Execution is finished at wrong lifeline: " + umlFinishedExecution + ", expected lifeline is: " + lifeline);
		}
		
		SDBracketContainer sdFinishedContainer = myCallStack.peek(lifeline);
		if (false == sdFinishedContainer instanceof SDBehaviorSpec && ((SDBehaviorSpec)sdFinishedContainer).getUmlExecutionSpec() != umlFinishedExecution){
			throw new UMLModelProblem("ExecutionSpecification finished: " + umlFinishedExecution + ", while active bracket container was :" + sdFinishedContainer);
		}
		
		if (sdFinishedContainer instanceof SDInvocation && ((SDInvocation)sdFinishedContainer).getUmlExecutionSpec() == null){
			throw new SDBuilderInternalProblem("SDInvocation : " + sdFinishedContainer + " does not have uml counterpart. However, we have found finish for it: " + messageEnd + ", actual umlExecution: " + umlFinishedExecution);
		}
		
		myCallStack.pop(lifeline); //
		if (sdFinishedContainer instanceof SDExecution){
			SDExecution sdFinishedExecution = (SDExecution)sdFinishedContainer;
			SDInvocation sdInvocation = sdFinishedExecution.getInvocation();
			if (sdInvocation != null && sdInvocation.getUmlExecutionSpec() == null){
				//this invocation was created manually in builder without uml-counterpart, 
				//it means that we won't find finish for it and should remove it manually
				SDLifeLine invocationLifeLine = SDModelHelper.findLifeline(sdInvocation);
				if (invocationLifeLine == null){
					throw new SDBuilderInternalProblem("Can't find lifeline for 'auxiliary' SDInvocation: " + sdInvocation);
				}
				myCallStack.pop(invocationLifeLine.getUmlLifeline());
			}
		}
	}

	private void buildExecutionSpecification(ExecutionSpecification umlExecutionSpec) {
		Lifeline umlLifeline = ensureSingleCovered(umlExecutionSpec);
		if (umlLifeline == null){
			warning("ExecutionSpecification without lifeline, ignored: " + umlExecutionSpec);
			return;
		}
		SDBracketContainer active = myCallStack.peek(umlLifeline);
		//it should be bracket for this execution spec;
		if (false == active instanceof SDBehaviorSpec){
			throw new UMLModelProblem("Lost ExecutionSpecification found: " + umlExecutionSpec + ", active bracket container :" + active);
		}
		SDBehaviorSpec activeSpec = (SDBehaviorSpec)active;
		if (activeSpec.getUmlExecutionSpec() != umlExecutionSpec){
			//in case of self message we can receive the umlSpec for invocation first, and it is not active 
			//because the active one is the inner execution
			if (!isSelfMessageExecution(activeSpec)){
				throw new UMLModelProblem("Lost ExecutionSpecification found: " + umlExecutionSpec + ", active bracket container :" + active);
			}
			SDExecution execution = (SDExecution)active;
			SDInvocation invocation = execution.getInvocation();
			if (umlExecutionSpec != invocation.getUmlExecutionSpec()){
				throw new UMLModelProblem("Self message found, but executionSpecification for its invocation is wrong: " + umlExecutionSpec + ", active bracket container :" + active + ", expected invocation execSpec: " + invocation.getUmlExecutionSpec());
			}
		}
		//everything is fine, we already have behaviorSpec for this umlExecutionSpec -- nothing to do
	}
	
	private boolean isSelfMessageExecution(SDBehaviorSpec spec){
		if (false == spec instanceof SDExecution){
			return false;
		}
		SDExecution execution = (SDExecution)spec;
		SDInvocation invocation = execution.getInvocation();
		if (invocation == null){
			return false;
		}
		
		Lifeline executionLL = ensureSingleCovered(execution.getUmlExecutionSpec());
		Lifeline invocationLL = ensureSingleCovered(invocation.getUmlExecutionSpec());
		
		return executionLL != null && executionLL == invocationLL;
	}
	
	private void buildMessageTarget(Iterator<InteractionFragment> orderedFragments, MessageOccurrenceSpecification messageTarget) {
		Message message = messageTarget.getMessage();
		MessageEnd sendEvent = message.getSendEvent();
		if (sendEvent == null){
			buildFoundMessage(messageTarget);
			return;
		}
		if (sendEvent instanceof Gate){
			buildGateMessage(messageTarget, (Gate)sendEvent, true);
			return;
		}
		
		MessageOccurrenceSpecification messageSource = (MessageOccurrenceSpecification) sendEvent;
		throw new UMLModelProblem("Message " + message + " is sent from the future: " + messageSource);
	}

	private void buildMessageSource(Iterator<InteractionFragment> orderedFragments, MessageOccurrenceSpecification messageSource) {
		Message message = messageSource.getMessage();
		MessageEnd receiveEvent = message.getReceiveEvent();
		if (receiveEvent == null) {
			buildLostMessage(messageSource);
			return;
		}
		if (receiveEvent instanceof Gate) {
			buildGateMessage(messageSource, (Gate) receiveEvent, false);
			return;
		}
		
		MessageOccurrenceSpecification messageTarget = (MessageOccurrenceSpecification) receiveEvent;
		boolean targetFound = false;
		while (orderedFragments.hasNext()) {
			InteractionFragment nextBetweenSendAndReceive = orderedFragments.next();
			if (nextBetweenSendAndReceive == messageTarget) {
				targetFound = true;
				break;
			}
			warning("Interaction fragment found between message send and receive for message: " + message + ", that is: " + nextBetweenSendAndReceive + ". Will be ignored");
		}

		if (!targetFound) {
			throw new UMLModelProblem("Message " + message + " is sent to the past");
		}
		
		if (message.getMessageSort() == MessageSort.REPLY_LITERAL){
			buildReplyMessage(orderedFragments, messageSource, messageTarget);
			return;
		} else {
			buildCompleteMessage(orderedFragments, messageSource, messageTarget);
			return;
		}
	}

	private void buildCompleteMessage(Iterator<InteractionFragment> orderedFragments, MessageOccurrenceSpecification messageSource, MessageOccurrenceSpecification messageTarget) {
		Message umlMessage = messageSource.getMessage();
		Lifeline umlSendingLifeline = ensureSingleCovered(messageSource);
		Lifeline umlReceivingLifeline = ensureSingleCovered(messageTarget);
		if (umlSendingLifeline == null){
			throw new UMLModelProblem("Message " + umlMessage + " has start :" + messageSource + " which does not belong to lifeline");
		}
		if (umlReceivingLifeline == null){
			throw new UMLModelProblem("Message " + umlMessage + " has target :" + messageTarget + " which does not belong to lifeline");
		}
		
		ExecutionSpecification umlInvocation = myStartsAndFinishes.findStartedExecution(messageSource); //may be null
		ExecutionSpecification umlExecution = myStartsAndFinishes.findStartedExecution(messageTarget);
		if (umlExecution == null){
			throw new UMLModelProblem("Message " + umlMessage + " does not have receiving ExecutionSpecification at receiveEvent: " + messageTarget);
		}
		
		SDMessage sdMessage = getTraceImpl().bindNewMessage(umlMessage);
		SDInvocation sdInvocation = getTraceImpl().bindNewInvocation(umlInvocation);
		SDExecution sdExecution = getTraceImpl().bindNewExecution(umlExecution);

		sdInvocation.setOutgoingMessage(sdMessage);
		sdExecution.setIncomingMessage(sdMessage);
		
		sdInvocation.setReceiveExecution(sdExecution);
		//sdExecution.setInvocation(sdInvocation); -- auto (bidi)
		
		sdExecution.setUmlStart(messageTarget);
		sdExecution.setUmlFinish(umlExecution.getFinish());
		
		if (umlInvocation != null){
			sdInvocation.setUmlStart(messageSource);
			sdInvocation.setUmlFinish(umlInvocation.getFinish());
		}
		
		mySDModel.getMessages().add(sdMessage);

		SDBracketContainer sdSendingContainer = myCallStack.peek(umlSendingLifeline);
		sdSendingContainer.getBrackets().add(sdInvocation);
		myCallStack.push(umlSendingLifeline, sdInvocation);
		
		//important to call after push for sending lifeline (consider self calls)
		SDBracketContainer sdReceivingContainer = myCallStack.peek(umlReceivingLifeline); 
		sdReceivingContainer.getBrackets().add(sdExecution);
		myCallStack.push(umlReceivingLifeline, sdExecution);
	}

	private void buildGateMessage(MessageOccurrenceSpecification umlMessageEnd, Gate umlGate, boolean fromNotToGate) {
		Lifeline umlLifeline = ensureSingleCovered(umlMessageEnd);
		if (umlLifeline == null) {
			warning("MessageOccurrenceSpecification without a lifeline: " + umlMessageEnd);
			return;
		}
		SDBracketContainer sdContainer = myCallStack.peek(umlLifeline);
		SDGateMessageEnd sdPureOccurrence = SDFactory.eINSTANCE.createSDGateMessageEnd();
		sdPureOccurrence.setUmlMessageEnd(umlMessageEnd);
		sdPureOccurrence.setIsStartNotFinish(!fromNotToGate);
		sdContainer.getBrackets().add(sdPureOccurrence);

		SDGateMessage sdMessageToGate = SDFactory.eINSTANCE.createSDGateMessage();
		sdMessageToGate.setUmlMessage(umlMessageEnd.getMessage());
		sdMessageToGate.setFromNotToGate(fromNotToGate);
		sdMessageToGate.setGate(SDModelHelper.findGate(mySDModel, umlGate));
		sdMessageToGate.setNormalEnd(sdPureOccurrence);

		mySDModel.getMessages().add(sdMessageToGate);
	}

	private void buildLostMessage(MessageOccurrenceSpecification messageSource) {
		unsupportedFragment(messageSource);
	}
	
	private void buildReplyMessage(Iterator<InteractionFragment> orderedFragments, MessageOccurrenceSpecification replySource, MessageOccurrenceSpecification replyTarget) {
		throw new SDBuilderInternalProblem("Reply-message is not supported: " + replySource.getMessage());
	}

	private void buildFoundMessage(MessageOccurrenceSpecification messageTarget) {
		unsupportedFragment(messageTarget);
	}

	private void unsupportedFragment(InteractionFragment fragment) {
		String metaclass = fragment.eClass().getName();
		throw new SDBuilderInternalProblem(metaclass + " is not supported: " + fragment);
	}

	private void buildSimpleNode(InteractionFragment umlFragment) {
		Lifeline umlLifeline = ensureSingleCovered(umlFragment);
		if (umlLifeline == null) {
			return;
		}
		SDBracketContainer sdContainer = myCallStack.peek(umlLifeline);
		SDSimpleNode sdInvariant = SDFactory.eINSTANCE.createSDSimpleNode();
		sdInvariant.setUmlFragment(umlFragment);
		sdContainer.getBrackets().add(sdInvariant);
	}
	
	private static Lifeline ensureSingleCovered(InteractionFragment fragment) {
		List<Lifeline> covered = fragment.getCovereds();
		if (covered.size() > 1) {
			throw new UMLModelProblem("Expected single covered lifeline for: " + fragment + ", actually: " + fragment.getCovereds());
		}
		return covered.isEmpty() ? null : covered.get(0);
	}
	
	private static void warning(String message) {
		//
	}
	
	private SDBuilderTrace getTraceImpl(){
		return (SDBuilderTrace) getSDFrame().getUMLTracing();
	}

}
