package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

public class PaletteClassNodeTest extends ClassDiagramCreationToolTest {

	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PaletteClassNodeTest(String name) {
		super(name);
	}


	/**
	 * @generated
	 */
	public void testClassOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool6 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool6.createTool(), 200, 100);

		IGraphicalEditPart editPart7 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("Class", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool7 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool7.createTool(), 200, 100);

		IGraphicalEditPart editPart8 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart8);
		assertEquals("Class", getMetaclassName(editPart8));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment4 = editPart8.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassClassesEditPart.VISUAL_ID));
		assertNotNull(compartment4);
		ToolEntry tool8 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool8.createTool(), 200, 100);

		IGraphicalEditPart editPart9 = compartment4.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		assertNotNull(editPart9);
		assertEquals("Class", getMetaclassName(editPart9));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInInterface() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Interface_2013"), 200, 100);

		IGraphicalEditPart editPart10 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull(editPart10);
		assertEquals("Interface", getMetaclassName(editPart10));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment5 = editPart10.getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceClassesEditPart.VISUAL_ID));
		assertNotNull(compartment5);
		ToolEntry tool9 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool9.createTool(), 200, 100);

		IGraphicalEditPart editPart11 = compartment5.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class4EditPart.VISUAL_ID));
		assertNotNull(editPart11);
		assertEquals("Class", getMetaclassName(editPart11));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInFramePackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Package_2016"), 200, 100);

		IGraphicalEditPart editPart12 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameEditPart.VISUAL_ID));
		assertNotNull(editPart12);
		assertEquals("Package", getMetaclassName(editPart12));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment6 = editPart12.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContentsEditPart.VISUAL_ID));
		assertNotNull(compartment6);
		ToolEntry tool10 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool10.createTool(), 200, 100);

		IGraphicalEditPart editPart13 = compartment6.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class5EditPart.VISUAL_ID));
		assertNotNull(editPart13);
		assertEquals("Class", getMetaclassName(editPart13));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
