package org.eclipse.uml2.diagram.clazz.tests.tool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.tests.diagram.ClassDiagramFacade;
import org.eclipse.uml2.diagram.common.tests.CreationToolTest;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;


public class ClassDiagramCreationToolTest extends CreationToolTest {

	public ClassDiagramCreationToolTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	protected ConnectionEditPart findConnection(DiagramEditPart diagram, int VID) {
		Iterator connections = diagram.getConnections().iterator();
		while (connections.hasNext()) {
			ConnectionEditPart next = (ConnectionEditPart) connections.next();
			if (UMLVisualIDRegistry.getVisualID(next.getNotationView()) == VID) {
				return next;
			}
		}
		return null;
	}

	protected List<ConnectionEditPart> findAllConnections(DiagramEditPart diagram, int VID) {
		Iterator connections = diagram.getConnections().iterator();
		List<ConnectionEditPart> result = new ArrayList<ConnectionEditPart>();
		while (connections.hasNext()) {
			ConnectionEditPart next = (ConnectionEditPart) connections.next();
			if (UMLVisualIDRegistry.getVisualID(next.getNotationView()) == VID) {
				result.add(next);
			}
		}
		return result;
	}

	@Override
	protected UMLDiagramFacade createDiagram() {
		return new ClassDiagramFacade(getTestProject().getFullPath());
	}
	
}
