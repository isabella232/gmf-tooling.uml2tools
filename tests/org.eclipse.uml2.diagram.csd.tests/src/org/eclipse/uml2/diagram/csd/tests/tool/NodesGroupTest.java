package org.eclipse.uml2.diagram.csd.tests.tool;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;

public class NodesGroupTest extends CSDCreationToolTestBase {

	PaletteRoot myRoot = new PaletteRoot();

	Tool myCollaborationTool;

	Tool myClassTool;

	Tool myInterfaceTool;

	Tool myInstanceSpecificationTool;

	Tool myConstraintTool;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
		myCollaborationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0)).createTool();
		myClassTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1)).createTool();
		myInterfaceTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2)).createTool();
		myInstanceSpecificationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3)).createTool();
		myConstraintTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4)).createTool();
	}

	public NodesGroupTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testCollaborationOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myCollaborationTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationEditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Collaboration", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myClassTool, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Class", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testInterfaceOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myInterfaceTool, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Interface", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testInstanceSpecificationOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myInstanceSpecificationTool, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("InstanceSpecification", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testConstraintOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myConstraintTool, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("Constraint", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myClassTool, 200, 100);

		IGraphicalEditPart editPart6 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart6);
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart6.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassClassesEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myClassTool, 201, 101);

		IGraphicalEditPart editPart7 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("Class", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
