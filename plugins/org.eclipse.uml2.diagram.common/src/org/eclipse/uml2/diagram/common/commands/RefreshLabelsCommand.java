package org.eclipse.uml2.diagram.common.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;


public class RefreshLabelsCommand extends Command {
	private final IGraphicalEditPart myEditPart;
	
	public RefreshLabelsCommand(IGraphicalEditPart ep) {
		myEditPart = ep;
	}
	
	@Override
	public void execute() {
		for (Object nextChildEP : myEditPart.getChildren()){
			if (nextChildEP instanceof ITextAwareEditPart){
				((ITextAwareEditPart)nextChildEP).refresh();
			}
		}
	}

}
