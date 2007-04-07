package org.eclipse.uml2.diagram.common.tests;

import java.util.Collections;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Event;

public abstract class CreationToolTest extends DiagramTestCase {

	public CreationToolTest(String name) {
		super(name);
	}

	protected void createConnectionByToolDoubleClick(ConnectionCreationTool tool) {
		tool.setEditDomain((EditDomain) getDiagramEditDomain());
		tool.activate();
		tool.mouseDoubleClick(createMouseEvent(0, 0), getDiagramEditPart().getViewer());
		tool.deactivate();
	}

	protected void createConnectionByTool(ConnectionCreationTool tool, IGraphicalEditPart sourceEditPart, IGraphicalEditPart targetEditPart) {
		Point source = sourceEditPart.getFigure().getBounds().getTopLeft();
		Point target = targetEditPart.getFigure().getBounds().getTopLeft();
		createConnectionByTool(tool, source.x, source.y, target.x, target.y);
	}

	protected void createConnectionByTool(ConnectionCreationTool tool, int x1, int y1, int x2, int y2) {
		tool.setEditDomain((EditDomain) getDiagramEditDomain());
		tool.activate();
		tool.mouseMove(createMouseEvent(x1, y1), getDiagramEditPart().getViewer());
		tool.mouseDown(createMouseEvent(x1, y1), getDiagramEditPart().getViewer());
		tool.mouseDrag(createMouseEvent(x2, y2), getDiagramEditPart().getViewer());
		tool.mouseUp(createMouseEvent(x2, y2), getDiagramEditPart().getViewer());
		tool.deactivate();
	}

	protected void createNodeByTool(IElementType elementType) {
		createNodeByTool(elementType, 70, 70);
	}

	protected void createNodeByTool(IElementType elementType, int x, int y) {
		UnspecifiedTypeCreationTool tool = new UnspecifiedTypeCreationTool(Collections.singletonList(elementType));
		tool.setEditDomain((EditDomain) getDiagramEditDomain());
		tool.activate();
		tool.mouseMove(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.mouseDown(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.mouseUp(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.deactivate();
	}

	private MouseEvent createMouseEvent(int x, int y) {
		Event e = new Event();

		e.widget = getDiagramEditPart().getViewer().getControl();
		e.display = e.widget.getDisplay();
		e.button = 1; // left button
		e.x = x;
		e.y = y;

		return new MouseEvent(e);
	}

}
