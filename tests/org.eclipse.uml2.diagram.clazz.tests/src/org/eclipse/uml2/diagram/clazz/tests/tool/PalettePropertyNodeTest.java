package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;


public class PalettePropertyNodeTest extends ClassDiagramCreationToolTest {
	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PalettePropertyNodeTest(String name) {
		super(name);
	}
	
	/**
	 * @generated
	 */
	public void testPropertyInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool1 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool1.createTool(), 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Class", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart1.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		assertNotNull(compartment1);
		ToolEntry tool2 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(0);
		createNodeByTool(tool2.createTool(), 200, 100);

		IGraphicalEditPart editPart2 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Property", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPropertyInClass2() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry tool3 = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(tool3.createTool(), 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Class", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart3.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		assertNotNull(compartment2);
		createNodeByTool(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.clazz.Property_3001"), 200, 100);

		IGraphicalEditPart editPart4 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Property", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}

}
