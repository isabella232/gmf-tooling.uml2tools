package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;


public interface SegmentAnchor {
	public EditPartAndGlobalBounds<DSegmentEditPart> getOverlappingSegmentEditPartData();
	public EditPartAndGlobalBounds<PrimaryShapeEditPart> getLeftAnchorEditPartData();
	public EditPartAndGlobalBounds<PrimaryShapeEditPart> getRightAnchorEditPartData();

	public static class Util {
		public static final String KEY_FOR_REQUEST_PARAMETERS = SegmentAnchor.Util.class.getSimpleName() + ":REQUEST_KEY";
		
		@SuppressWarnings("unchecked")
		public static void putAnchor(SegmentAnchor data, Request request){
			request.getExtendedData().put(KEY_FOR_REQUEST_PARAMETERS, data);
		}
		
		@SuppressWarnings("unchecked")
		public static void putAnchor(SegmentAnchor data, IEditCommandRequest request){
			request.getParameters().put(KEY_FOR_REQUEST_PARAMETERS, data);
		}
		
		public static SegmentAnchor getAnchor(Request request){
			return (SegmentAnchor) request.getExtendedData().get(KEY_FOR_REQUEST_PARAMETERS);
		}
		
		public static SegmentAnchor getAnchor(IEditCommandRequest request){
			return (SegmentAnchor) request.getParameters().get(KEY_FOR_REQUEST_PARAMETERS);
		}
	}
	
	public static class EditPartAndGlobalBounds<T extends IGraphicalEditPart> {
		private final Rectangle myGlobalBounds;
		private final T myEditPart;

		public EditPartAndGlobalBounds(T editPart, Rectangle globalBounds){
			myEditPart = editPart;
			myGlobalBounds = globalBounds;
		}
		
		public Rectangle getGlobalBounds() {
			return myGlobalBounds;
		}
		
		public T getEditPart() {
			return myEditPart;
		}
		
		public View getNotationView(){
			return myEditPart.getNotationView();
		}
		
		public EObject getSemanticElement(){
			return myEditPart.resolveSemanticElement();
		}

	}
	
	
}
