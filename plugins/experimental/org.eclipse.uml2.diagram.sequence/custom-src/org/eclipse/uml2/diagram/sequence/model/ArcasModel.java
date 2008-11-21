package org.eclipse.uml2.diagram.sequence.model;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.UMLFactory;


public class ArcasModel {
	public static List<IndexedOccurrence> collectOccurrences(Lifeline lifeline){
		List<IndexedOccurrence> result = new LinkedList<IndexedOccurrence>();
		Interaction interaction = lifeline.getInteraction();
		int nextIndex = 0;
		for (InteractionFragment nextFragment : interaction.getFragments()){
			if (nextFragment instanceof OccurrenceSpecification){
				OccurrenceSpecification occur = (OccurrenceSpecification) nextFragment;
				if (occur.getCovereds().contains(lifeline)){
					result.add(new IndexedOccurrence(occur, nextIndex));
				}
			}
			nextIndex++;
		}
		return result;
	}	
	
	public static List<IndexedOccurrence> collectOccurrencesBetween(Lifeline lifeline, OccurrenceSpecification start, OccurrenceSpecification end){
		if (start != null && !start.getCovereds().contains(lifeline)){
			throw new IllegalArgumentException("Alien start: " + start);
		}
		
		if (end != null && !end.getCovereds().contains(lifeline)){
			throw new IllegalArgumentException("Alien end: " + end);
		}

		List<IndexedOccurrence> result = new LinkedList<IndexedOccurrence>();
		Interaction interaction = lifeline.getInteraction();
		int nextIndex = 0;
		boolean startFound = (start == null);
		for (InteractionFragment nextFragment : interaction.getFragments()){
			if (nextFragment instanceof OccurrenceSpecification){
				startFound |= (nextFragment == start);
				if (end != null && nextFragment == start){
					break;
				}
				
				OccurrenceSpecification occur = (OccurrenceSpecification) nextFragment;
				if (startFound && (start != occur) && occur.getCovereds().contains(lifeline)){
					result.add(new IndexedOccurrence(occur, nextIndex));
				}
			}
			nextIndex++;
		}
		return result;
	}	
	
	public static boolean isArcasInvocation(ExecutionSpecification spec){
		MessageOccurrenceSpecification start = (MessageOccurrenceSpecification) spec.getStart();
		Message message = ((MessageOccurrenceSpecification)start).getMessage();
		return message != null && message.getSendEvent() == start;
	}	
	
	public static ExecutionSpecification getOppositeInvocation(ExecutionSpecification spec){
		if (!isArcasExecution(spec)){
			throw new IllegalArgumentException("Arcas-Execution expected: " + spec);	
		}
		MessageOccurrenceSpecification sendingEnd = (MessageOccurrenceSpecification) spec.getStart();
		Message message = ((MessageOccurrenceSpecification)sendingEnd).getMessage();
		MessageOccurrenceSpecification receivingEnd = (MessageOccurrenceSpecification)message.getReceiveEvent();
		Lifeline lifeline = receivingEnd.getCovereds().get(0);
		
		for (InteractionFragment nextFragment : lifeline.getInteraction().getFragments()){
			if (nextFragment instanceof ExecutionSpecification){
				ExecutionSpecification candidate = (ExecutionSpecification)nextFragment;
				if (candidate.getStart() == receivingEnd){
					return candidate;
				}
			}
		}
		return null;
	}
	
	public static boolean isArcasExecution(ExecutionSpecification spec){
		MessageOccurrenceSpecification start = (MessageOccurrenceSpecification) spec.getStart();
		Message message = ((MessageOccurrenceSpecification)start).getMessage();
		return message != null && message.getReceiveEvent() == start;
	}
	
	public static class IndexedOccurrence {
		private final OccurrenceSpecification myOccurr;
		private final int myIndex;

		public IndexedOccurrence(OccurrenceSpecification occurr, int index){
			myOccurr = occurr;
			myIndex = index;
		}
		
		
		public int getIndex() {
			return myIndex;
		}
		
		public OccurrenceSpecification getOccurrence() {
			return myOccurr;
		}
	}
	
	public static interface Triada {
		public Message getMessage();
		public ExecutionSpecification getArcasInvocation();
		public ExecutionSpecification getArcasExecution();
	}
	
	private static class TriadaImpl implements Triada {
		private final ExecutionSpecification myArcasInvocation;
		private final ExecutionSpecification myArcasExecution;
		private final Message myMessage;

		public TriadaImpl(ExecutionSpecification arcasInvocation, Message message, ExecutionSpecification arcasExecution){
			myArcasInvocation = arcasInvocation;
			myMessage = message;
			myArcasExecution = arcasExecution;
			
			if (!isArcasInvocation(arcasInvocation)){
				throw new IllegalArgumentException("Not an invocation: " + arcasInvocation);
			}

			if (!isArcasExecution(arcasExecution)){
				throw new IllegalArgumentException("Not an arcas-execution: " + arcasExecution);
			}
		}
		
		public ExecutionSpecification getArcasExecution() {
			return myArcasExecution;
		}
		
		public ExecutionSpecification getArcasInvocation() {
			return myArcasInvocation;
		}
		
		public Message getMessage() {
			return myMessage;
		}
	}
	
	public static Triada createMessage(Lifeline source, Lifeline target, String messageName){
		MessageOccurrenceSpecification invocationStart = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		invocationStart.setName(messageName + "-InvocationStarted");
		
		MessageOccurrenceSpecification executionStart = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		executionStart.setName(messageName + "-ExecutionStarted");
		
		MessageOccurrenceSpecification executionEnd = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		executionEnd.setName(messageName + "-ExecutionFinished");
		
		MessageOccurrenceSpecification invocationEnd = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		invocationEnd.setName(messageName + "-InvocationFinished");
		
		ExecutionSpecification invocation = UMLFactory.eINSTANCE.createBehaviorExecutionSpecification();
		invocation.setName(messageName + "-invocation");
		ExecutionSpecification execution = UMLFactory.eINSTANCE.createBehaviorExecutionSpecification();
		execution.setName(messageName + "-execution");
		
		invocation.setStart(invocationStart);
		invocation.setFinish(invocationEnd);
		
		execution.setStart(executionStart);
		execution.setFinish(executionEnd);
		
		Interaction interaction = source.getInteraction();
		interaction.getFragments().add(invocationStart);
		interaction.getFragments().add(executionStart);
		interaction.getFragments().add(execution);
		interaction.getFragments().add(executionEnd);
		interaction.getFragments().add(invocation);
		interaction.getFragments().add(invocationEnd);
		
		invocationStart.getCovereds().add(source);
		invocationEnd.getCovereds().add(source);
		invocation.getCovereds().add(source);

		executionStart.getCovereds().add(target);
		executionEnd.getCovereds().add(target);
		execution.getCovereds().add(target);
		
		Message message = interaction.createMessage(messageName);
		message.setSendEvent(invocationStart);
		message.setReceiveEvent(executionStart);
		
		return new TriadaImpl(invocation, message, execution);
	}

}
