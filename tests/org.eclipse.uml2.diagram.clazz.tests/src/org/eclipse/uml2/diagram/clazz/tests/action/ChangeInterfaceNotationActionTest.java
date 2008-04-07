package org.eclipse.uml2.diagram.clazz.tests.action;

import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.action.TurnIntoInterface2Action;
import org.eclipse.uml2.diagram.clazz.action.TurnIntoInterfaceAction;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.clazz.tests.tool.ClassDiagramCreationToolTest;

public class ChangeInterfaceNotationActionTest extends ClassDiagramCreationToolTest {

	public ChangeInterfaceNotationActionTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}	
	
	private void createRoundInterface() {
		createNodeByTool(UMLElementTypes.Interface_2010);
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull("Round Interface should be created after tool invocation.", interfaze);
	}

	private void createRectangleInterface() {
		createNodeByTool(UMLElementTypes.Interface_2013);
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull("Rectangle Interface should be created after tool invocation.", interfaze);
	}
	private void runTurnIntoRectangleAction() {
		assertFalse("Selection should not be empty to run action correctly.", getDiagramEditPart().getViewer().getSelection().isEmpty());
		DiagramAction action = new TurnIntoInterface2Action(getWorkbenchPage(), "testID");
		action.init();
		assertTrue("Action should be enabled in correct cases.", action.isEnabled());
		action.run();
	}
	
	private void runTurnIntoCircleAction() {
		assertFalse("Selection should not be empty to run action correctly.", getDiagramEditPart().getViewer().getSelection().isEmpty());
		DiagramAction action = new TurnIntoInterfaceAction(getWorkbenchPage(), "testID");
		action.init();
		assertTrue("Action should be enabled in correct cases.", action.isEnabled());
		action.run();
	}

	public void testChangeToRectangleNotationAction1() {
		createRoundInterface();
		runTurnIntoRectangleAction();
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNull(interfaze);
	}

	public void testChangeToRectangleNotationAction2() {
		createRoundInterface();
		runTurnIntoRectangleAction();
		IGraphicalEditPart interfaze2 = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull(interfaze2);
	}
	public void testChangeToCircleNotationAction1() {
		createRectangleInterface();
		runTurnIntoCircleAction();
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull(interfaze);
	}

	public void testChangeToCircleNotationAction2() {
		createRectangleInterface();
		runTurnIntoCircleAction();
		IGraphicalEditPart interfaze2 = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNull(interfaze2);
	}

	public void testChangeToRectangleNotationAction3() {
		createNodeByTool(UMLElementTypes.Class_2001);
		DiagramAction action = new TurnIntoInterface2Action(getWorkbenchPage(), "testID");
		action.init();
		action.refresh();
		assertFalse("Action should be disabled on non-Interface elements.", action.isEnabled());
	}

}
