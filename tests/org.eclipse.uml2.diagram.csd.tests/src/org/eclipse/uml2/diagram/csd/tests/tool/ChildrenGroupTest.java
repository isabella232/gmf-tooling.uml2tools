package org.eclipse.uml2.diagram.csd.tests.tool;

import java.util.Collections;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClass_contentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationContentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUse2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Port3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;

public class ChildrenGroupTest extends CSDCreationToolTestBase {

	PaletteRoot myRoot = new PaletteRoot();

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
	Tool myCollaborationUseTool;

	/**
	 * @generated
	 */
	Tool mySlotTool;

	/**
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
		myElementImportTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(0)).createTool();
		myAttributeTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(1)).createTool();
		myOperationTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(2)).createTool();
		myPortTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(3)).createTool();
		myCollaborationUseTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(4)).createTool();
		mySlotTool = ((ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(5)).createTool();
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
	public void testPropertyInCollaboration() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool1;
		tool1 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Collaboration_2005")));

		createNodeByTool(tool1, 200, 100);

		IGraphicalEditPart editPart3 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationEditPart.VISUAL_ID));
		assertNotNull(editPart3);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart3.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationContentsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myAttributeTool, 275, 130);

		IGraphicalEditPart editPart4 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull(editPart4);
		assertEquals("Property", getMetaclassName(editPart4));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPropertyInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Class_2006")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart5 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart5);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart5.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myAttributeTool, 201, 101);

		IGraphicalEditPart editPart6 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		assertNotNull(editPart6);
		assertEquals("Property", getMetaclassName(editPart6));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPropertyInExpandedClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool3;
		tool3 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Class_2007")));

		createNodeByTool(tool3, 200, 100);

		IGraphicalEditPart editPart7 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		assertNotNull(editPart7);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment4 = editPart7.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassClass_contentsEditPart.VISUAL_ID));
		assertNotNull(compartment4);

		createNodeByTool(myAttributeTool, 201, 101);

		IGraphicalEditPart editPart8 = compartment4.getChildBySemanticHint(UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		assertNotNull(editPart8);
		assertEquals("Property", getMetaclassName(editPart8));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testOperationInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool4;
		tool4 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Class_2006")));

		createNodeByTool(tool4, 200, 100);

		IGraphicalEditPart editPart9 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart9);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment5 = editPart9.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassOperationsEditPart.VISUAL_ID));
		assertNotNull(compartment5);

		createNodeByTool(myOperationTool, 201, 101);

		IGraphicalEditPart editPart10 = compartment5.getChildBySemanticHint(UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		assertNotNull(editPart10);
		assertEquals("Operation", getMetaclassName(editPart10));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPortOnClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool5;
		tool5 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Class_2006")));

		createNodeByTool(tool5, 200, 100);

		IGraphicalEditPart editPart11 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart11);

		getDiagramEditPart().getViewer().flush();

		createNodeByTool(myPortTool, 201, 101);

		IGraphicalEditPart editPart12 = editPart11.getChildBySemanticHint(UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		assertNotNull(editPart12);
		assertEquals("Port", getMetaclassName(editPart12));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPortOnExpandedClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool6;
		tool6 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Class_2007")));

		createNodeByTool(tool6, 200, 100);

		IGraphicalEditPart editPart13 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart13);

		getDiagramEditPart().getViewer().flush();

		createNodeByTool(myPortTool, 201, 101);

		IGraphicalEditPart editPart14 = editPart13.getChildBySemanticHint(UMLVisualIDRegistry.getType(Port3EditPart.VISUAL_ID));
		assertNotNull(editPart14);
		assertEquals("Port", getMetaclassName(editPart14));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testCollaborationUseInCollaboration() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool7;
		tool7 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.Collaboration_2005")));

		createNodeByTool(tool7, 200, 100);

		IGraphicalEditPart editPart15 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationEditPart.VISUAL_ID));
		assertNotNull(editPart15);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment6 = editPart15.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationContentsEditPart.VISUAL_ID));
		assertNotNull(compartment6);

		createNodeByTool(myCollaborationUseTool, 275, 130);

		IGraphicalEditPart editPart16 = compartment6.getChildBySemanticHint(UMLVisualIDRegistry.getType(CollaborationUse2EditPart.VISUAL_ID));
		assertNotNull(editPart16);
		assertEquals("CollaborationUse", getMetaclassName(editPart16));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testSlotInInstanceSpecification() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		/**
		 * @generated
		 */
		Tool tool8;
		tool8 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.usecase.InstanceSpecification_2011")));

		createNodeByTool(tool8, 200, 100);

		IGraphicalEditPart editPart17 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		assertNotNull(editPart17);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment7 = editPart17.getChildBySemanticHint(UMLVisualIDRegistry.getType(InstanceSpecificationSlotsEditPart.VISUAL_ID));
		assertNotNull(compartment7);

		createNodeByTool(mySlotTool, 201, 101);

		IGraphicalEditPart editPart18 = compartment7.getChildBySemanticHint(UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID));
		assertNotNull(editPart18);
		assertEquals("Slot", getMetaclassName(editPart18));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
