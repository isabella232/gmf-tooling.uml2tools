package org.eclipse.uml2.diagram.deploy.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Device2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontentsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironment2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifactsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Node2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeEditPart;
import org.eclipse.uml2.diagram.deploy.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry;

public class NodeTestPalette extends DeployDCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myArtifactTool;

	/**
	 * @generated
	 */
	Tool myDeviceTool;

	/**
	 * @generated
	 */
	Tool myNodeTool;

	/**
	 * @generated
	 */
	Tool myEnvironmentTool;

	/**
	 * @generated
	 */
	Tool mySpecificationTool;

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myArtifactTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0)).createTool();
		myDeviceTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1)).createTool();
		myNodeTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2)).createTool();
		myEnvironmentTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3)).createTool();
		mySpecificationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4)).createTool();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		myRoot = null;
		myArtifactTool = null;
		myDeviceTool = null;
		myNodeTool = null;
		myEnvironmentTool = null;
		mySpecificationTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public NodeTestPalette(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testArtifactOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myArtifactTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Artifact2EditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Artifact", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testDeviceOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myDeviceTool, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Device", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testNodeOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myNodeTool, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(NodeEditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Node", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testEnvironmentOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myEnvironmentTool, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExecutionEnvironmentEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("ExecutionEnvironment", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testSpecificationOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(mySpecificationTool, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeploymentSpecificationEditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("DeploymentSpecification", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testArtifactInDevice() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.Device_2003")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart6 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
		assertNotNull(editPart6);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart6.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceDevicecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myArtifactTool, 201, 101);

		IGraphicalEditPart editPart7 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("Artifact", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testArtifactInEnvironment() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.ExecutionEnvironment_2005")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart8 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExecutionEnvironmentEditPart.VISUAL_ID));
		assertNotNull(editPart8);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart8.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExecutionEnvironmentArtifactsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myArtifactTool, 201, 101);

		IGraphicalEditPart editPart9 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(Artifact3EditPart.VISUAL_ID));
		assertNotNull(editPart9);
		assertEquals("Artifact", getMetaclassName(editPart9));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testDeviceInDevice() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool3;
		tool3 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.Device_2003")));

		createNodeByTool(tool3, 200, 100);

		IGraphicalEditPart editPart10 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
		assertNotNull(editPart10);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart10.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceDevicecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myDeviceTool, 201, 150);

		IGraphicalEditPart editPart11 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(Device2EditPart.VISUAL_ID));
		assertNotNull(editPart11);
		assertEquals("Device", getMetaclassName(editPart11));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testNodeInDevice() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool4;
		tool4 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.Device_2003")));

		createNodeByTool(tool4, 200, 100);

		IGraphicalEditPart editPart12 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
		assertNotNull(editPart12);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment4 = editPart12.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceDevicecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment4);

		createNodeByTool(myNodeTool, 201, 150);

		IGraphicalEditPart editPart13 = compartment4.getChildBySemanticHint(UMLVisualIDRegistry.getType(Node2EditPart.VISUAL_ID));
		assertNotNull(editPart13);
		assertEquals("Node", getMetaclassName(editPart13));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testEnvironmentInDevice() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool5;
		tool5 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.Device_2003")));

		createNodeByTool(tool5, 200, 100);

		IGraphicalEditPart editPart14 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceEditPart.VISUAL_ID));
		assertNotNull(editPart14);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment5 = editPart14.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeviceDevicecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment5);

		createNodeByTool(myEnvironmentTool, 201, 150);

		IGraphicalEditPart editPart15 = compartment5.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExecutionEnvironment2EditPart.VISUAL_ID));
		assertNotNull(editPart15);
		assertEquals("ExecutionEnvironment", getMetaclassName(editPart15));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
