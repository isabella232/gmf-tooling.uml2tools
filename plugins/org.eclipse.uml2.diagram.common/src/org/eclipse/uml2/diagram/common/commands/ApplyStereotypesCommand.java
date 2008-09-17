package org.eclipse.uml2.diagram.common.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class ApplyStereotypesCommand extends EditElementCommand {

	public ApplyStereotypesCommand(ApplyStereotypesRequest request) {
		super("Apply", request.getElement(), request);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		ApplyStereotypesRequest request = (ApplyStereotypesRequest) getRequest();
		Element subject = request.getElement();
		List<String> toApply = request.getStereotypesToApply();
		for (Stereotype applied : subject.getAppliedStereotypes()) {
			if (false == toApply.contains(applied.getName())) {
				subject.unapplyStereotype(applied);
			}
		}
		for (Stereotype applicable : subject.getApplicableStereotypes()) {
			if (toApply.contains(applicable.getName()) && (subject.getAppliedStereotype(applicable.getQualifiedName()) == null)) {
				subject.applyStereotype(applicable);
			}
		}
		return CommandResult.newOKCommandResult(request.getElement());
	}

	@Override
	public boolean canExecute() {
		if (!super.canExecute()) {
			return false;
		}
		ApplyStereotypesRequest request = (ApplyStereotypesRequest) getRequest();
		Element subject = request.getElement();
		List<String> toApply = request.getStereotypesToApply();
		List<String> applicables = new ArrayList<String>();
		for (Stereotype stereo : subject.getApplicableStereotypes()) {
			applicables.add(stereo.getName());
		}
		for (String str : toApply) {
			if (false == applicables.contains(str)) {
				return false; 
			}
		}
		return true;
	}

	public static class ApplyStereotypesRequest extends AbstractEditCommandRequest {

		private final Element myElement;

		private final List<String> myToApply;

		public ApplyStereotypesRequest(TransactionalEditingDomain domain, Element element, List<String> toApply) {
			super(domain);
			myElement = element;
			myToApply = toApply;
		}

		public List<String> getStereotypesToApply() {
			return myToApply;
		}

		public Element getElement() {
			return myElement;
		}

		public Object getEditHelperContext() {
			return null;
		}

	}
}
