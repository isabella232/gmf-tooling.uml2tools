package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.uml2.diagram.common.conventions.AssociationEndConvention;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.part.CreateAssociationLinkTool;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;


public class AssociationCreationToolTest extends ClassDiagramCreationToolTest {
	IGraphicalEditPart mySourceEP;

	public AssociationCreationToolTest(String name) {
		super(name);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		DiagramEditPart diagram = getDiagramEditPart();
		createNodeByTool(UMLElementTypes.Class_2001);
		mySourceEP = diagram.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull("ClassEditPart was not created.", mySourceEP);
	}
	@Override
	protected void tearDown() throws Exception {
		mySourceEP = null;
		super.tearDown();
	}

	public void testCompositeAssociationCreation() {
		flushEventQueue();
		ConnectionCreationTool tool = new CreateAssociationLinkTool.COMPOSITE();
		createConnectionByTool(tool, mySourceEP, mySourceEP);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);

		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.COMPOSITE_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	}

	public void testNoneAssociationCreation() {
		flushEventQueue();
		ConnectionCreationTool tool = new CreateAssociationLinkTool.NONE();
		createConnectionByTool(tool, mySourceEP, mySourceEP);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);

		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.NONE_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	}

	public void testSharedAssociationCreation() {
		flushEventQueue();
		ConnectionCreationTool tool = new CreateAssociationLinkTool.SHARED();
		createConnectionByTool(tool, mySourceEP, mySourceEP);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);

		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.SHARED_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	}

	public void testCompositeAssociationCreationOnDoubleClick() {
		ConnectionCreationTool tool = new CreateAssociationLinkTool.COMPOSITE();
		createConnectionByToolDoubleClick(tool);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);
		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.COMPOSITE_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	}
	
	public void testNoneAssociationCreationOnDoubleClick() {
		ConnectionCreationTool tool = new CreateAssociationLinkTool.NONE();
		createConnectionByToolDoubleClick(tool);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);
		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.NONE_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	}

	public void testSharedAssociationCreationOnDoubleClick() {
		ConnectionCreationTool tool = new CreateAssociationLinkTool.SHARED();
		createConnectionByToolDoubleClick(tool);
		ConnectionEditPart associationEP = findConnection(getDiagramEditPart(), AssociationEditPart.VISUAL_ID);
		assertNotNull("AssociationEditPart was not created.", associationEP);
		assertEquals("Association was created with incorrect Aggregation Kind.", AggregationKind.SHARED_LITERAL.getLiteral(), getAggregationLiteral(associationEP));
	} 

	private String getAggregationLiteral(ConnectionEditPart associationEP) {
		Association association = (Association) associationEP.getNotationView().getElement();
		return AssociationEndConvention.getTargetEnd(association).getAggregation().getLiteral();
	}

}
