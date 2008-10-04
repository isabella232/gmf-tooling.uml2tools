package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteEnumerationNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteEnumerationNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testEnumerationOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool17 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2);
		createNodeByTool(tool17.createTool(), 200, 100);

		IGraphicalEditPart editPart22 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		assertNotNull(editPart22);
		assertEquals("Enumeration", getMetaclassName(editPart22));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testEnumerationInFramePackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2016"), 200, 100);

		IGraphicalEditPart editPart23 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameEditPart.VISUAL_ID));
		assertNotNull(editPart23);
		assertEquals("Package", getMetaclassName(editPart23));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment9 = editPart23.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContentsEditPart.VISUAL_ID));
		assertNotNull(compartment9);
		ToolEntry tool18 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2);
		//its impossible to create at (200, 100) -- see #249665
		Rectangle bounds = editPart23.getFigure().getBounds();
		createNodeByTool(tool18.createTool(), bounds.getCenter().x, bounds.getCenter().y);

		IGraphicalEditPart editPart24 = compartment9.getChildBySemanticHint(UMLVisualIDRegistry.getType(Enumeration3EditPart.VISUAL_ID));
		assertNotNull(editPart24);
		assertEquals("Enumeration", getMetaclassName(editPart24));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testEnumerationInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2002"), 200, 100);

		IGraphicalEditPart editPart25 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart25);
		assertEquals("Package", getMetaclassName(editPart25));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment10 = editPart25.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment10);
		ToolEntry tool19 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2);
		createNodeByTool(tool19.createTool(), 200, 100);

		IGraphicalEditPart editPart26 = compartment10.getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		assertNotNull(editPart26);
		assertEquals("Enumeration", getMetaclassName(editPart26));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
