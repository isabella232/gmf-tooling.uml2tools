package org.eclipse.uml2.diagram.usecase.tests.tool;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorInPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.InnerUseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.NestedPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageFramecontentsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectUsecasesEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseinPackageEditPart;
import org.eclipse.uml2.diagram.usecase.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;

public class NodesGroupTest extends UseCaseCreationToolTestBase {

	/**
	 * @generated
	 */
	PaletteRoot myRoot;

	/**
	 * @generated
	 */
	Tool myUseCaseTool;

	/**
	 * @generated
	 */
	Tool myActorTool;

	/**
	 * @generated
	 */
	Tool mySubjectTool;

	/**
	 * @generated
	 */
	Tool myPackageTool;

	/**
	 * @generated
	 */
	Tool myConstraintTool;

	/**
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();
		myRoot = new PaletteRoot();
		new UMLPaletteFactory().fillPalette(myRoot);
		myUseCaseTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0)).createTool();
		myActorTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(1)).createTool();
		mySubjectTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(2)).createTool();
		myPackageTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(3)).createTool();
		myConstraintTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(4)).createTool();
	}

	/**
	 * @generated
	 */
	protected void tearDown() throws Exception {
		myRoot = null;
		myUseCaseTool = null;
		myActorTool = null;
		mySubjectTool = null;
		myPackageTool = null;
		myConstraintTool = null;

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
	public void testUseCaseInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myUseCaseTool, 200, 100);

		IGraphicalEditPart editPart1 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseEditPart.VISUAL_ID));
		assertNotNull(editPart1);
		assertEquals("UseCase", getMetaclassName(editPart1));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testActorInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myActorTool, 200, 100);

		IGraphicalEditPart editPart2 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ActorEditPart.VISUAL_ID));
		assertNotNull(editPart2);
		assertEquals("Actor", getMetaclassName(editPart2));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testSubjectInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(mySubjectTool, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(SubjectEditPart.VISUAL_ID));
		assertNotNull(editPart3);
		assertEquals("Component", getMetaclassName(editPart3));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPackageInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myPackageTool, 200, 100);

		IGraphicalEditPart editPart4 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(NestedPackageEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Package", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testConstraintInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myConstraintTool, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		assertNotNull(editPart5);
		assertEquals("Constraint", getMetaclassName(editPart5));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testUseCaseInSubject() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(mySubjectTool, 200, 100);

		IGraphicalEditPart editPart6 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(SubjectEditPart.VISUAL_ID));
		assertNotNull(editPart6);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment1 = editPart6.getChildBySemanticHint(UMLVisualIDRegistry.getType(SubjectUsecasesEditPart.VISUAL_ID));
		assertNotNull(compartment1);

		createNodeByTool(myUseCaseTool, 201, 130);

		IGraphicalEditPart editPart7 = compartment1.getChildBySemanticHint(UMLVisualIDRegistry.getType(InnerUseCaseEditPart.VISUAL_ID));
		assertNotNull(editPart7);
		assertEquals("UseCase", getMetaclassName(editPart7));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testUseCaseInNestedPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myPackageTool, 200, 100);

		IGraphicalEditPart editPart8 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(NestedPackageEditPart.VISUAL_ID));
		assertNotNull(editPart8);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart8.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageFramecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myUseCaseTool, 201, 130);

		IGraphicalEditPart editPart9 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(UseCaseinPackageEditPart.VISUAL_ID));
		assertNotNull(editPart9);
		assertEquals("UseCase", getMetaclassName(editPart9));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testActorInNestedPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		createNodeByTool(myPackageTool, 200, 100);

		IGraphicalEditPart editPart10 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(NestedPackageEditPart.VISUAL_ID));
		assertNotNull(editPart10);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart10.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageFramecontentsEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myActorTool, 201, 130);

		IGraphicalEditPart editPart11 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(ActorInPackageEditPart.VISUAL_ID));
		assertNotNull(editPart11);
		assertEquals("Actor", getMetaclassName(editPart11));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
