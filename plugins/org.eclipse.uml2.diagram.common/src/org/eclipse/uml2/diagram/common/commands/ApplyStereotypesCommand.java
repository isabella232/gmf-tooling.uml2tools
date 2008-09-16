package org.eclipse.uml2.diagram.common.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;


public class ApplyStereotypesCommand extends EditElementCommand {

	public ApplyStereotypesCommand(ApplyStereotypesRequest request) {
		super("Apply", request.getElement(), request);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		ApplyStereotypesRequest request = (ApplyStereotypesRequest) getRequest();
		Element subject = request.getElement();
		StringTokenizer t = new StringTokenizer(request.getEditString(), ",");
		List<String> toApply = new ArrayList<String>(t.countTokens());
		while (t.hasMoreTokens()) {
			toApply.add(t.nextToken().trim());
		}
		for (Stereotype applied: subject.getAppliedStereotypes()) {
			if (false == toApply.contains(applied.getName())) {
				subject.unapplyStereotype(applied);
			}
		}
		for (Stereotype applicable: subject.getApplicableStereotypes()) {
			if (toApply.contains(applicable.getName()) && (subject.getAppliedStereotype(applicable.getQualifiedName()) == null)) {
				subject.applyStereotype(applicable);
			}
		}
		return CommandResult.newOKCommandResult(request.getElement());
	}
	
	public static class ApplyStereotypesRequest extends AbstractEditCommandRequest {

		private final Element myElement;

		private final String myEditString;

		public ApplyStereotypesRequest(TransactionalEditingDomain domain, Element element, String inplaceString) {
			super(domain);
			myElement = element;
			myEditString = inplaceString;
		}

		public String getEditString() {
			return myEditString;
		}

		public Element getElement() {
			return myElement;
		}

		public Object getEditHelperContext() {
			return null;
		}

	}
}
