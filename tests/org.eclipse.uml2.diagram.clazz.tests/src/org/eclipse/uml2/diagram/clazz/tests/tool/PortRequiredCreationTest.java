package org.eclipse.uml2.diagram.clazz.tests.tool;

import java.util.Collections;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Tool;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

public class PortRequiredCreationTest extends ClassDiagramCreationToolTest {

	public PortRequiredCreationTest(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testLinkCreation() throws Exception {
		IGraphicalEditPart source1EP = createPortOnClass(createClass());
		createNodeByTool(UMLElementTypes.Class_2001, 150, 200); // create Type
		UMLDiagramFacade.flushEventQueue();
		setType(source1EP, getSelectedEP());
		
		IGraphicalEditPart targetEP = createInterface();
		
		ConnectionEditPart portLinkEP = createPortRequired(source1EP, targetEP);
		checkRequiredInterfaceInModel(portLinkEP);
	}

	public void testReorientSource() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		setType(sourceEP, createClass());

		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portRequiredEP = createPortRequired(sourceEP, targetEP);
		
		//create target interface
		createPortOnClass(createClass());
		IGraphicalEditPart newSourceEP = getSelectedEP();
		setType(newSourceEP, createClass());
		assertNotNull(newSourceEP);
		assertNotNull(((Port)newSourceEP.getNotationView().getElement()).getType());
		assertNotSame(sourceEP, newSourceEP);
		
		reorientReferenceConnectionSource(portRequiredEP, newSourceEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortRequiredEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newSourceEP.getNotationView().getElement(), getConnectionSource(newConnection));
		checkRequiredInterfaceInModel(newConnection);
	}

	public void testReorientTarget() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		
		setType(sourceEP, createClass());
		
		IGraphicalEditPart targetEP = createInterface();
		
		ConnectionEditPart portLinkEP = createPortRequired(sourceEP, targetEP);

		createInterface();

		IGraphicalEditPart newTargetEP = (IGraphicalEditPart) ((IStructuredSelection) getSelection()).getFirstElement();
		assertNotNull(newTargetEP);
		assertNotSame(targetEP, newTargetEP);
		reorientReferenceConnectionTarget(portLinkEP, newTargetEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortRequiredEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newTargetEP.getNotationView().getElement(), getConnectionTarget(newConnection));
		checkRequiredInterfaceInModel(newConnection);
	}

	private void checkRequiredInterfaceInModel(ConnectionEditPart connectionEP) {
		EObject source = getConnectionSource(connectionEP);
		assertTrue(source instanceof Port);
		EObject target = getConnectionTarget(connectionEP);
		assertTrue(target instanceof Interface);
		assertTrue(((Port) source).getRequireds().contains(target));
	}

	private void setType(IGraphicalEditPart sourceEP, IGraphicalEditPart typeEP) throws Exception {
		new SetValueCommand(new SetRequest(sourceEP.getNotationView().getElement(), UMLPackage.eINSTANCE.getTypedElement_Type(), (Type) typeEP.getNotationView().getElement())).execute(null, null);
	}

	private ConnectionEditPart createPortRequired(IGraphicalEditPart source, IGraphicalEditPart target) {
		ConnectionCreationTool portRequiredTool = new UnspecifiedTypeConnectionTool(Collections.singletonList(UMLElementTypes.PortRequired_4018));
		createConnectionByTool(portRequiredTool, source, target);
		UMLDiagramFacade.flushEventQueue();
		ConnectionEditPart portRequiredEP = findConnection(getDiagramEditPart(), PortRequiredEditPart.VISUAL_ID);
		assertNotNull("PortRequiredEditPart was not created.", portRequiredEP);
		return portRequiredEP;
	}

	private IGraphicalEditPart createInterface() {
		Point p = getDiagramEditPart().getChildrenBounds().getCopy().expand(10, 0).getBottomRight();
		Tool classTool = new UnspecifiedTypeCreationTool(Collections.singletonList(UMLElementTypes.Interface_2010));
		createNodeByTool(classTool, p);
		IGraphicalEditPart interfaceEP = getSelectedEP();
		UMLDiagramFacade.flushEventQueue();
		assertNotNull(interfaceEP);
		return interfaceEP;
	}

	private IGraphicalEditPart createClass() {
		Point p = getDiagramEditPart().getChildrenBounds().getCopy().expand(2, 2).getBottomRight();
		Tool classTool = new UnspecifiedTypeCreationTool(Collections.singletonList(UMLElementTypes.Class_2001));
		createNodeByTool(classTool, p);
		IGraphicalEditPart classEP = getSelectedEP();
		UMLDiagramFacade.flushEventQueue();
		assertNotNull(classEP);
		return classEP;
	}

	private IGraphicalEditPart createPortOnClass(IGraphicalEditPart classEP) {
		Tool portTool = new UnspecifiedTypeCreationTool(Collections.singletonList(UMLElementTypes.Port_3025));
		createNodeByTool(portTool, classEP.getFigure().getBounds().getCopy().getTopLeft());
		IGraphicalEditPart portEP = classEP.getChildBySemanticHint(UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		assertNotNull(portEP);
		UMLDiagramFacade.flushEventQueue();
		return portEP;

	}

}
