package org.eclipse.uml2.diagram.timing.edit.policies;

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
		setExtendedData(myMainRequest.getExtendedData());
	}
	
	public Request getMainRequest() {
		return myMainRequest;
	}
	
	public void setLocation(Point globalLocation){
		myLocation = globalLocation;
	}
	
	public Point getLocation() {
		return myLocation;
	}
	
}
