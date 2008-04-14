package org.eclipse.uml2.diagram.profile.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImport2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile3EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileProfileLabelsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeAttributesEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeConstraintsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.uml2.diagram.profile.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;

public class UMLGroupTest extends ProfileDCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myEnumerationTool;

	/**
	 * @generated
	 */
	Tool myGeneralizationTool;

	/**
	 * @generated
	 */
	Tool myPropertyTool;

	/**
	 * @generated
	 */
	Tool myConstraintTool;

	/**
	 * @generated
	 */
	Tool myLiteralTool;

	/**
	 * @generated
	 */
	Tool myElementImportTool;

	/**
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myEnumerationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(0)).createTool();
		myGeneralizationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(1)).createTool();
		myPropertyTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(2)).createTool();
		myConstraintTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(3)).createTool();
		myLiteralTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(4)).createTool();
		myElementImportTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(5)).createTool();
	}

	/**
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		myRoot = null;
		myEnumerationTool = null;
		myGeneralizationTool = null;
		myPropertyTool = null;
		myConstraintTool = null;
		myLiteralTool = null;
		myElementImportTool = null;

		super.tearDown();
	}

	/**
	 * @generated
	 */
	public UMLGroupTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	public void testEnumerationOnDiagram() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myEnumerationTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("Enumeration", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPropertyInStereotype() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.profile.Stereotype_2001")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		assertNotNull(editPart2);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart2.getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeAttributesEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myPropertyTool, 201, 101);

		IGraphicalEditPart editPart3 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Property", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testConstraintInStereotype() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.profile.Stereotype_2001")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		assertNotNull(editPart4);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart4.getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeConstraintsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myConstraintTool, 201, 101);

		IGraphicalEditPart editPart5 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("Constraint", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testEnumerationLiteralInEnumeration() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool3;
		tool3 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.profile.Enumeration_2003")));

		createNodeByTool(tool3, 200, 100);

		IGraphicalEditPart editPart6 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		assertNotNull(editPart6);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart6.getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationLiteralsEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myLiteralTool, 200, 100);

		IGraphicalEditPart editPart7 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("EnumerationLiteral", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testElementImport() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		IGraphicalEditPart editPart8 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Profile3EditPart.VISUAL_ID));
		assertNotNull(editPart8);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment4 = editPart8.getChildBySemanticHint(UMLVisualIDRegistry.getType(ProfileProfileLabelsEditPart.VISUAL_ID));
		assertNotNull(compartment4);

		createNodeByTool(myElementImportTool, 200, 100);

		IGraphicalEditPart editPart9 = compartment4.getChildBySemanticHint(UMLVisualIDRegistry.getType(ElementImport2EditPart.VISUAL_ID));
		assertNotNull(editPart9);
		assertEquals("ElementImport", getMetaclassName(editPart9));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
