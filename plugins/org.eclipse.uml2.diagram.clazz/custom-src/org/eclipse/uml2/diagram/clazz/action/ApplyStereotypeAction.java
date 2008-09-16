package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.clazz.part.CustomMessages;
import org.eclipse.uml2.diagram.common.commands.ApplyOrUnapplyStereotypeCommand;
import org.eclipse.uml2.diagram.common.commands.RefreshLabelsCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class ApplyStereotypeAction extends DiagramAction {

	private static final String EMPTY_NAME = CustomMessages.ApplyStereotypeAction_empty_name;

	private Element myElement;

	private Stereotype myStereotype;

	public ApplyStereotypeAction(IWorkbenchPage workbenchPage, Element element, Stereotype stereotype) {
		super(workbenchPage);
		myElement = element;
		myStereotype = stereotype;
	}

	@Override
	protected Request createTargetRequest() {
		return null;
	}

	@Override
	protected boolean isSelectionListener() {
		return true;
	}

	@Override
	protected Command getCommand() {
		final IGraphicalEditPart elementEditPart = getElementEditPart();
		if (elementEditPart == null) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain editingDomain = elementEditPart.getEditingDomain();
		ApplyOrUnapplyStereotypeCommand.ApplyOrUnapplyStereotypeRequest request = new ApplyOrUnapplyStereotypeCommand.ApplyOrUnapplyStereotypeRequest(editingDomain, myElement, myStereotype);
		CompoundCommand command = new CompoundCommand();
		command.add(new ICommandProxy(new ApplyOrUnapplyStereotypeCommand(request)));
		command.add(new RefreshLabelsCommand(elementEditPart));
		return command;
	}

	@Override
	public boolean isEnabled() {
		return getElementEditPart() != null;
	}

	@Override
	public void refresh() {
		super.refresh();
		setText(calculateText());
		setChecked(calculateChecked());
	}

	private String calculateText() {
		String name = myStereotype.getQualifiedName();
		return name != null ? name : EMPTY_NAME;
	}

	private boolean calculateChecked() {
		return isStereotypeAppliedTo(myElement, myStereotype);
	}

	private IGraphicalEditPart getElementEditPart() {
		for (Object next : getSelectedObjects()) {
			if (next instanceof IGraphicalEditPart) {
				IGraphicalEditPart elementEditPart = (IGraphicalEditPart) next;
				return elementEditPart;
			}
		}
		return null;
	}

	private boolean isStereotypeAppliedTo(Element element, Stereotype stereotype) {
		return element.isStereotypeApplied(stereotype);
	}

}
