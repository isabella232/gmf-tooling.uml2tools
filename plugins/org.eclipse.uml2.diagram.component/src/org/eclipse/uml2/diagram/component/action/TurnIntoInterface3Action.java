package org.eclipse.uml2.diagram.component.action;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.common.actions.ChangeNotationAction;
import org.eclipse.uml2.diagram.component.edit.parts.Interface3EditPart;
import org.eclipse.uml2.diagram.component.part.Messages;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class TurnIntoInterface3Action extends ChangeNotationAction {

	/**
	 * @generated
	 */
	public static final String ACTION_ID = "set_Interface3_notation"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static final int NEW_VID = Interface3EditPart.VISUAL_ID;

	/**
	 * @generated
	 */
	public TurnIntoInterface3Action(IWorkbenchPage workbenchPage, String actionId) {
		super(workbenchPage, actionId);
	}

	/**
	 * @generated
	 */
	@Override
	public void refresh() {
		super.refresh();
		setChecked(calculateChecked());
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		GraphicalEditPart ep = getSelectedEditPart();
		return (ep == null) ? false : UMLVisualIDRegistry.getVisualID(ep.getNotationView()) != NEW_VID;
	}

	/**
	 * @generated
	 */
	public boolean calculateChecked() {
		GraphicalEditPart ep = getSelectedEditPart();
		return (ep == null) ? false : UMLVisualIDRegistry.getVisualID(ep.getNotationView()) == NEW_VID;
	}

	/**
	 * @generated
	 */
	@Override
	protected void updateText() {
		setText(Messages.TurnIntoInterface3Action_text);
		setText(Messages.TurnIntoInterface3Action_tooltiptext);
	}

	/**
	 * @generated
	 */
	@Override
	protected String getSemanticHint(GraphicalEditPart editPart) {
		return String.valueOf(NEW_VID);
	}

}
