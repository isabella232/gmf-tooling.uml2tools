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
	}

	private void createRoundInterface() {
		createNodeByTool(UMLElementTypes.Interface_2010);
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull("#225976. Round Interface was not created by an appropriate tool.", interfaze);
	}

	private void createRectangleInterface() {
		createNodeByTool(UMLElementTypes.Interface_2013);
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull("#225976. Rectangle Interface was not created by an appropriate tool.", interfaze);
	}

	private void runTurnIntoRectangleAction() {
		assertFalse("Full selection selection is a precondition to successfully run action.", getSelection().isEmpty());
		DiagramAction action = new TurnIntoInterface2Action(getWorkbenchPage(), "testID");
		action.init();
		assertTrue("TurnIntoRectangle Action should be enabled for the Rectangle Interface.", action.isEnabled());
		action.run();
	}

	private void runTurnIntoCircleAction() {
		assertFalse("Full selection selection is a precondition to successfully run action.", getSelection().isEmpty());
		DiagramAction action = new TurnIntoInterfaceAction(getWorkbenchPage(), "testID");
		action.init();
		assertTrue("TurnIntoCircle Action should be enabled for the Rectangle Interface.", action.isEnabled());
		action.run();
	}

	public void testChangeToRectangleNotationAction1() {
		createRoundInterface();
		runTurnIntoRectangleAction();
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNull("Circle interface should be deleted. ", interfaze);
	}

	public void testChangeToRectangleNotationAction2() {
		createRoundInterface();
		runTurnIntoRectangleAction();
		IGraphicalEditPart interfaze2 = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull("Rectangle interface should be deleted. ", interfaze2);
	}

	public void testChangeToCircleNotationAction1() {
		createRectangleInterface();
		runTurnIntoCircleAction();
		IGraphicalEditPart interfaze = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull("Circle interface should be created. ", interfaze);
	}

	public void testChangeToCircleNotationAction2() {
		createRectangleInterface();
		runTurnIntoCircleAction();
		IGraphicalEditPart interfaze2 = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNull("Rectangle interface should be deleted. ", interfaze2);
	}

	public void testChangeInterfaceNotationIsChecked() {
		createRoundInterface();
		DiagramAction action = new TurnIntoInterfaceAction(getWorkbenchPage(), "testID");
		action.init();
		action.refresh();
		assertTrue("Turn into round interface Action should be checked for round interface.", action.isChecked());
	}

	public void testChangeInterfaceNotationIsUnChecked() {
		createRoundInterface();
		DiagramAction action = new TurnIntoInterface2Action(getWorkbenchPage(), "testID");
		action.init();
		action.refresh();
		assertFalse("Turn into rectangle interface Action should be un-checked for round interface elements.", action.isChecked());
	}

}
