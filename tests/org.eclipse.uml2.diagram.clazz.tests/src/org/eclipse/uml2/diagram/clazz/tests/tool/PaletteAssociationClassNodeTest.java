package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassRhombEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteAssociationClassNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteAssociationClassNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testAssociationClassRectangleOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool14 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(6);
		createNodeByTool(tool14.createTool(), 200, 100);

		IGraphicalEditPart editPart18 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		assertNotNull(editPart18);
		assertEquals("AssociationClass", getMetaclassName(editPart18));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testAssociationClassRhombOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool15 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(6);
		createNodeByTool(tool15.createTool(), 200, 100);

		IGraphicalEditPart editPart19 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(AssociationClassRhombEditPart.VISUAL_ID));
		assertNotNull(editPart19);
		assertEquals("AssociationClass", getMetaclassName(editPart19));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testAssociationClassInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2002"), 200, 100);

		IGraphicalEditPart editPart20 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart20);
		assertEquals("Package", getMetaclassName(editPart20));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment8 = editPart20.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment8);
		ToolEntry tool16 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(6);
		createNodeByTool(tool16.createTool(), 200, 100);

		IGraphicalEditPart editPart21 = compartment8.getChildBySemanticHint(UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		assertNotNull(editPart21);
		assertEquals("AssociationClass", getMetaclassName(editPart21));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
