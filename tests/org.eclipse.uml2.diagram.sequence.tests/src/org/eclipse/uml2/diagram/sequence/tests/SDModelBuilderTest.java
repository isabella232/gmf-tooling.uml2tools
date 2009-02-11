package org.eclipse.uml2.diagram.sequence.tests;

import java.util.LinkedList;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.diagram.sequence.model.builder.LifeLineCallStack;
import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilderTrace;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;


public class SDModelBuilderTest extends TestCase {
	
	public void testPrecondition_LoadRedrawInteraction(){
		Package memoryGame = loadExampleFile(MEMORY_GAME_FILE);
		Interaction redraw = (Interaction)memoryGame.getPackagedElement("Redraw", true, UMLPackage.eINSTANCE.getInteraction(), false);
		assertNotNull(redraw);
	}
	
	public void testBuildNormalAndSelfMessage(){
		SDBuilder builder = buildFrame(MEMORY_GAME_FILE, "ReDraw"); 
		SDFrame sdFrame = builder.getSDFrame();
		
		assertTrue(sdFrame.getGates().isEmpty());
		assertFalse(sdFrame.getLifelines().isEmpty());
		assertFalse(sdFrame.getMessages().isEmpty());
		
		assertEquals(2, sdFrame.getLifelines().size());
		assertEquals(2, sdFrame.getMessages().size());
		
		SDMessage mouseClicked = (SDMessage) findMessageByName(sdFrame, "mouseClicked");
		SDMessage redraw = (SDMessage) findMessageByName(sdFrame, "reDraw");
		
		assertNotNull(redraw);
		assertNotNull(mouseClicked);
		assertFalse(redraw == mouseClicked);
		
		assertNotNull(mouseClicked.getSource());
		assertNotNull(mouseClicked.getTarget());

		assertNotNull(redraw.getSource());
		assertNotNull(redraw.getTarget());
		
		SDInvocation redrawInvocation = redraw.getSource();
		SDExecution redrawExecution = redraw.getTarget();
		
		assertNull(redrawInvocation.getUmlExecutionSpec());
		assertNotNull(redrawExecution.getUmlExecutionSpec());
		
		assertNotNull(SDModelHelper.findLifeline(redrawExecution));
		assertSame(SDModelHelper.findLifeline(redrawInvocation), SDModelHelper.findLifeline(redrawExecution));
		assertTrue(redrawInvocation.getBrackets().contains(redrawExecution));
	}
	
	public void testNormalMessageDetails(){
		SDBuilder builder = buildFrame(MEMORY_GAME_FILE, "ReDraw"); 
		SDFrame sdFrame = builder.getSDFrame();
		
		SDMessage redraw = (SDMessage) findMessageByName(sdFrame, "reDraw");
		
		assertNotNull(redraw);
		assertNotNull(redraw.getSource());
		assertNotNull(redraw.getTarget());
		
		SDInvocation redrawInvocation = redraw.getSource();
		SDExecution redrawExecution = redraw.getTarget();
		
		assertNull(redrawInvocation.getUmlExecutionSpec());
		assertNotNull(redrawExecution.getUmlExecutionSpec());
		
		assertNotNull(SDModelHelper.findLifeline(redrawExecution));
		assertSame(SDModelHelper.findLifeline(redrawInvocation), SDModelHelper.findLifeline(redrawExecution));
		assertTrue(redrawInvocation.getBrackets().contains(redrawExecution));
		
	}

	public void testSelfMessageDetails(){
		SDBuilder builder = buildFrame(MEMORY_GAME_FILE, "ReDraw"); 
		SDFrame sdFrame = builder.getSDFrame();
		
		SDMessage mouseClicked = (SDMessage) findMessageByName(sdFrame, "mouseClicked");
		assertNotNull(mouseClicked);
		
		SDInvocation mouseClickedInvocation = mouseClicked.getSource();
		SDExecution mouseClickedExecution = mouseClicked.getTarget();
		
		assertNotNull(mouseClickedExecution);
		assertNotNull(mouseClickedInvocation);
		
		assertNull(mouseClickedInvocation.getUmlExecutionSpec());
		assertNotNull(mouseClickedExecution.getUmlExecutionSpec());
		
		SDLifeLine sendingLifeline = SDModelHelper.findLifeline(mouseClickedInvocation);
		SDLifeLine receivingLifeline = SDModelHelper.findLifeline(mouseClickedExecution);
		
		assertNotNull(sendingLifeline);
		assertNotNull(receivingLifeline);
		assertNotSame(sendingLifeline, receivingLifeline);

		assertNotNull(sendingLifeline.getUmlLifeline());
		assertNotNull(receivingLifeline.getUmlLifeline());
		assertNotSame(sendingLifeline.getUmlLifeline(), receivingLifeline.getUmlLifeline());
		
		assertTrue(sendingLifeline.getBrackets().contains(mouseClickedInvocation));
		assertTrue(receivingLifeline.getBrackets().contains(mouseClickedExecution));
	}

	public void testCallStackCompleted(){
		SDBuilder builder = buildFrame(MEMORY_GAME_FILE, "ReDraw"); 
		checkCallStackCompleted(builder);
		checkTraces(builder);
	}
	
	public void testTwoMessagesCreatedFromDiagram(){
		SDBuilder builder = buildFrame("Two Messages Created From Diagram.uml", "Interaction");
		SDFrame sdFrame = builder.getSDFrame();
		
		SDLifeLine a = findLifeLineByName(sdFrame, "a");
		SDLifeLine b = findLifeLineByName(sdFrame, "b");
		
		assertEquals(2, a.getBrackets().size());
		assertEquals(2, b.getBrackets().size());
		
		for (SDBracket nextABracket : a.getBrackets()){
			assertTrue(nextABracket instanceof SDInvocation);
			SDInvocation invocation = (SDInvocation)nextABracket;
			assertTrue(invocation.getBrackets().isEmpty());
			assertNotNull(invocation.getOutgoingMessage());
			assertNotNull(invocation.getReceiveExecution());
			assertNotNull(invocation.getReceiveExecution().getIncomingMessage());
			assertSame(invocation.getOutgoingMessage(), invocation.getReceiveExecution().getIncomingMessage());
			assertEquals(a.getBrackets().indexOf(invocation), b.getBrackets().indexOf(invocation.getReceiveExecution()));
		}
		
		SDMessage firstMessage = null;
		SDMessage secondMessage = null;
		
		for (SDBracket nextBBracket : b.getBrackets()){
			assertTrue(nextBBracket instanceof SDExecution);
			SDExecution execution = (SDExecution)nextBBracket;
			
			assertTrue(execution.getBrackets().isEmpty());
			assertNotNull(execution.getIncomingMessage());
		
			if (firstMessage == null){
				firstMessage = execution.getIncomingMessage();
			} else {
				secondMessage = execution.getIncomingMessage();
			}
		}
		
		assertNotNull(firstMessage.getUmlMessage());
		assertNotNull(secondMessage.getUmlMessage());
		assertFalse(firstMessage == secondMessage);
		assertFalse(firstMessage.getUmlMessage() == secondMessage.getUmlMessage());
		
		assertEquals("1", firstMessage.getMessageNumber());
		assertEquals("2", secondMessage.getMessageNumber());

		checkCallStackCompleted(builder);
		checkTraces(builder);
	}
	
	public void testMessageChain_ABCD(){
		SDBuilder builder = buildFrame("Message Chain From Diagram - abcd.uml", "Interaction");
		SDFrame sdFrame = builder.getSDFrame();
		
		SDLifeLine a = findLifeLineByName(sdFrame, "a");
		SDLifeLine b = findLifeLineByName(sdFrame, "b");
		SDLifeLine c = findLifeLineByName(sdFrame, "c");
		SDLifeLine d = findLifeLineByName(sdFrame, "d");
		
		assertEquals(1, a.getBrackets().size());
		assertEquals(1, b.getBrackets().size());
		assertEquals(1, c.getBrackets().size());
		assertEquals(1, d.getBrackets().size());
		
		assertTrue(a.getBrackets().get(0) instanceof SDInvocation);
		assertTrue(b.getBrackets().get(0) instanceof SDExecution);
		assertTrue(c.getBrackets().get(0) instanceof SDExecution);
		assertTrue(d.getBrackets().get(0) instanceof SDExecution);
		
		SDInvocation rootInvocation = (SDInvocation) a.getBrackets().get(0);
		SDExecution bExecution = (SDExecution) b.getBrackets().get(0);
		checkInvocationExecutionPair(rootInvocation, bExecution);
		
		assertEquals(1, bExecution.getBrackets().size());
		assertTrue(bExecution.getBrackets().get(0) instanceof SDInvocation);
		SDInvocation bDeepInvocation = (SDInvocation) bExecution.getBrackets().get(0);
		SDExecution cExecution = (SDExecution)c.getBrackets().get(0);
		checkInvocationExecutionPair(bDeepInvocation, cExecution);
		
		assertEquals(1, cExecution.getBrackets().size());
		assertTrue(cExecution.getBrackets().get(0) instanceof SDInvocation);
		SDInvocation cDeepInvocation = (SDInvocation) cExecution.getBrackets().get(0);
		SDExecution dExecution = (SDExecution)d.getBrackets().get(0);
		checkInvocationExecutionPair(cDeepInvocation, dExecution);
		
		assertTrue(rootInvocation.getBrackets().isEmpty());
		assertTrue(bDeepInvocation.getBrackets().isEmpty());
		assertTrue(cDeepInvocation.getBrackets().isEmpty());
		assertTrue(dExecution.getBrackets().isEmpty());
		
		checkCallStackCompleted(builder);
		checkTraces(builder);
		
		assertEquals(3, sdFrame.getMessages().size());
		SDMessage ab = rootInvocation.getOutgoingMessage();
		SDMessage bc = bDeepInvocation.getOutgoingMessage();
		SDMessage cd = cDeepInvocation.getOutgoingMessage();
		
		assertNotNull(ab);
		assertNotNull(bc);
		assertNotNull(cd);
		assertTrue(ab != bc);
		assertTrue(ab != cd);
		assertTrue(bc != cd);
		
		assertEquals("1", ab.getMessageNumber());
		assertEquals("1.1", bc.getMessageNumber());
		assertEquals("1.1.1", cd.getMessageNumber());
		
		
	}
	
	protected void checkInvocationExecutionPair(SDInvocation invocation, SDExecution execution){
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
	
	protected SDAbstractMessage findMessageByName(SDFrame frame, String name){
		for (SDAbstractMessage next : frame.getMessages()){
			Message nextUML = next.getUmlMessage();
			if (name.equalsIgnoreCase(nextUML.getName())){
				return next;
			}
		}
		return null;
	}
	
	protected void checkCallStackCompleted(SDBuilder builder){
		SDFrame sdFrame = builder.getSDFrame();
		assertNotNull(sdFrame.getUmlInteraction());
		assertEquals(sdFrame.getUmlInteraction().getLifelines().size(), sdFrame.getLifelines().size());
		
		LifeLineCallStack callStack = builder.getCallStack();
		
		for (SDLifeLine nextLifeLine : sdFrame.getLifelines()){
			Lifeline umlLifeline = nextLifeLine.getUmlLifeline();
			assertNotNull(umlLifeline);
			assertSame("CallStack not completed for LL: " + umlLifeline, nextLifeLine, callStack.peek(umlLifeline));
		}
		
	}
	
	protected void checkTraces(SDBuilder builder){
		SDFrame frame = builder.getSDFrame();
		SDBuilderTrace trace = builder.getTrace();
		
		for (SDAbstractMessage next : frame.getMessages()){
			assertNotNull(next.getUmlMessage());
			assertSame(next, trace.findMessage(next.getUmlMessage()));
		}
		
		for (SDLifeLine next : frame.getLifelines()){
			assertNotNull(next.getUmlLifeline());
			assertSame(next, trace.findLifeLine(next.getUmlLifeline()));
		}
		
		LinkedList<SDBracketContainer> queue = new LinkedList<SDBracketContainer>();
		queue.addAll(frame.getLifelines());
		
		while(!queue.isEmpty()){
			SDBracketContainer next = queue.removeFirst();
			if (next instanceof SDBehaviorSpec){
				SDBehaviorSpec nextToCheck = (SDBehaviorSpec)next;
				if (nextToCheck.getUmlExecutionSpec() == null){
					assertTrue(nextToCheck instanceof SDInvocation);
				} else {
					assertSame(nextToCheck, trace.findBehaviorSpec(nextToCheck.getUmlExecutionSpec()));	
				}
			}
			
			for (SDBracket nextBracket : next.getBrackets()){
				if (nextBracket instanceof SDBracketContainer){
					queue.add((SDBracketContainer) nextBracket);
				}
			}
		}
	}
	
	protected SDLifeLine findLifeLineByName(SDFrame frame, String name){
		for (SDLifeLine next : frame.getLifelines()){
			Lifeline nextUML = next.getUmlLifeline();
			if (name.equalsIgnoreCase(nextUML.getName())){
				return next;
			}
		}
		fail("Can't find SDLifeline " + name);
		throw new InternalError("Never thrown");
	}

	private Package loadExampleFile(String example){
		URI uri = createExampleURI(example); 
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource semanticResource = resourceSet.getResource(uri, true);
		assertNotNull(semanticResource);
		assertFalse(semanticResource.getContents().isEmpty());
		assertTrue(semanticResource.getContents().get(0) instanceof Package);
		return (Package)semanticResource.getContents().get(0);
	}
	
	private SDBuilder buildFrame(String exampleFile, String interactionName) {
		Package pakkage = loadExampleFile(exampleFile);
		Interaction interaction = (Interaction)pakkage.getPackagedElement(interactionName, true, UMLPackage.eINSTANCE.getInteraction(), false);
		assertNotNull(interaction);
		
		SDBuilder builder = new SDBuilder(interaction);
		SDFrame sdFrame = builder.reBuildFrame();
		assertNotNull(sdFrame);
		assertSame(interaction, sdFrame.getUmlInteraction());
		return builder;
	}
	
	private URI createExampleURI(String fileName){
		return URI.createURI("platform:/plugin/org.eclipse.uml2.diagram.sequence.tests/examples/" + fileName);
	}
	
	private static final String MEMORY_GAME_FILE = "Testable Version Of MemoryGame Model.uml";
	
}
