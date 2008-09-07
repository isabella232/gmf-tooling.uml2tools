package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;


public interface SegmentAnchor {
	public DSegmentEditPart getOverlappingSegment();
	public PrimaryShapeEditPart getLeftAnchor();
	public PrimaryShapeEditPart getRightAnchor();
	
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
}
