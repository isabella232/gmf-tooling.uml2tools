package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.Map;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.Request;


public class SetupAnchorsRequest extends Request {
	private static final String PREFIX = SetupAnchorsRequest.class.getName();
	public static final String TYPE = PREFIX + ":REQUEST_TYPE";

	private Point myLocation;
	private final Request myMainRequest;
	
	public SetupAnchorsRequest(Request mainRequest){
		super(TYPE);
		myMainRequest = mainRequest;
	}
	
	@SuppressWarnings("unchecked")
	public Map getTargetData(){
		return myMainRequest.getExtendedData();
	}
	
	public void setLocation(Point globalLocation){
		myLocation = globalLocation;
	}
	
	public Point getLocation() {
		return myLocation;
	}
	
}
