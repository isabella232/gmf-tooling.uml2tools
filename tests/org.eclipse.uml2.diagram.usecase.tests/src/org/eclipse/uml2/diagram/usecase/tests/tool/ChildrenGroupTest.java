package org.eclipse.uml2.diagram.usecase.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.usecase.edit.parts.DiagramHeaderEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPoint2EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPointEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;

public class ChildrenGroupTest extends UseCaseCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myExtensionPointTool;

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
		myExtensionPointTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(0)).createTool();
		myElementImportTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(1)).createTool();
	}

	/**
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		myRoot = null;
		myExtensionPointTool = null;
		myElementImportTool = null;

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

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DiagramHeaderEditPart.VISUAL_ID));
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
	public void testExtPointInUseCase() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.UseCase_2003")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseEditPart.VISUAL_ID));
		assertNotNull(editPart3);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart3.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseExtensionPointsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myExtensionPointTool, 200, 100);

		IGraphicalEditPart editPart4 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExtensionPointEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("ExtensionPoint", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testExtPointInUseCaseAsClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.UseCase_2004")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseAsClassEditPart.VISUAL_ID));
		assertNotNull(editPart5);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart5.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseAsClassExtensionPointsEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myExtensionPointTool, 200, 100);

		IGraphicalEditPart editPart6 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExtensionPoint2EditPart.VISUAL_ID));
		assertNotNull(editPart6);
		assertEquals("ExtensionPoint", getMetaclassName(editPart6));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
