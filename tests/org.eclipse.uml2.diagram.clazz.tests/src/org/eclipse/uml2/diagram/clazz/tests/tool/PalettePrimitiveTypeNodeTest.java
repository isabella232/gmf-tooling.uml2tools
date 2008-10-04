package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PalettePrimitiveTypeNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PalettePrimitiveTypeNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testPrimitiveTypeOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool23 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4);
		createNodeByTool(tool23.createTool(), 200, 100);

		IGraphicalEditPart editPart32 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		assertNotNull(editPart32);
		assertEquals("PrimitiveType", getMetaclassName(editPart32));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPrimitiveTypeInFramePackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2016"), 200, 100);

		IGraphicalEditPart editPart33 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameEditPart.VISUAL_ID));
		assertNotNull(editPart33);
		assertEquals("Package", getMetaclassName(editPart33));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment13 = editPart33.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContentsEditPart.VISUAL_ID));
		assertNotNull(compartment13);
		ToolEntry tool24 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4);
		//its impossible to create at (200, 100) -- see #249665
		Rectangle bounds = editPart33.getFigure().getBounds();
		createNodeByTool(tool24.createTool(), bounds.getCenter().x, bounds.getCenter().y);

		IGraphicalEditPart editPart34 = compartment13.getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveType3EditPart.VISUAL_ID));
		assertNotNull(editPart34);
		assertEquals("PrimitiveType", getMetaclassName(editPart34));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPrimitiveTypeInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2002"), 200, 100);

		IGraphicalEditPart editPart35 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart35);
		assertEquals("Package", getMetaclassName(editPart35));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment14 = editPart35.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment14);
		ToolEntry tool25 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4);
		createNodeByTool(tool25.createTool(), 200, 100);

		IGraphicalEditPart editPart36 = compartment14.getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		assertNotNull(editPart36);
		assertEquals("PrimitiveType", getMetaclassName(editPart36));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
