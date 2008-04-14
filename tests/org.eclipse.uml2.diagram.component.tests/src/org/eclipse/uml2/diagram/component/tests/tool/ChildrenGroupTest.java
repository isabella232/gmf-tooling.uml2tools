package org.eclipse.uml2.diagram.component.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.component.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationOperationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationPropertyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortOnClassEditPart;
import org.eclipse.uml2.diagram.component.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

public class ChildrenGroupTest extends ComponentDCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myElementImportTool;

	/**
	 * @generated
	 */
	Tool myAttributeTool;

	/**
	 * @generated
	 */
	Tool myOperationTool;

	/**
	 * @generated
	 */
	Tool myPortTool;

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myElementImportTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(0)).createTool();
		myAttributeTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(1)).createTool();
		myOperationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(2)).createTool();
		myPortTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(3)).createTool();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		myRoot = null;
		myElementImportTool = null;
		myAttributeTool = null;
		myOperationTool = null;
		myPortTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public ChildrenGroupTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testElementImport() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		assertNotNull(editPart1);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart1.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageImportsEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myElementImportTool, 10, 10);

		IGraphicalEditPart editPart2 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(ElementImportEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("ElementImport", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPropertyInClassDiagramNotation() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Class_2007")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationClassEditPart.VISUAL_ID));
		assertNotNull(editPart3);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart3.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myAttributeTool, 201, 101);

		IGraphicalEditPart editPart4 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationPropertyEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Class", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testOperationInClassDiagramNotation() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Class_2007")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationClassEditPart.VISUAL_ID));
		assertNotNull(editPart5);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart5.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassOperationsEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myOperationTool, 201, 101);

		IGraphicalEditPart editPart6 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationOperationEditPart.VISUAL_ID));
		assertNotNull(editPart6);
		assertEquals("Operation", getMetaclassName(editPart6));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPortOnClassDiagramNotation() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool3;
		tool3 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Class_2007")));

		createNodeByTool(tool3, 200, 100);

		IGraphicalEditPart editPart7 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationClassEditPart.VISUAL_ID));
		assertNotNull(editPart7);

		getDiagramEditPart().getViewer().flush();

		createNodeByTool(myPortTool, 201, 101);

		IGraphicalEditPart editPart8 = editPart7.getChildBySemanticHint(UMLVisualIDRegistry.getType(PortOnClassEditPart.VISUAL_ID));
		assertNotNull(editPart8);
		assertEquals("Port", getMetaclassName(editPart8));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
