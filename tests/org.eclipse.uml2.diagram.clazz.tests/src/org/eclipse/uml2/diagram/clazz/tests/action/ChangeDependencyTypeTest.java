package org.eclipse.uml2.diagram.clazz.tests.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.action.ChangeDependencyType;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName3EditPart;
import org.eclipse.uml2.diagram.clazz.part.CreateDependencyLinkTool;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.clazz.tests.tool.ClassDiagramCreationToolTest;
import org.eclipse.uml2.diagram.common.part.CreateLinkToolBase;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.uml.UMLPackage;

public class ChangeDependencyTypeTest extends ClassDiagramCreationToolTest {

	private IGraphicalEditPart mySourceEP;

	private IGraphicalEditPart myTargetEP;

	private ConnectionEditPart myDependencyEP;

	public ChangeDependencyTypeTest(String name) {
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
		UMLDiagramFacade.flushEventQueue();
		CreateLinkToolBase tool = oursCreationToolList.get(myIndex1);
		createConnectionByTool(tool, mySourceEP, myTargetEP);
		myDependencyEP = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull("DependencyLink should be created.", myDependencyEP);
		UMLDiagramFacade.flushEventQueue();
	}

	private void runChangeDependencyTypeAction(EClass type) {
		assertFalse("Selection should not be empty to run action correctly.", getDiagramEditPart().getViewer().getSelection().isEmpty());
		DiagramAction action = new ChangeDependencyType(getWorkbenchPage(), type, "testID");
		action.init();
		assertTrue("Action should be enabled in correct cases: DependencyType: " + oursDependencyTypes.get(myIndex1).getName() + ", Actiontype: " + oursDependencyTypes.get(myIndex1).getName(), action
				.isEnabled());
		action.run();
	}

	public void testChangeDependencyTypeActionEnablement1() {
		EClass type = oursDependencyTypes.get(myIndex1);
		DiagramAction action = new ChangeDependencyType(getWorkbenchPage(), type, "testID");
		action.init();
		assertFalse("Action should be disabled for action with same type as current type: " + type.getName() + " .", action.isEnabled());
	}

	public void testChangeDependencyTypeActionEnablement2() {
		EClass type = oursDependencyTypes.get(myIndex2);
		DiagramAction action = new ChangeDependencyType(getWorkbenchPage(), type, "testID");
		action.init();
		assertTrue("DependencyType: " + oursDependencyTypes.get(myIndex1).getName() + ", Actiontype: " + oursDependencyTypes.get(myIndex1).getName(), action.isEnabled());
	}

	public void testDependency2EditPartExistenceAfterTypeChange() {
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
	}

	public void testDependencySourceAfterTypeChange1() {
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		assertEquals("Source EditPart should be changed after DependencyType change", mySourceEP, dependency.getSource());
	}

	public void testDependencyTargetAfterTypeChange1() {
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		assertEquals("Connection Target EditPart should be changed after DependencyType change", myTargetEP, dependency.getTarget());
	}

	public void testDependencyType() {
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		assertEquals(type, dependency.getNotationView().getElement().eClass());
	}

	public void testDependencyEditPartSource() {
		Point point = myDependencyEP.getConnectionFigure().getPoints().getFirstPoint().getCopy();
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		UMLDiagramFacade.flushEventQueue();
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		assertEquals(point, dependency.getConnectionFigure().getPoints().getFirstPoint());
	}

	public void testDependencyEditPartTarget() {
		Point point = myDependencyEP.getConnectionFigure().getPoints().getLastPoint().getCopy();
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		UMLDiagramFacade.flushEventQueue();
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		assertEquals(point, dependency.getConnectionFigure().getPoints().getLastPoint());
	}

	public void testDependencyEditPartLabel() {
		EClass type = oursDependencyTypes.get(myIndex2);
		runChangeDependencyTypeAction(type);
		UMLDiagramFacade.flushEventQueue();
		ConnectionEditPart dependency = findConnection(getDiagramEditPart(), Dependency2EditPart.VISUAL_ID);
		assertNotNull(dependency);
		DependencyName3EditPart label = (DependencyName3EditPart) dependency.getChildBySemanticHint(UMLVisualIDRegistry.getType(DependencyName3EditPart.VISUAL_ID));
		assertNotNull(label);
		String editText = label.getEditText();
		assertEquals(editText, type.getName().toLowerCase());
	}

	private static List<CreateLinkToolBase> oursCreationToolList = new ArrayList<CreateLinkToolBase>(4);

	private static List<EClass> oursDependencyTypes = new ArrayList<EClass>(4);

	private static int myIndex1 = new Random(System.currentTimeMillis()).nextInt(4);

	private static int myIndex2 = initIndex2();

	static {
		oursCreationToolList.add(new CreateDependencyLinkTool.DEPENDENCY());
		oursCreationToolList.add(new CreateDependencyLinkTool.ABSTRACTION());
		oursCreationToolList.add(new CreateDependencyLinkTool.SUBSTITUTION());
		oursCreationToolList.add(new CreateDependencyLinkTool.USAGE());

		oursDependencyTypes.add(UMLPackage.eINSTANCE.getDependency());
		oursDependencyTypes.add(UMLPackage.eINSTANCE.getAbstraction());
		oursDependencyTypes.add(UMLPackage.eINSTANCE.getSubstitution());
		oursDependencyTypes.add(UMLPackage.eINSTANCE.getUsage());
	}

	private static int initIndex2() {
		Random random = new Random(System.currentTimeMillis());
		int index2 = random.nextInt(4);
		while (myIndex1 == index2) {
			index2 = random.nextInt(4);
		}
		return index2;
	}

}
