package org.eclipse.uml2.diagram.profile.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileContentsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.uml2.diagram.profile.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;

public class ProfileGroupTest extends ProfileDCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myProfileTool;

	/**
	 * @generated
	 */
	Tool myStereotypeTool;

	/**
	 * @generated
	 */
	Tool myMetaclassTool;

	/**
	 * @generated
	 */
	Tool myExtensionTool;

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myProfileTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0)).createTool();
		myStereotypeTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1)).createTool();
		myMetaclassTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2)).createTool();
		myExtensionTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3)).createTool();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		myRoot = null;
		myProfileTool = null;
		myStereotypeTool = null;
		myMetaclassTool = null;
		myExtensionTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public ProfileGroupTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testProfileOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myProfileTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Profile2EditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Profile", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testStereotypeOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myStereotypeTool, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Stereotype", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testMetaclassOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myMetaclassTool, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ElementImportEditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("ElementImport", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testStereotypeInProfile() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.profile.Profile_2002")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Profile2EditPart.VISUAL_ID));
		assertNotNull(editPart4);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart4.getChildBySemanticHint(UMLVisualIDRegistry.getType(ProfileContentsEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myStereotypeTool, 200, 100);

		IGraphicalEditPart editPart5 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("Stereotype", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
