package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.part.CustomMessages;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.actions.ChangeNotationAction;


public class SetRectangleInterfaceNotation extends ChangeNotationAction {
	private static final String DISABLED_TEXT = CustomMessages.SetRectangleInterfaceNotation_disabled_text; 
	private static final String DISABLED_TOOLTIP = CustomMessages.SetRectangleInterfaceNotation_disabled_tooltip;

	public SetRectangleInterfaceNotation(IWorkbenchPage workbenchPage, String actionId) {
		super(workbenchPage, actionId);
	}

	@Override
	protected void updateImage() {
		setImageDescriptor(UMLElementTypes.getImageDescriptor(UMLElementTypes.getElement(UMLElementTypes.Interface_2010)));
	}

	@Override
	protected void updateText(){
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
	protected String getSemanticHint(GraphicalEditPart editPart) {
		String semanticHint = (editPart instanceof InterfaceEditPart) ? String.valueOf(Interface2EditPart.VISUAL_ID) : String.valueOf(InterfaceEditPart.VISUAL_ID);
		return semanticHint;
	}
}
