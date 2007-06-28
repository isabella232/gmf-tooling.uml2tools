package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.part.CustomMessages;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Interface;


public class SetRectangleInterfaceNotation extends DiagramAction {
	private static final String DISABLED_TEXT = CustomMessages.SetRectangleInterfaceNotation_disabled_text; 
	private static final String DISABLED_TOOLTIP = CustomMessages.SetRectangleInterfaceNotation_disabled_tooltip;
	
	public SetRectangleInterfaceNotation(IWorkbenchPage workbenchPage, String actionId) {
		super(workbenchPage);
		setId(actionId);
	}
	
	@Override
	public void init() {
		super.init();
		updateText();
		setImageDescriptor(UMLElementTypes.getImageDescriptor(UMLElementTypes.getElement(UMLElementTypes.Interface_2010)));
	}
	
	@Override
	public void refresh() {
		super.refresh();
		updateText();
	}
	
	private void updateText(){
		GraphicalEditPart editPart = getSelectedEditPart();
		if (editPart instanceof InterfaceEditPart){
			setText(CustomMessages.SetRectangleInterfaceNotation_show_as_class_text);
			setToolTipText(CustomMessages.SetRectangleInterfaceNotation_show_as_class_tooltip);
			return;
		}
		if (editPart instanceof Interface2EditPart){
			setText(CustomMessages.SetRectangleInterfaceNotation_collapse_to_circle_text);
			setToolTipText(CustomMessages.SetRectangleInterfaceNotation_collapse_to_circle_tooltip);
			return;
		}
		setText(DISABLED_TEXT);
		setToolTipText(DISABLED_TOOLTIP);
	}
	
	@Override
	protected Request createTargetRequest() {
		return null;
	}
	
	@Override
	protected Command getCommand() {
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
	
	private Command getDeleteViewCommand(GraphicalEditPart editPart) {
		View view = (View)editPart.getModel();
		return new ICommandProxy(new DeleteCommand(view));
	}
	
	private Command getCreateViewCommand(GraphicalEditPart editPart) {
		CreateViewRequest createViewRequest = getCreateViewRequest(editPart);
		if (createViewRequest == null) {
			return null;
		}
		return editPart.getParent().getCommand(createViewRequest);
	}
	
	private CreateViewRequest getCreateViewRequest(GraphicalEditPart editPart) {
		View view = (View)editPart.getModel();
		if (view == null ||  false == view.getElement() instanceof Interface) {
			return null;
		}
		Interface interface1 = (Interface) view.getElement();
		String semanticHint = getSemanticHint(editPart);
		ViewDescriptor viewDescriptor = 
			new ViewDescriptor(new EObjectAdapter(interface1), Node.class, semanticHint, getPreferencesHint());		
		CreateViewRequest createViewRequest = new CreateViewRequest(viewDescriptor);
		createViewRequest.setLocation(getLocation(editPart));
		return createViewRequest;
	}
	private String getSemanticHint(GraphicalEditPart editPart) {
		String semanticHint = (editPart instanceof InterfaceEditPart) ? String.valueOf(Interface2EditPart.VISUAL_ID) : String.valueOf(InterfaceEditPart.VISUAL_ID);
		return semanticHint;
	}
	private Point getLocation(GraphicalEditPart editPart) {
		return editPart.getFigure().getBounds().getTopLeft();
	}

	@Override
	protected boolean isSelectionListener() {
		return true;
	}
	
	private GraphicalEditPart getSelectedEditPart() {
		for (Object ob: getSelectedObjects()) {
			if (ob instanceof GraphicalEditPart) {
				return (GraphicalEditPart)ob;
			}
		}
		return null;
	}

}
