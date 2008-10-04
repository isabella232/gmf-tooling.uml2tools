package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PalettePackageNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PalettePackageNodeTest(String name) {
		super(name);
	}

	/**
	 * disabled now -- in 0.9.0 this creation shows popup menu and requires explicit user action
	 * @generated
	 */
	public void _testPackageOnDiagram() {
		
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool11 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1);
		createNodeByTool(tool11.createTool(), 200, 100);

		IGraphicalEditPart editPart14 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart14);
		assertEquals("Package", getMetaclassName(editPart14));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPackageInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2002"), 200, 100);

		IGraphicalEditPart editPart15 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart15);
		assertEquals("Package", getMetaclassName(editPart15));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment7 = editPart15.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackagePackagesEditPart.VISUAL_ID));
		assertNotNull(compartment7);
		ToolEntry tool12 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1);
		createNodeByTool(tool12.createTool(), 200, 100);

		IGraphicalEditPart editPart16 = compartment7.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		assertNotNull(editPart16);
		assertEquals("Package", getMetaclassName(editPart16));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
