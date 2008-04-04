package org.eclipse.uml2.diagram.clazz.tests.tool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Generalization2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationGeneralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.part.CreateGeneralizationLinkTool;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;


public class GeneralizationSetCreationToolTest extends ClassDiagramCreationToolTest{

	private IGraphicalEditPart mySource1EP;
	private IGraphicalEditPart myTargetEP;
	private ConnectionEditPart myGeneralizationEP;
	private IGraphicalEditPart mySource2EP;
	private IGraphicalEditPart myGeneralizationSetEP;
	
	public GeneralizationSetCreationToolTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		super.setUp();
		DiagramEditPart diagram = getDiagramEditPart();
		
		createNodeByTool(UMLElementTypes.PrimitiveType_2005, 10, 200);
		mySource2EP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		assertNotNull("ClassEditPart was not created.", mySource2EP);

		createNodeByTool(UMLElementTypes.Class_2001, 10, 10);
		mySource1EP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull("ClassEditPart was not created.", mySource1EP);
		
		createNodeByTool(UMLElementTypes.AssociationClass_2007, 10, 100);
		myTargetEP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		assertNotNull("ClassEditPart was not created.", myTargetEP);

		flushEventQueue();
		createConnectionByTool(new CreateGeneralizationLinkTool(), mySource2EP, myTargetEP);
		myGeneralizationEP = findConnection(diagram, GeneralizationEditPart.VISUAL_ID);
		assertNotNull("GeneralizationEditPart was not created.", myGeneralizationEP);
		myGeneralizationSetEP = createGeneralizationSet(mySource1EP, myGeneralizationEP);
		assertNotNull("GeneralizationSetEditPart was not created.", myGeneralizationSetEP);
	}

	protected IGraphicalEditPart createGeneralizationSet(IGraphicalEditPart sourceEP, ConnectionEditPart targetEP) {
		flushEventQueue();
		Point source = sourceEP.getFigure().getBounds().getTopLeft();
		Point target1 = targetEP.getConnectionFigure().getPoints().getFirstPoint();
		Point target2 = targetEP.getConnectionFigure().getPoints().getLastPoint();
		Point target = new Point((target1.x + target2.x)/2, (target1.y + target2.y)/2);
		createConnectionByTool(new CreateGeneralizationLinkTool(), source.x, source.y, target.x, target.y);
		flushEventQueue();
		return getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(GeneralizationSetEditPart.VISUAL_ID));
	}
	
	public void testGeneralizationSetCreation() {
	}
	
	public void testGeneralizationSetGeneralCreation1() {
		ConnectionEditPart general = findConnection(getDiagramEditPart(), GeneralizationGeneralEditPart.VISUAL_ID);
		assertNotNull("Generalization_General should be created.", general);
	}
	public void testGeneralizationSetGeneralCreation2() {
		ConnectionEditPart general = findConnection(getDiagramEditPart(), GeneralizationGeneralEditPart.VISUAL_ID);
		assertNotNull(general);
		assertEquals("Incorrect GeneralizationGeneralEditPart source.", myGeneralizationSetEP, general.getSource());
	}
	public void testGeneralizationSetGeneralCreation3() {
		ConnectionEditPart general = findConnection(getDiagramEditPart(), GeneralizationGeneralEditPart.VISUAL_ID);
		assertNotNull(general);
		assertEquals("Incorrect GeneralizationGeneralEditPart target.", myTargetEP, general.getTarget());
	}
	public void testGeneralizationEditPartCreation1() {
		List<ConnectionEditPart> generalizations = findAllConnections(getDiagramEditPart(), GeneralizationEditPart.VISUAL_ID);
		assertEquals("GeneralizationEditPart shouldn't be on diagram afer GeneralizationSet creation", 0, generalizations.size());
	}
	public void testGeneralization2EditPartCreation1() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created.", 2, generalizations2.size());
	}
	public void testGeneralizationTarget1() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created.", 2, generalizations2.size());
		ConnectionEditPart first = generalizations2.get(0);
		assertEquals("GeneralizationSet should be target for the created Generalization.", myGeneralizationSetEP, first.getTarget());
	}
	public void testGeneralizationTarget2() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created", 2, generalizations2.size());
		ConnectionEditPart second = generalizations2.get(1);
		assertEquals("GeneralizationSet should be target for the created Generalization.", myGeneralizationSetEP, second.getTarget());
	}
	public void testGeneralizationSource() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created.", 2, generalizations2.size());
		ConnectionEditPart first = generalizations2.get(0);
		ConnectionEditPart second = generalizations2.get(1);
		boolean directOrder = mySource1EP.equals(first.getSource());
		if (directOrder) {
			assertEquals("", mySource2EP, second.getSource());
		} else {
			assertEquals(mySource1EP, second.getSource());
			assertEquals(mySource2EP, first.getSource());
		}
	}
	
	public void testGeneralizationSetCreationInSemanticModel() {
		EObject generalizationSet = myGeneralizationSetEP.getNotationView().getElement();
		assertEquals("GeneralizationSet should be created fot GeneralizationSetEditPart in semantic model. ",
				UMLPackage.eINSTANCE.getGeneralizationSet(), generalizationSet.eClass());
	}
	public void testGeneralizationCreationInSemanticModel1() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(0).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the first found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
	}
	public void testGeneralizationCreationInSemanticModel2() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditPart should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(1).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the second found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
	}
	public void testGeneralizationGeneralCreationInSemanticModel1() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditParts should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(0).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the first found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
		assertEquals("GeneralizationSet should be set for first created Generalization", 1, ((Generalization)generalization).getGeneralizationSets().size());
	}
	public void testGeneralizationGeneralCreationInSemanticModel2() {
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditParts should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(1).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the second found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
		assertEquals("GeneralizationSet should be set for second created Generalization", 1, ((Generalization)generalization).getGeneralizationSets().size());
	}
	public void testGeneralizationGeneralTargetInSemanticModel1() {
		GeneralizationSet generalizationSet = (GeneralizationSet) myGeneralizationSetEP.getNotationView().getElement();
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditParts should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(0).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the first found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
		assertEquals("GeneralizationSet should be set for first created Generalization", 1, ((Generalization)generalization).getGeneralizationSets().size());
		GeneralizationSet actualTarget = ((Generalization)generalization).getGeneralizationSets().get(0);
		assertEquals("", generalizationSet, actualTarget);
	}
	public void testGeneralizationGeneralTargetInSemanticModel2() {
		GeneralizationSet generalizationSet = (GeneralizationSet) myGeneralizationSetEP.getNotationView().getElement();
		List<ConnectionEditPart> generalizations2 = findAllConnections(getDiagramEditPart(), Generalization2EditPart.VISUAL_ID);
		assertEquals("Two Generalization2EditParts should be created", 2, generalizations2.size());
		EObject generalization = generalizations2.get(1).getNotationView().getElement();
		assertEquals("Generalization should be created in Semantic model for the second found GeneralizationEditPart", UMLPackage.eINSTANCE.getGeneralization(), generalization.eClass());
		assertEquals("GeneralizationSet should be set for second created Generalization", 1, ((Generalization)generalization).getGeneralizationSets().size());
		GeneralizationSet actualTarget = ((Generalization)generalization).getGeneralizationSets().get(0);
		assertEquals("", generalizationSet, actualTarget);
	}

}
