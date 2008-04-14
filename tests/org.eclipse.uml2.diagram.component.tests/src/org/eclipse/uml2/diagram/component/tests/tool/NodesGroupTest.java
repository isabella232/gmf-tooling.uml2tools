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
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationInnerClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackagePackagesEditPart;
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
	@Override
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
	@Override
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
	public void testComponentInComponent() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool2;
		tool2 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Component_2001")));

		createNodeByTool(tool2, 200, 100);

		IGraphicalEditPart editPart8 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart8);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment2 = editPart8.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		assertNotNull(compartment2);

		createNodeByTool(myComponentTool, 201, 150);

		IGraphicalEditPart editPart9 = compartment2.getChildBySemanticHint(UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		assertNotNull(editPart9);
		assertEquals("Component", getMetaclassName(editPart9));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testComponentInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool3;
		tool3 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Package_2006")));

		createNodeByTool(tool3, 200, 100);

		IGraphicalEditPart editPart10 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		assertNotNull(editPart10);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment3 = editPart10.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment3);

		createNodeByTool(myComponentTool, 201, 101);

		IGraphicalEditPart editPart11 = compartment3.getChildBySemanticHint(UMLVisualIDRegistry.getType(Component3EditPart.VISUAL_ID));
		assertNotNull(editPart11);
		assertEquals("Component", getMetaclassName(editPart11));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testArtifactInComponent() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool4;
		tool4 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Component_2001")));

		createNodeByTool(tool4, 200, 100);

		IGraphicalEditPart editPart12 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart12);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment4 = editPart12.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		assertNotNull(compartment4);

		createNodeByTool(myArtifactTool, 201, 150);

		IGraphicalEditPart editPart13 = compartment4.getChildBySemanticHint(UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
		assertNotNull(editPart13);
		assertEquals("Artifact", getMetaclassName(editPart13));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testInterfaceInComponent() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool5;
		tool5 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Component_2001")));

		createNodeByTool(tool5, 200, 100);

		IGraphicalEditPart editPart14 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart14);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment5 = editPart14.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		assertNotNull(compartment5);

		createNodeByTool(myInterfaceTool, 201, 150);

		IGraphicalEditPart editPart15 = compartment5.getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		assertNotNull(editPart15);
		assertEquals("Interface", getMetaclassName(editPart15));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInComponent() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool6;
		tool6 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Component_2001")));

		createNodeByTool(tool6, 200, 100);

		IGraphicalEditPart editPart16 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		assertNotNull(editPart16);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment6 = editPart16.getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		assertNotNull(compartment6);

		createNodeByTool(myClassTool, 201, 150);

		IGraphicalEditPart editPart17 = compartment6.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		assertNotNull(editPart17);
		assertEquals("Class", getMetaclassName(editPart17));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testPackageInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool7;
		tool7 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Package_2006")));

		createNodeByTool(tool7, 200, 100);

		IGraphicalEditPart editPart18 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		assertNotNull(editPart18);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment7 = editPart18.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackagePackagesEditPart.VISUAL_ID));
		assertNotNull(compartment7);

		createNodeByTool(myPackageTool, 201, 101);

		IGraphicalEditPart editPart19 = compartment7.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package4EditPart.VISUAL_ID));
		assertNotNull(editPart19);
		assertEquals("Package", getMetaclassName(editPart19));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInPackage() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool8;
		tool8 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Package_2006")));

		createNodeByTool(tool8, 200, 100);

		IGraphicalEditPart editPart20 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		assertNotNull(editPart20);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment8 = editPart20.getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		assertNotNull(compartment8);

		createNodeByTool(myClassTool, 201, 101);

		IGraphicalEditPart editPart21 = compartment8.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		assertNotNull(editPart21);
		assertEquals("Class", getMetaclassName(editPart21));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */
	public void testClassInClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();

		Tool tool9;
		tool9 = new UnspecifiedTypeCreationTool(Collections.singletonList(ElementTypeRegistry.getInstance().getType("org.eclipse.uml2.diagram.component.Class_2007")));

		createNodeByTool(tool9, 200, 100);

		IGraphicalEditPart editPart22 = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationClassEditPart.VISUAL_ID));
		assertNotNull(editPart22);

		getDiagramEditPart().getViewer().flush();

		IGraphicalEditPart compartment9 = editPart22.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassClassesEditPart.VISUAL_ID));
		assertNotNull(compartment9);

		createNodeByTool(myClassTool, 201, 101);

		IGraphicalEditPart editPart23 = compartment9.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassDiagramNotationInnerClassEditPart.VISUAL_ID));
		assertNotNull(editPart23);
		assertEquals("Class", getMetaclassName(editPart23));
		getDiagramEditPart().getViewer().flush();

	}

	/**
	 * @generated
	 */

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}
}
