package org.eclipse.uml2.diagram.csd.action;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.common.actions.ChangeNotationAction;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.part.CustomMessages;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;

public class ChangePropertyNotation extends ChangeNotationAction {

	private static final String DISABLED_TEXT = CustomMessages.ChangePropertyNotation_disabled_text; 
	private static final String DISABLED_TOOLTIP = CustomMessages.ChangePropertyNotation_disabled_tooltip;

	public ChangePropertyNotation(IWorkbenchPage workbenchPage, String actionId) {
		super(workbenchPage, actionId);
	}

	@Override
	protected void updateImage() {
		setImageDescriptor(UMLElementTypes.getImageDescriptor(UMLElementTypes.getElement(UMLElementTypes.Class_2006)));
	}

	@Override
	protected void updateText(){
		GraphicalEditPart editPart = getSelectedEditPart();
		int vid = UMLVisualIDRegistry.getVisualID(editPart.getNotationView());
		if (vid == ClassEditPart.VISUAL_ID){
			setText(CustomMessages.ChangePropertyNotation_first_substitutable_text);
			setToolTipText(CustomMessages.ChangePropertyNotation_first_substitutable_tooltip);
			return;
		}
		if (vid == Class3EditPart.VISUAL_ID){
			setText(CustomMessages.ChangePropertyNotation_second_substitutable_text);
			setToolTipText(CustomMessages.ChangePropertyNotation_second_substitutable_tooltip);
			return;
		}
		setText(DISABLED_TEXT);
		setToolTipText(DISABLED_TOOLTIP);
	}
	
	@Override
	protected String getSemanticHint(GraphicalEditPart editPart) {
		int vid = UMLVisualIDRegistry.getVisualID(editPart.getNotationView());
		return (vid == ClassEditPart.VISUAL_ID) ? String.valueOf(Class3EditPart.VISUAL_ID) : String.valueOf(ClassEditPart.VISUAL_ID);
	}

}
