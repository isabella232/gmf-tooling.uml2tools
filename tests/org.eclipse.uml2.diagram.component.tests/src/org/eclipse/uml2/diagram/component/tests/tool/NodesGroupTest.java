package org.eclipse.uml2.diagram.component.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.component.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

public class NodesGroupTest extends ComponentDCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myComponentTool;

	/**
	 * @generated
	 */
	Tool myArtifactTool;

	/**
	 * @generated
	 */
	Tool myInterfaceTool;

	/**
	 * @generated
	 */
	Tool myClassTool;

	/**
	 * @generated
	 */
	Tool myPartTool;

	/**
	 * @generated
	 */
	Tool myPackageTool;

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myComponentTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0)).createTool();
		myArtifactTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1)).createTool();
		myInterfaceTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2)).createTool();
		myClassTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3)).createTool();
		myPartTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4)).createTool();
		myPackageTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(5)).createTool();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		myRoot = null;
		myComponentTool = null;
		myArtifactTool = null;
		myInterfaceTool = null;
		myClassTool = null;
		myPartTool = null;
		myPackageTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public NodesGroupTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testComponentOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myComponentTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Component", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testArtifactOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myArtifactTool, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Artifact2EditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Artifact", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testInterfaceOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myInterfaceTool, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Interface", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myClassTool, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Class", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPartInComponent() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Component_2001")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart5);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart5.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myPartTool, 201, 170);

		IGraphicalEditPart editPart6 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart6);
		assertEquals("Property", getMetaclassName(editPart6));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPackageOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myPackageTool, 200, 100);

		IGraphicalEditPart editPart7 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("Package", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
