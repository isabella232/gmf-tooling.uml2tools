package org.eclipse.uml2.diagram.common.actions;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.uml.Interface;


public abstract class ChangeNotationAction extends DiagramAction {
	public ChangeNotationAction(IWorkbenchPage workbenchPage, String actionId) {
		super(workbenchPage);
		setId(actionId);
	}
	
	@Override
	public void init() {
		super.init();
		updateText();
		updateImage();
	}
	
	@Override
	public void refresh() {
		super.refresh();
		updateText();
		updateImage();
	}
	
	protected abstract String getSemanticHint(GraphicalEditPart editPart);
	
	protected void updateImage(){
	}
	
	protected void updateText(){
	}
	
	
	@Override
	protected final Request createTargetRequest() {
		return null;
	}
	
	@Override
	protected final Command getCommand() {
		final GraphicalEditPart editPart = getSelectedEditPart();
		if (editPart == null) {
			return UnexecutableCommand.INSTANCE;
		}
		Command deleteCommand = getDeleteViewCommand(editPart);
		if (deleteCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}
		Command createViewCommand = getCreateViewCommand(editPart);
		if (createViewCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}
		CompoundCommand command = new CompoundCommand(getCommandLabel());
		command.add(deleteCommand);
		command.add(createViewCommand);
		return command.isEmpty() ? UnexecutableCommand.INSTANCE
				: (Command) command;
	}
	
	protected final Command getDeleteViewCommand(GraphicalEditPart editPart) {
		View view = (View)editPart.getModel();
		return new ICommandProxy(new DeleteCommand(view));
	}
	
	protected final Command getCreateViewCommand(GraphicalEditPart editPart) {
		CreateViewRequest createViewRequest = getCreateViewRequest(editPart);
		if (createViewRequest == null) {
			return null;
		}
		return editPart.getParent().getCommand(createViewRequest);
	}
	
	protected final CreateViewRequest getCreateViewRequest(GraphicalEditPart editPart) {
		View view = (View)editPart.getModel();
		EObject element = view.getElement();
		String semanticHint = getSemanticHint(editPart);
		ViewDescriptor viewDescriptor = 
			new ViewDescriptor(new EObjectAdapter(element), Node.class, semanticHint, getPreferencesHint());		
		CreateViewRequest createViewRequest = new CreateViewRequest(viewDescriptor);
		createViewRequest.setLocation(getLocation(editPart));
		return createViewRequest;
	}
	
	@Override
	protected final boolean isSelectionListener() {
		return true;
	}
	
	protected final GraphicalEditPart getSelectedEditPart() {
		for (Object ob: getSelectedObjects()) {
			if (ob instanceof GraphicalEditPart) {
				return (GraphicalEditPart)ob;
			}
		}
		return null;
	}

	private Point getLocation(GraphicalEditPart editPart) {
		return editPart.getFigure().getBounds().getTopLeft();
	}
}
