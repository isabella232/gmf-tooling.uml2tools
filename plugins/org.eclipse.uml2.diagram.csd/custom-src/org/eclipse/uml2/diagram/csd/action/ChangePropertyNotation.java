package org.eclipse.uml2.diagram.csd.action;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.common.actions.ChangeNotationAction;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;

public class ChangePropertyNotation extends ChangeNotationAction {

	private static final String DISABLED_TEXT = "Switch Property Notation"; 
	private static final String DISABLED_TOOLTIP = "Switch Property Notation to Rectangle or Label";

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
		if (editPart instanceof ClassEditPart){
			setText("Show Properties as Rectangle");
			setToolTipText("Switch Property Notation from Label to Rectangle");
			return;
		}
		if (editPart instanceof Class3EditPart){
			setText("Show Properties as Labels");
			setToolTipText("Switch Property Notation from Rectangle to Label");
			return;
		}
		setText(DISABLED_TEXT);
		setToolTipText(DISABLED_TOOLTIP);
	}
	
	@Override
	protected String getSemanticHint(GraphicalEditPart editPart) {
		return (editPart instanceof ClassEditPart) ? String.valueOf(Class3EditPart.VISUAL_ID) : String.valueOf(ClassEditPart.VISUAL_ID);
	}

}
