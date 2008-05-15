package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteConstraintNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteConstraintNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testConstraintOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool13 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(5);
		createNodeByTool(tool13.createTool(), 200, 100);

		IGraphicalEditPart editPart17 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		assertNotNull(editPart17);
		assertEquals("Constraint", getMetaclassName(editPart17));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
