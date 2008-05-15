package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteOperationNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteOperationNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testOperationInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool4 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool4.createTool(), 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("Class", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart5.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassOperationsEditPart.VISUAL_ID));
		assertNotNull(compartment3);
		ToolEntry tool5 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(1);
		createNodeByTool(tool5.createTool(), 200, 100);

		IGraphicalEditPart editPart6 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		assertNotNull(editPart6);
		assertEquals("Operation", getMetaclassName(editPart6));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
