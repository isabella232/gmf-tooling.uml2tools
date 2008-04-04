package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.part.CreateDependencyLinkTool;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;


public class DependencyCreationToolTest extends ClassDiagramCreationToolTest {

	private IGraphicalEditPart mySourceEP;
	private IGraphicalEditPart myTargetEP;

	public DependencyCreationToolTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		DiagramEditPart diagram = getDiagramEditPart();
		createNodeByTool(UMLElementTypes.Class_2001, 10, 10);
		mySourceEP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull("ClassEditPart was not created.", mySourceEP);
		
		createNodeByTool(UMLElementTypes.DataType_2004, 100, 100);
		myTargetEP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		assertNotNull("DataTypeEditPart was not created.", myTargetEP);

	}

	public void testABSTRACTIONDependency() {
		flushEventQueue();
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.ABSTRACTION();
		createConnectionByTool(tool, mySourceEP, myTargetEP);
		EClass type = UMLPackage.eINSTANCE.getAbstraction();
		testDependency(type);
	}

	public void testDEPENDENCYependency() {
		flushEventQueue();
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.DEPENDENCY();
		createConnectionByTool(tool, mySourceEP, myTargetEP);
		EClass type = UMLPackage.eINSTANCE.getDependency();
		testDependency(type);
	}

	public void testUSAGEDependency() {
		flushEventQueue();
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.USAGE();
		createConnectionByTool(tool, mySourceEP, myTargetEP);
		EClass type = UMLPackage.eINSTANCE.getUsage();
		testDependency(type);
	}

	public void testSUBSTITUTIONDependency() {
		flushEventQueue();
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.SUBSTITUTION();
		createConnectionByTool(tool, mySourceEP, myTargetEP);
		EClass type = UMLPackage.eINSTANCE.getSubstitution();
		testDependency(type);
	}

	public void testABSTRACTIONDependencyCreationOnDoubleClick() {
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(new Object[]{mySourceEP, myTargetEP}));
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.ABSTRACTION();
		createConnectionByToolDoubleClick(tool);
		EClass type = UMLPackage.eINSTANCE.getAbstraction();
		testDependency(type);
	}

	public void testDEPENDENCYDependencyCreationOnDoubleClick() {
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(new Object[]{mySourceEP, myTargetEP}));
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.DEPENDENCY();
		createConnectionByToolDoubleClick(tool);
		EClass type = UMLPackage.eINSTANCE.getDependency();
		testDependency(type);
	}

	public void testSUBSTITUTIONDependencyCreationOnDoubleClick() {
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(new Object[]{mySourceEP, myTargetEP}));
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.SUBSTITUTION();
		createConnectionByToolDoubleClick(tool);
		EClass type = UMLPackage.eINSTANCE.getSubstitution();
		testDependency(type);
	}

	public void testUSAGEDependencyCreationOnDoubleClick() {
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(new Object[]{mySourceEP, myTargetEP}));
		CreateDependencyLinkTool tool = new CreateDependencyLinkTool.USAGE();
		createConnectionByToolDoubleClick(tool);
		EClass type = UMLPackage.eINSTANCE.getUsage();
		testDependency(type);
	}

	private void testDependency(EClass type) {
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull("DependencyEditPart was not created.", associationEP);
		
		EObject element = associationEP.getNotationView().getElement();
		assertEquals("Dependency was created with incorrect Kind.", type, element.eClass());
	}

}
