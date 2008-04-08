package org.eclipse.uml2.diagram.common.tool;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.viewers.ISelection;
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
		try {
			myProject.close();
		} catch (Exception e) {
			e.printStackTrace();			
		}
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

	protected void createNodeByTool(IElementType elementType) {
		createNodeByTool(elementType, 70, 70);
	}

	protected void createNodeByTool(IElementType elementType, int x, int y) {
		UnspecifiedTypeCreationTool tool = new UnspecifiedTypeCreationTool(Collections.singletonList(elementType));
		tool.setEditDomain(myEditDomain);
		tool.activate();
		tool.mouseMove(createMouseEvent(x, y), myDiagramViewer);
		tool.mouseDown(createMouseEvent(x, y), myDiagramViewer);
		tool.mouseUp(createMouseEvent(x, y), myDiagramViewer);
		tool.deactivate();
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
	
}
