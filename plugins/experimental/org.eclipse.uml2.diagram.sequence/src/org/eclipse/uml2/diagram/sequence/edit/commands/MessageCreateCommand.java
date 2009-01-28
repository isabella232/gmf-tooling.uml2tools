package org.eclipse.uml2.diagram.sequence.edit.commands;

import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.sequence.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.sequence.providers.ElementInitializers;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class MessageCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	private final Interaction container;

	/**
	 * @generated
	 */
	public MessageCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && !isValidEnd(source, true)) {
			return false;
		}
		if (target != null && !isValidEnd(target, false)) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (null == getContainer()) {
			return false;
		}
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateMessage_4001(getContainer(), getSource(), getTarget());
	}

	private BehaviorExecutionSpecification createBehaviorExecutionSpecification(Interaction interaction, Lifeline lifeline, int index, boolean forSource) {
		String prefix = forSource ? "invocation-" : "execution-";
		String withIndex = prefix + index + "-";
		MessageOccurrenceSpecification start = doCreateMessageOccurrence(interaction, withIndex + "start");
		BehaviorExecutionSpecification result = doCreateBehaviorExecution(interaction, withIndex + "body");
		MessageOccurrenceSpecification finish = doCreateMessageOccurrence(interaction, withIndex + "finish");

		setupBehaviorSpec(result, start, finish, lifeline);

		return result;
	}

	private BehaviorExecutionSpecification[] createBehaviorExecutionSpecificationsPair(Interaction interaction, Lifeline sourceLL, Lifeline targetLL, int messageIndex) {
		String invocationPrefix = "invocation-" + messageIndex + "-";
		String executionPrefix = "execution-" + messageIndex + "-";
		MessageOccurrenceSpecification invocationStart = doCreateMessageOccurrence(interaction, invocationPrefix + "start");
		MessageOccurrenceSpecification executionStart = doCreateMessageOccurrence(interaction, executionPrefix + "start");

		BehaviorExecutionSpecification invocation = doCreateBehaviorExecution(interaction, invocationPrefix + "body");
		BehaviorExecutionSpecification execution = doCreateBehaviorExecution(interaction, executionPrefix + "body");

		MessageOccurrenceSpecification executionFinish = doCreateMessageOccurrence(interaction, executionPrefix + "finish");
		MessageOccurrenceSpecification invocationFinish = doCreateMessageOccurrence(interaction, invocationPrefix + "finish");

		setupBehaviorSpec(invocation, invocationStart, invocationFinish, sourceLL);
		setupBehaviorSpec(execution, executionStart, executionFinish, targetLL);

		return new BehaviorExecutionSpecification[] { invocation, execution };
	}

	private void setupBehaviorSpec(BehaviorExecutionSpecification spec, MessageOccurrenceSpecification start, MessageOccurrenceSpecification finish, Lifeline lifeline) {
		setSingleCovered(spec, lifeline);
		setSingleCovered(start, lifeline);
		setSingleCovered(finish, lifeline);

		spec.setStart(start);
		spec.setFinish(finish);
	}

	private void setSingleCovered(InteractionFragment fragment, Lifeline lifeline) {
		if (!fragment.getCovereds().contains(lifeline)) {
			fragment.getCovereds().add(lifeline);
		}
	}

	private BehaviorExecutionSpecification createBehaviorExecutionSpecification(Interaction interaction, BehaviorExecutionSpecification parentSpec, int index, boolean forSource) {
		String prefix = forSource ? "invocation-" : "execution-";
		String withIndex = prefix + index + "-";
		MessageOccurrenceSpecification start = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		start.setName(withIndex + "start");

		BehaviorExecutionSpecification result = UMLFactory.eINSTANCE.createBehaviorExecutionSpecification();
		result.setName(withIndex + "body");

		MessageOccurrenceSpecification finish = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		start.setName(withIndex + "finish");

		List<BehaviorExecutionSpecification> existingNested = UMLDiagramUpdater.getNestedSpecs(parentSpec);
		InteractionFragment justBeforeNewStart = existingNested.isEmpty() ? parentSpec : existingNested.get(existingNested.size() - 1).getFinish();
		for (ListIterator<InteractionFragment> it = interaction.getFragments().listIterator(); it.hasNext();) {
			InteractionFragment next = it.next();
			if (next == justBeforeNewStart) {
				it.add(start);
				it.add(result);
				it.add(finish);
			}
		}

		Lifeline parentLifeline = parentSpec.getCovereds().get(0);
		setupBehaviorSpec(result, start, finish, parentLifeline);

		return result;
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		Interaction interaction = getContainer();
		int count = interaction.getMessages().size() + 1;

		Element diagramSource = getSource();
		Element diagramTarget = getTarget();
		MessageEnd domainSource;
		MessageEnd domainTarget;

		if (diagramSource instanceof Gate && diagramTarget instanceof Lifeline) {
			domainSource = (Gate) diagramSource;
			BehaviorExecutionSpecification targetExecution = createBehaviorExecutionSpecification(interaction, (Lifeline) diagramTarget, count, false);
			domainTarget = (MessageOccurrenceSpecification) targetExecution.getStart();
		} else if (diagramTarget instanceof Gate && diagramSource instanceof Lifeline) {
			domainTarget = (Gate) diagramTarget;
			BehaviorExecutionSpecification sourceInvocation = createBehaviorExecutionSpecification(interaction, (Lifeline) diagramSource, count, true);
			domainSource = (MessageOccurrenceSpecification) sourceInvocation.getStart();
		} else if (diagramTarget instanceof Lifeline && diagramSource instanceof Lifeline) {
			Lifeline sourceLL = (Lifeline) diagramSource;
			Lifeline targetLL = (Lifeline) diagramTarget;
			BehaviorExecutionSpecification[] pair = createBehaviorExecutionSpecificationsPair(interaction, sourceLL, targetLL, count);
			BehaviorExecutionSpecification invocation = pair[0];
			BehaviorExecutionSpecification execution = pair[1];

			domainSource = (MessageOccurrenceSpecification) invocation.getStart();
			domainTarget = (MessageOccurrenceSpecification) execution.getStart();
		} else {
			throw new UnsupportedOperationException("Message between this elements can't be created: from: " + getSource() + " to: " + getTarget());
		}

		Message newElement = null;
		if (domainSource != null && domainTarget != null) {
			newElement = interaction.createMessage("");
			interaction.getMessages().add(newElement);
			newElement.setSendEvent(domainSource);
			newElement.setReceiveEvent(domainTarget);

			domainSource.setMessage(newElement);
			domainTarget.setMessage(newElement);
		}

		ElementInitializers.init_Message_4001(newElement);
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(Message newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Element getSource() {
		return (Element) source;
	}

	/**
	 * @generated
	 */
	protected Element getTarget() {
		return (Element) target;
	}

	/**
	 * @generated
	 */
	public Interaction getContainer() {
		return container;
	}

	/**
	 * Default approach is to traverse ancestors of the source to find instance of container.
	 * Modify with appropriate logic.
	 * @generated
	 */
	private static Interaction deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof Interaction) {
				return (Interaction) element;
			}
		}
		return null;
	}

	private boolean isValidEnd(EObject diagramEnd, boolean startNotFinish) {
		if (diagramEnd instanceof Gate) {
			return true;
		}
		if (diagramEnd instanceof Lifeline) {
			return true;
		}
		if (diagramEnd instanceof BehaviorExecutionSpecification) {
			BehaviorExecutionSpecification execution = (BehaviorExecutionSpecification) diagramEnd;
			//FIXME (???)
			//OccurrenceSpecification occurr = (startNotFinish) ? execution.getStart() : execution.getFinish();
			OccurrenceSpecification occurr = execution.getStart();
			return occurr instanceof MessageOccurrenceSpecification;
		}
		return false;
	}

	private static MessageOccurrenceSpecification doCreateMessageOccurrence(Interaction interaction, String name) {
		EClass meta = UMLPackage.eINSTANCE.getMessageOccurrenceSpecification();
		return (MessageOccurrenceSpecification) interaction.createFragment(name, meta);
	}

	private static BehaviorExecutionSpecification doCreateBehaviorExecution(Interaction interaction, String name) {
		EClass meta = UMLPackage.eINSTANCE.getBehaviorExecutionSpecification();
		return (BehaviorExecutionSpecification) interaction.createFragment(name, meta);
	}
}
