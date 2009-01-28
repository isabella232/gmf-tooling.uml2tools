package org.eclipse.uml2.diagram.sequence.edit.commands;

import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.sequence.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.sequence.providers.ElementInitializers;
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
public class MessageCreateCommand extends CreateElementCommand {

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
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(UMLPackage.eINSTANCE.getInteraction_Message());
		}

		container = deduceContainer(source, target);
		if (container != null) {
			super.setElementToEdit(container);
		}
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

	/**
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		Interaction interaction = getContainer();
		int count = interaction.getMessages().size() + 1;

		Element diagramSource = getSource();
		MessageEnd domainSource = null;
		if (diagramSource instanceof Gate) {
			domainSource = (Gate) diagramSource;
		} else if (diagramSource instanceof Lifeline) {
			diagramSource = createBehaviorExecutionSpecification(interaction, (Lifeline) diagramSource, count, true);
		}

		if (diagramSource instanceof BehaviorExecutionSpecification) {
			BehaviorExecutionSpecification execution = (BehaviorExecutionSpecification) diagramSource;
			if (execution.getStart() instanceof MessageOccurrenceSpecification) {
				domainSource = (MessageOccurrenceSpecification) execution.getStart();
			}
		}

		Element diagramTarget = getTarget();
		MessageEnd domainTarget = null;
		if (diagramTarget instanceof Gate) {
			domainTarget = (Gate) diagramTarget;
		} else if (diagramTarget instanceof Lifeline) {
			diagramTarget = createBehaviorExecutionSpecification(interaction, (Lifeline) diagramTarget, count, false);
		}

		if (diagramTarget instanceof BehaviorExecutionSpecification) {
			BehaviorExecutionSpecification execution = (BehaviorExecutionSpecification) diagramTarget;
			if (execution.getStart() instanceof MessageOccurrenceSpecification) { //or finish???
				domainTarget = (MessageOccurrenceSpecification) execution.getStart();
			}
		}

		Message newMessage = null;
		if (domainSource != null && domainTarget != null) {
			newMessage = interaction.createMessage("");
			interaction.getMessages().add(newMessage);
			newMessage.setSendEvent(domainSource);
			newMessage.setReceiveEvent(domainTarget);

			domainSource.setMessage(newMessage);
			domainTarget.setMessage(newMessage);
		}

		ElementInitializers.init_Message_4001(newMessage);
		return newMessage;
	}

	private BehaviorExecutionSpecification createBehaviorExecutionSpecification(Interaction interaction, Lifeline lifeline, int index, boolean forSource) {
		String prefix = forSource ? "invocation-" : "execution-";
		String withIndex = prefix + index + "-";
		MessageOccurrenceSpecification start = (MessageOccurrenceSpecification) interaction.createFragment(withIndex + "start", UMLPackage.eINSTANCE.getMessageOccurrenceSpecification());
		BehaviorExecutionSpecification result = (BehaviorExecutionSpecification) interaction.createFragment(withIndex + "body", UMLPackage.eINSTANCE.getBehaviorExecutionSpecification());
		MessageOccurrenceSpecification finish = (MessageOccurrenceSpecification) interaction.createFragment(withIndex + "finish", UMLPackage.eINSTANCE.getMessageOccurrenceSpecification());

		setupBehaviorSpec(result, start, finish, lifeline);

		return result;
	}
	
	private void setupBehaviorSpec(BehaviorExecutionSpecification spec, MessageOccurrenceSpecification start, MessageOccurrenceSpecification finish, Lifeline lifeline){
		setSingleCovered(spec, lifeline);
		setSingleCovered(start, lifeline);
		setSingleCovered(finish, lifeline);
		
		spec.setStart(start);
		spec.setFinish(finish);
	}
	
	private void setSingleCovered(InteractionFragment fragment, Lifeline lifeline) {
		if (!fragment.getCovereds().contains(lifeline)){
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
		for (ListIterator<InteractionFragment> it = interaction.getFragments().listIterator(); it.hasNext();){
			InteractionFragment next = it.next();
			if (next == justBeforeNewStart){
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
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getInteraction();
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
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
}
