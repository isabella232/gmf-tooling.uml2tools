package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteDataTypeNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteDataTypeNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testDataTypeOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool20 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3);
		createNodeByTool(tool20.createTool(), 200, 100);

		IGraphicalEditPart editPart27 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		assertNotNull(editPart27);
		assertEquals("DataType", getMetaclassName(editPart27));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testDataTypeInFramePackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2016"), 200, 100);

		IGraphicalEditPart editPart28 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameEditPart.VISUAL_ID));
		assertNotNull(editPart28);
		assertEquals("Package", getMetaclassName(editPart28));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment11 = editPart28.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContentsEditPart.VISUAL_ID));
		assertNotNull(compartment11);
		ToolEntry tool21 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3);
		createNodeByTool(tool21.createTool(), 200, 100);

		IGraphicalEditPart editPart29 = compartment11.getChildBySemanticHint(UMLVisualIDRegistry.getType(DataType3EditPart.VISUAL_ID));
		assertNotNull(editPart29);
		assertEquals("DataType", getMetaclassName(editPart29));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testDataTypeInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2002"), 200, 100);

		IGraphicalEditPart editPart30 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart30);
		assertEquals("Package", getMetaclassName(editPart30));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment12 = editPart30.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment12);
		ToolEntry tool22 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3);
		createNodeByTool(tool22.createTool(), 200, 100);

		IGraphicalEditPart editPart31 = compartment12.getChildBySemanticHint(UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		assertNotNull(editPart31);
		assertEquals("DataType", getMetaclassName(editPart31));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
