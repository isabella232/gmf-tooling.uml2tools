package org.eclipse.uml2.diagram.clazz.async;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;


public class DiagramHeaderFilter extends ViewerFilter {
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return element instanceof SyncModelNode && !isDiagramHeader((SyncModelNode)element);
	}
	
	private boolean isDiagramHeader(SyncModelNode node){
		View view = node.getSyncModelView();
		return Package4EditPart.VISUAL_ID == UMLVisualIDRegistry.getVisualID(view);
	}

}
