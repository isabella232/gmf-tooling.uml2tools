package org.eclipse.uml2.diagram.common.tool;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.Tool;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.intro.IIntroConstants;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tests.UMLProjectFacade;

public abstract class CreationToolTestBase extends TestCase {

	private UMLDiagramFacade myDiagramFacade;

	private UMLProjectFacade myProject;

	protected EditDomain myEditDomain;

	protected org.eclipse.gef.EditPartViewer myDiagramViewer;

	private DiagramEditPart myDiagramEditPart;

	public CreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		skipIntro();
		myProject = new UMLProjectFacade();
		myDiagramFacade = getDiagram(myProject.getFullPath());
		myDiagramFacade.create(getName());
		myDiagramFacade.open();
		myEditDomain = (EditDomain) myDiagramFacade.getDiagramEditDomain();
		myDiagramEditPart = myDiagramFacade.getDiagramEditPart();
		myDiagramViewer = myDiagramEditPart.getViewer();
	}

	@Override
	protected void tearDown() throws Exception {
		myDiagramFacade.close();
		myDiagramFacade = null;
		myDiagramEditPart = null;
		myEditDomain = null;
		myDiagramViewer = null;
		try {
			myProject.close();
		} catch (Exception e) {
			e.printStackTrace();			
		}
		myProject = null;
		super.tearDown();
	}
	
	protected DiagramEditPart getDiagramEditPart() {
		return myDiagramEditPart;
	}
	
	protected IWorkbenchPage getWorkbenchPage() {
		return myDiagramFacade.getDiagramWorkbenchPart().getSite().getPage();
	}
	
	protected ISelection getSelection() {
		return getDiagramEditPart().getViewer().getSelection();
	}

	protected abstract UMLDiagramFacade getDiagram(String projectPath);
	
	protected IGraphicalEditPart getSelectedEP() {
		return (IGraphicalEditPart)((IStructuredSelection)getSelection()).getFirstElement();	
	}

	protected void createConnectionByToolDoubleClick(ConnectionCreationTool tool) {
		tool.setEditDomain(myEditDomain);
		tool.activate();
		tool.mouseDoubleClick(createMouseEvent(0, 0), myDiagramViewer);
		tool.deactivate();
	}

	protected void createConnectionByTool(ConnectionCreationTool tool, IGraphicalEditPart sourceEditPart, IGraphicalEditPart targetEditPart) {
		Point source = sourceEditPart.getFigure().getBounds().getTopLeft();
		Point target = targetEditPart.getFigure().getBounds().getTopLeft();
		createConnectionByTool(tool, source.x, source.y, target.x, target.y);
	}

	protected void createConnectionByTool(ConnectionCreationTool tool, int x1, int y1, int x2, int y2) {
		tool.setEditDomain(myEditDomain);
		tool.activate();
		tool.mouseMove(createMouseEvent(x1, y1), myDiagramViewer);
		tool.mouseDown(createMouseEvent(x1, y1), myDiagramViewer);
		tool.mouseDrag(createMouseEvent(x2, y2), myDiagramViewer);
		tool.mouseUp(createMouseEvent(x2, y2), myDiagramViewer);
		tool.deactivate();
	}

	protected void reorientReferenceConnectionTarget(ConnectionEditPart connection, IGraphicalEditPart newTargetEP) {
		EObject source = getConnectionSource(connection);
		EObject oldTarget = getConnectionTarget(connection);
		EObject newTarget = newTargetEP.getNotationView().getElement();
		ReorientReferenceRelationshipRequest request = new ReorientReferenceRelationshipRequest(getDiagramEditPart().getEditingDomain(), source, newTarget, oldTarget, ReorientRequest.REORIENT_TARGET);
		request.setParameter(VISUAL_ID_KEY, Integer.valueOf(connection.getNotationView().getType()));
		Command cmd = ((SemanticEditPolicy)newTargetEP.getEditPolicy(EditPolicyRoles.SEMANTIC_ROLE)).getCommand(new EditCommandRequestWrapper(request));
		if (!cmd.canExecute()) {
			fail();
		}
		cmd.execute();
	}
	
	protected void reorientReferenceConnectionSource(ConnectionEditPart connection, IGraphicalEditPart newSourceEP) {
		EObject oldSource = getConnectionSource(connection);
		EObject target = getConnectionTarget(connection);
		EObject newSource = newSourceEP.getNotationView().getElement();
		ReorientReferenceRelationshipRequest request = new ReorientReferenceRelationshipRequest(getDiagramEditPart().getEditingDomain(), oldSource, newSource, target, ReorientRequest.REORIENT_SOURCE);
		request.setParameter(VISUAL_ID_KEY, Integer.valueOf(connection.getNotationView().getType()));
		Command cmd = ((SemanticEditPolicy)newSourceEP.getEditPolicy(EditPolicyRoles.SEMANTIC_ROLE)).getCommand(new EditCommandRequestWrapper(request));
		if (!cmd.canExecute()) {
			fail();
		}
		cmd.execute();
	}

	protected static EObject getConnectionSource(ConnectionEditPart connection) {
		return ((View)connection.getSource().getModel()).getElement();
	}
	
	protected static EObject getConnectionTarget(ConnectionEditPart connection) {
		return ((View)connection.getTarget().getModel()).getElement();
	}

	protected void createNodeByTool(IElementType elementType) {
		createNodeByTool(elementType, 70, 70);
	}

	protected void createNodeByTool(Tool tool, int x, int y) {
		tool.setEditDomain(myEditDomain);
		tool.activate();
		tool.mouseMove(createMouseEvent(x, y), myDiagramViewer);
		tool.mouseDown(createMouseEvent(x, y), myDiagramViewer);
		tool.mouseUp(createMouseEvent(x, y), myDiagramViewer);
		tool.deactivate();
	}

	protected void createNodeByTool(IElementType elementType, int x, int y) {
		UnspecifiedTypeCreationTool tool = new UnspecifiedTypeCreationTool(Collections.singletonList(elementType));
		createNodeByTool(tool, x, y);
	}

	protected void createNodeByTool(IElementType elementType, Point p) {
		createNodeByTool(elementType, p.x, p.y);
	}

	protected void createNodeByTool(Tool tool, Point p) {
		createNodeByTool(tool, p.x, p.y);
	}

	private MouseEvent createMouseEvent(int x, int y) {
		Event e = new Event();

		e.widget = myDiagramViewer.getControl();
		e.display = e.widget.getDisplay();
		e.button = 1; // left button
		e.x = x;
		e.y = y;

		return new MouseEvent(e);
	}
	
	private static void skipIntro() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IViewReference reference = page.findViewReference(IIntroConstants.INTRO_VIEW_ID);
		if (reference != null) {
			page.hideView(reference.getView(false));
		}
	}
	
	public static final String VISUAL_ID_KEY = "visual_id";
	
}
