package org.eclipse.uml2.diagram.sequence.tests;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.diagram.sequence.model.builder.LifeLineCallStack;
import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
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
	}
	
	public void testTwoMessagesCreatedFromDiagram(){
		SDBuilder builder = buildFrame("Two Messages Created From Diagram.uml", "Interaction");
		SDFrame sdFrame = builder.getSDFrame();
		
		SDLifeLine a = findLifeLineByName(sdFrame, "a");
		SDLifeLine b = findLifeLineByName(sdFrame, "b");
		
		assertNotNull(a);
		assertNotNull(b);
		
		assertEquals(2, a.getBrackets().size());
		assertEquals(2, b.getBrackets().size());
		
		for (SDBracket nextABracket : a.getBrackets()){
			assertTrue(nextABracket instanceof SDInvocation);
		}
		
		for (SDBracket nextBBracket : b.getBrackets()){
			assertTrue(nextBBracket instanceof SDExecution);
		}
		
		checkCallStackCompleted(builder);
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
	
	protected SDLifeLine findLifeLineByName(SDFrame frame, String name){
		for (SDLifeLine next : frame.getLifelines()){
			Lifeline nextUML = next.getUmlLifeline();
			if (name.equalsIgnoreCase(nextUML.getName())){
				return next;
			}
		}
		return null;
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
