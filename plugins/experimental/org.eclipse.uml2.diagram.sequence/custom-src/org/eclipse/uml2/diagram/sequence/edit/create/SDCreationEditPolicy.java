package org.eclipse.uml2.diagram.sequence.edit.create;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.diagram.sequence.model.SDModelAccess;

public class SDCreationEditPolicy extends CreationEditPolicyWithCustomReparent {

	public SDCreationEditPolicy(IVisualIDRegistry visualIdRegistry) {
		super(visualIdRegistry);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Command getCreateCommand(CreateViewRequest request) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);

		Iterator descriptors = request.getViewDescriptors().iterator();

		while (descriptors.hasNext()) {
			CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptors.next();

			CreateCommand createCommand = new CreateCommand(editingDomain, descriptor, (View) (getHost().getModel()));

			cc.compose(createCommand);
		}
		
		if (cc.canExecute()){
			cc.compose(SDModelAccess.getInvalidateSDModelCommand((IGraphicalEditPart) getHost()));
		}
		
		return new ICommandProxy(cc.reduce());
	}
	
}
