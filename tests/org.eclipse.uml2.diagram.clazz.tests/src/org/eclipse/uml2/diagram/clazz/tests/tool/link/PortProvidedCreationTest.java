package org.eclipse.uml2.diagram.clazz.tests.tool.link;

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
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.clazz.tests.tool.ClassDiagramCreationToolTest;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

public class PortProvidedCreationTest extends ClassDiagramCreationToolTest {

	public PortProvidedCreationTest(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testLinkCreation() {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		checkProvidedInterfaceInModel(portProvidedEP);
	}

	public void testLinkCreationForPortWithType() throws Exception {
		IGraphicalEditPart source1EP = createPortOnClass(createClass());
		createNodeByTool(UMLElementTypes.Class_2001, 150, 200); // create Type
		UMLDiagramFacade.flushEventQueue();
		setType(source1EP, getSelectedEP());
		
		IGraphicalEditPart targetEP = createInterface();
		
		ConnectionEditPart portProvidedEP = createPortProvided(source1EP, targetEP);
		checkProvidedInterfaceInModel(portProvidedEP);
	}

	public void testReorientSourceFromPortPortWithoutTypeToPortWithoutType() {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		
		//create target interface
		createPortOnClass(createClass());
		IGraphicalEditPart newSourceEP = getSelectedEP();
		assertNotNull(newSourceEP);
		assertNotSame(sourceEP, newSourceEP);
		reorientReferenceConnectionSource(portProvidedEP, newSourceEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newSourceEP.getNotationView().getElement(), getConnectionSource(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	public void testReorientSourceFromPortPortWithoutTypeToPortWithType() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		
		//create target interface
		createPortOnClass(createClass());
		IGraphicalEditPart newSourceEP = getSelectedEP();
		setType(newSourceEP, createClass());
		assertNotNull(newSourceEP);
		assertNotNull(((Port)newSourceEP.getNotationView().getElement()).getType());
		assertNotSame(sourceEP, newSourceEP);
		
		reorientReferenceConnectionSource(portProvidedEP, newSourceEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newSourceEP.getNotationView().getElement(), getConnectionSource(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	public void testReorientSourceFromPortPortWithTypeToPortWithType() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		setType(sourceEP, createClass());

		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		
		//create target interface
		createPortOnClass(createClass());
		IGraphicalEditPart newSourceEP = getSelectedEP();
		setType(newSourceEP, createClass());
		assertNotNull(newSourceEP);
		assertNotNull(((Port)newSourceEP.getNotationView().getElement()).getType());
		assertNotSame(sourceEP, newSourceEP);
		
		reorientReferenceConnectionSource(portProvidedEP, newSourceEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newSourceEP.getNotationView().getElement(), getConnectionSource(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	public void testReorientSourceFromPortPortWithTypeToPortWithoutType() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		setType(sourceEP, createClass());
		
		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		
		//create target interface
		createPortOnClass(createClass());
		IGraphicalEditPart newSourceEP = getSelectedEP();
		assertNotNull(newSourceEP);
		assertNotSame(sourceEP, newSourceEP);
		
		reorientReferenceConnectionSource(portProvidedEP, newSourceEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newSourceEP.getNotationView().getElement(), getConnectionSource(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	public void testReorientTargetForPortWithoutType() {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		IGraphicalEditPart targetEP = createInterface();
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);
		
		//create source port
		createInterface();
		IGraphicalEditPart newTargetEP = getSelectedEP();
		assertNotNull(newTargetEP);
		assertNotSame(targetEP, newTargetEP);
		reorientReferenceConnectionTarget(portProvidedEP, newTargetEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newTargetEP.getNotationView().getElement(), getConnectionTarget(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	public void testReorientTargetForPortWithType() throws Exception {
		IGraphicalEditPart sourceEP = createPortOnClass(createClass());
		
		setType(sourceEP, createClass());
		
		IGraphicalEditPart targetEP = createInterface();
		
		ConnectionEditPart portProvidedEP = createPortProvided(sourceEP, targetEP);

		createInterface();

		IGraphicalEditPart newTargetEP = (IGraphicalEditPart) ((IStructuredSelection) getSelection()).getFirstElement();
		assertNotNull(newTargetEP);
		assertNotSame(targetEP, newTargetEP);
		reorientReferenceConnectionTarget(portProvidedEP, newTargetEP);

		UMLDiagramFacade.flushEventQueue();
		createInterface();// run element creation it to refresh the diagram

		ConnectionEditPart newConnection = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull(newConnection);
		assertEquals(newTargetEP.getNotationView().getElement(), getConnectionTarget(newConnection));
		checkProvidedInterfaceInModel(newConnection);
	}

	private void checkProvidedInterfaceInModel(ConnectionEditPart connectionEP) {
		EObject source = getConnectionSource(connectionEP);
		assertTrue(source instanceof Port);
		EObject target = getConnectionTarget(connectionEP);
		assertTrue(target instanceof Interface);
		assertTrue(((Port) source).getProvideds().contains(target));
	}

	private void setType(IGraphicalEditPart sourceEP, IGraphicalEditPart typeEP) throws Exception {
		new SetValueCommand(new SetRequest(sourceEP.getNotationView().getElement(), UMLPackage.eINSTANCE.getTypedElement_Type(), (Type) typeEP.getNotationView().getElement())).execute(null, null);
	}

	private ConnectionEditPart createPortProvided(IGraphicalEditPart source, IGraphicalEditPart target) {
		ConnectionCreationTool portProvidedTool = new UnspecifiedTypeConnectionTool(Collections.singletonList(UMLElementTypes.PortProvided_4017));
		createConnectionByTool(portProvidedTool, source, target);
		UMLDiagramFacade.flushEventQueue();
		ConnectionEditPart portProvidedEP = findConnection(getDiagramEditPart(), PortProvidedEditPart.VISUAL_ID);
		assertNotNull("PortProvidedEditPart was not created.", portProvidedEP);
		return portProvidedEP;
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
