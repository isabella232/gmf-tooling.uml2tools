package org.eclipse.uml2.diagram.timing.edit.helpers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.RelatedUMLElementAccessor;
import org.eclipse.uml2.uml.Element;

/**
 * @generated
 */

public class TimingDBaseEditHelper extends AbstractEditHelper {

	/**
	 * @generated
	 */
	public static final String EDIT_POLICY_COMMAND = "edit policy command"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ELEMENT_TYPE = "context element type"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {
		if (req.getParameter(CONTEXT_ELEMENT_TYPE) instanceof IElementType) {
			return ElementTypeRegistry.getInstance().getEditHelperAdvice((IElementType) req.getParameter(CONTEXT_ELEMENT_TYPE));
		}
		return super.getEditHelperAdvice(req);
	}

	/**
	 * @generated
	 */
	protected ICommand getInsteadCommand(IEditCommandRequest req) {
		ICommand epCommand = (ICommand) req.getParameter(EDIT_POLICY_COMMAND);
		req.setParameter(EDIT_POLICY_COMMAND, null);
		ICommand ehCommand = super.getInsteadCommand(req);
		if (epCommand == null) {
			return ehCommand;
		}
		if (ehCommand == null) {
			return epCommand;
		}
		CompositeCommand command = new CompositeCommand(null);
		command.add(epCommand);
		command.add(ehCommand);
		return command;
	}

	/**
	 * @generated
	 */
	protected ICommand getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected ICommand getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated NOT
	 */
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		if (req.getElementToDestroy() != null){
			RelatedUMLElementAccessor finder = new RelatedUMLElementAccessor();
			List<Element> umlCounterParts = finder.doSwitch(req.getElementToDestroy());
			if (umlCounterParts != null){
				CompositeTransactionalCommand result = new CompositeTransactionalCommand(req.getEditingDomain(), "");
				for (Element next : umlCounterParts){
					if (next == null){
						continue;
					}
					result.add(new DestroyElementCommand(new DestroyElementRequest(next, req.isConfirmationRequired())));
				}
				
				if (result.size() == 0){
					return  null;
				}
				return result.reduce();
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected ICommand getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @NOT-generated
	 */
	protected ICommand compose(AbstractTransactionalCommand first, ICommand second) {
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(first.getEditingDomain(), first.getLabel());
		cc.compose(first);
		cc.compose(second);
		return cc;
	}
	
	/**
	 * @NOT-generated
	 */
	protected ICommand compose(ICommand first, ICommand second, TransactionalEditingDomain domain) {
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(domain, first.getLabel());
		cc.compose(first);
		cc.compose(second);
		return cc;
	}
	
	protected static abstract class PushToUMLCommand extends AbstractTransactionalCommand {
		private final CreateElementRequest myReq;
		private final Element myUmlParent;

		public PushToUMLCommand(CreateElementRequest req, Element umlParent){
			super(req.getEditingDomain(), "", getWorkspaceFiles(umlParent));
			myReq = req;
			myUmlParent = umlParent;
		}
		
		public Element getUmlParent() {
			return myUmlParent;
		}
		
		public CreateElementRequest getCreateRequest() {
			return myReq;
		}
		
		public EObject getCreatedTimingDArtefact(){
			return myReq.getNewElement();
		}
	}
	
	
}
