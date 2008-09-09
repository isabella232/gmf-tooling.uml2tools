package org.eclipse.uml2.diagram.timing.edit.policies.create;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;


public class CreateSwitchHelper {
	private final PreferencesHint myPreferencesHint;

	public CreateSwitchHelper(PreferencesHint preferencesHint){
		myPreferencesHint = preferencesHint;
	}
	
	public Edge createSwitchEdge(View fromView, DSegmentEnd from, View toView, DSegmentStart to){
		View srcSegmentView = (View) fromView.eContainer();
		View destSegmentView = (View) toView.eContainer();
		if (srcSegmentView == null || destSegmentView == null){
			throw new IllegalStateException("Segment end is not inside segment");
		}
		
		DStateSwitch newSwitch = SemanticHelper.createSemanticSwitch(from, to);
		Edge edge = createEdgeWithService(newSwitch, fromView, toView, DStateSwitchEditPart.VISUAL_ID);
		return edge;
	}
	
	private Edge createEdgeWithService(EObject semanticElement, View from, View to, int linkVisualId){
		IElementType elementType = TimingDElementTypes.getElementType(linkVisualId);
		IAdaptable semanticAdapter = new ElementTypeAwareAdapter(semanticElement, elementType);
		Diagram diagram = from.getDiagram();
		String type = TimingDVisualIDRegistry.getType(linkVisualId);
		
		Edge edge = ViewService.getInstance().createEdge(semanticAdapter, diagram, type, ViewUtil.APPEND, true, myPreferencesHint);
		if (edge != null && edge.getSource() == null){
			edge.setSource(from);
		}
		if (edge != null && edge.getTarget() == null){
			edge.setTarget(to);
		}
		return edge;
	}
	
	private static class ElementTypeAwareAdapter extends EObjectAdapter {
		private final IElementType myElementType;

		public ElementTypeAwareAdapter(EObject subject, IElementType elementType){
			super(subject);
			myElementType = elementType;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public Object getAdapter(Class adapter) {
			if (adapter.isInstance(myElementType)) {
				return myElementType;
			}
			return super.getAdapter(adapter);
		}
	}
	
}
