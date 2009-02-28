package org.eclipse.uml2.diagram.sequence.tests;

import java.util.LinkedList;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.diagram.sequence.model.builder.LifeLineCallStack;
import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;


public class AbstractSDModelBuilderTest extends TestCase {

	protected final Package loadExampleFile(String example) {
		URI uri = createExampleURI(example);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource semanticResource = resourceSet.getResource(uri, true);
		assertNotNull(semanticResource);
		assertFalse(semanticResource.getContents().isEmpty());
		assertTrue(semanticResource.getContents().get(0) instanceof Package);
		return (Package) semanticResource.getContents().get(0);
	}

	protected final SDBuilder buildFrame(String exampleFile, String interactionName) {
		Package pakkage = loadExampleFile(exampleFile);
		Interaction interaction = (Interaction) pakkage.getPackagedElement(interactionName, true, UMLPackage.eINSTANCE.getInteraction(), false);
		assertNotNull(interaction);

		SDBuilder builder = new SDBuilder(interaction);
		SDModel sdModel = builder.getSDModel();
		assertNotNull(sdModel);
		assertSame(interaction, sdModel.getUmlInteraction());
		return builder;
	}
	
	protected final void checkExpectedMessage(SDBracket expectedInvocation, SDBracket expectedExecution) {
		assertTrue(expectedExecution instanceof SDExecution);
		assertTrue(expectedInvocation instanceof SDInvocation);
		checkInvocationExecutionPair((SDInvocation)expectedInvocation, (SDExecution)expectedExecution);
	}
	
	protected final void checkInvocationExecutionPair(SDInvocation invocation, SDExecution execution) {
		assertNotNull(invocation);
		assertNotNull(execution);
		assertNotNull(invocation.getUmlExecutionSpec());
		assertNotNull(execution.getUmlExecutionSpec());

		assertSame(execution, invocation.getReceiveExecution());
		assertSame(invocation, execution.getInvocation());
		assertSame(invocation.getOutgoingMessage(), execution.getIncomingMessage());

		SDMessage sdMessage = execution.getIncomingMessage();
		assertNotNull(sdMessage);
		assertNotNull(sdMessage.getUmlMessage());

		assertSame(invocation.getUmlExecutionSpec().getStart(), sdMessage.getUmlMessage().getSendEvent());
		assertSame(execution.getUmlExecutionSpec().getStart(), sdMessage.getUmlMessage().getReceiveEvent());
	}

	protected SDAbstractMessage findMessageByName(SDModel frame, String name) {
		for (SDAbstractMessage next : frame.getMessages()) {
			Message nextUML = next.getUmlMessage();
			if (name.equalsIgnoreCase(nextUML.getName())) {
				return next;
			}
		}
		return null;
	}

	protected void checkCallStackCompleted(SDBuilder builder) {
		SDModel sdModel = builder.getSDModel();
		assertNotNull(sdModel.getUmlInteraction());
		assertEquals(sdModel.getUmlInteraction().getLifelines().size(), sdModel.getLifelines().size());

		LifeLineCallStack callStack = builder.getCallStack();

		for (SDLifeLine nextLifeLine : sdModel.getLifelines()) {
			Lifeline umlLifeline = nextLifeLine.getUmlLifeline();
			assertNotNull(umlLifeline);
			assertSame("CallStack not completed for LL: " + umlLifeline, nextLifeLine, callStack.peek(umlLifeline));
		}

	}

	protected final void checkTraces(SDBuilder builder) {
		SDModel frame = builder.getSDModel();
		SDTrace trace = frame.getUMLTracing();

		for (SDAbstractMessage next : frame.getMessages()) {
			assertNotNull(next.getUmlMessage());
			assertSame(next, trace.findMessage(next.getUmlMessage()));
		}

		for (SDLifeLine next : frame.getLifelines()) {
			assertNotNull(next.getUmlLifeline());
			assertSame(next, trace.findLifeLine(next.getUmlLifeline()));
		}

		LinkedList<SDBracketContainer> queue = new LinkedList<SDBracketContainer>();
		queue.addAll(frame.getLifelines());

		while (!queue.isEmpty()) {
			SDBracketContainer next = queue.removeFirst();
			if (next instanceof SDBehaviorSpec) {
				SDBehaviorSpec nextToCheck = (SDBehaviorSpec) next;
				if (nextToCheck.getUmlExecutionSpec() == null) {
					assertTrue(nextToCheck instanceof SDInvocation);
				} else {
					assertSame(nextToCheck, trace.findBehaviorSpec(nextToCheck.getUmlExecutionSpec()));
				}
			}

			for (SDBracket nextBracket : next.getBrackets()) {
				if (nextBracket instanceof SDBracketContainer) {
					queue.add((SDBracketContainer) nextBracket);
				}
			}
		}
	}

	protected final SDLifeLine findLifeLineByName(SDModel frame, String name) {
		for (SDLifeLine next : frame.getLifelines()) {
			Lifeline nextUML = next.getUmlLifeline();
			if (name.equalsIgnoreCase(nextUML.getName())) {
				return next;
			}
		}
		fail("Can't find SDLifeline " + name);
		throw new InternalError("Never thrown");
	}

	private URI createExampleURI(String fileName) {
		return URI.createURI("platform:/plugin/org.eclipse.uml2.diagram.sequence.tests/examples/" + fileName);
	}
}
