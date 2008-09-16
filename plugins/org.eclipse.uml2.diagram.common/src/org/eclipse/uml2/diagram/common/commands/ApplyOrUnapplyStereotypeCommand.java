package org.eclipse.uml2.diagram.common.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;


public class ApplyOrUnapplyStereotypeCommand extends EditElementCommand {

	public ApplyOrUnapplyStereotypeCommand(ApplyOrUnapplyStereotypeRequest request) {
		super(request.isApplyNotUnapply() ? "Apply" : "Anapply", request.getElement(), request);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		ApplyOrUnapplyStereotypeRequest request = (ApplyOrUnapplyStereotypeRequest) getRequest();
		if (request.isApplyNotUnapply()) {
			request.getElement().applyStereotype(request.getStereotype());
		} else {
			request.getElement().unapplyStereotype(request.getStereotype());
		}
		return CommandResult.newOKCommandResult(request.getElement());
	}
	
	public static class ApplyOrUnapplyStereotypeRequest extends AbstractEditCommandRequest {

		private final Element myElement;

		private final Stereotype myStereotype;

		public ApplyOrUnapplyStereotypeRequest(TransactionalEditingDomain domain, Element element, Stereotype stereotype) {
			super(domain);
			myElement = element;
			myStereotype = stereotype;
		}

		public Stereotype getStereotype() {
			return myStereotype;
		}

		public Element getElement() {
			return myElement;
		}

		public boolean isApplyNotUnapply() {
			return false == myElement.isStereotypeApplied(myStereotype);
		}
		
		public Object getEditHelperContext() {
			return null;
		}

	}
}
