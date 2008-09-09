package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;


public class CreateSegmentTool extends UnspecifiedTypeCreationTool {
	public CreateSegmentTool(List<?> elementTypes) {
		super(elementTypes);
	}
	
	@Override
	protected void updateTargetRequest() {
		super.updateTargetRequest();
		if (getTargetEditPart() != null){
			SetupAnchorsRequest anchorsReq = new SetupAnchorsRequest(getTargetRequest());
			anchorsReq.setLocation(getLocation());
			
			Command setupAnchors = getTargetEditPart().getCommand(anchorsReq);
			if (setupAnchors != null && setupAnchors.canExecute()){
				setupAnchors.execute();
			}
		}
	}

}
