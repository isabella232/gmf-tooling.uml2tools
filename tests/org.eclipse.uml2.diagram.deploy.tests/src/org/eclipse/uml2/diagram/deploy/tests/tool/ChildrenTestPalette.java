package org.eclipse.uml2.diagram.deploy.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationPropertiesEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.deploy.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry;

public class ChildrenTestPalette extends DeployDCreationToolTestBase {

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
	Tool myPropertyTool;

	/**
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myElementImportTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(0)).createTool();
		myPropertyTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(2)).getChildren().get(1)).createTool();
	}

	/**
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		myRoot = null;
		myElementImportTool = null;
		myPropertyTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public ChildrenTestPalette(String name) {
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
	public void testProperty() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.deploy.DeploymentSpecification_2007")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeploymentSpecificationEditPart.VISUAL_ID));
		assertNotNull(editPart3);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart3.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeploymentSpecificationPropertiesEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myPropertyTool, 201, 101);

		IGraphicalEditPart editPart4 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Property", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
