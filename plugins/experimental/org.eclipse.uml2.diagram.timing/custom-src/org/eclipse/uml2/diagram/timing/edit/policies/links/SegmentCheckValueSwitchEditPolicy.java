package org.eclipse.uml2.diagram.timing.edit.policies.links;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.TimingDBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

public class SegmentCheckValueSwitchEditPolicy extends TimingDBaseItemSemanticEditPolicy {
	public static final String ROLE = SegmentCheckValueSwitchEditPolicy.class.getName() + ":Role";
	
	public SegmentCheckValueSwitchEditPolicy() {
		super(TimingDElementTypes.DSegment_3003);
	}
	
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return (req.getTarget() == null) ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
	}

	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return getGEFWrapper(new CheckValueSwitchCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}
	
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return getGEFWrapper(new CheckValueSwitchCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	public static class CheckValueSwitchCommand extends CreateElementCommand {
		private final EObject source;
		private final EObject target;
		private final DBlock container;

		public CheckValueSwitchCommand(CreateRelationshipRequest request, EObject source, EObject target) {
			super(request);
			this.source = source;
			this.target = target;
			if (request.getContainmentFeature() == null) {
				setContainmentFeature(TimingDPackage.eINSTANCE.getDBlock_Switches());
			}

			container = deduceContainer(source, target);
			if (container != null) {
				super.setElementToEdit(container);
			}
		}

		public boolean canExecute() {
			if (source == null && target == null) {
				return false;
			}
			if (source != null && false == source instanceof DSegment) {
				return false;
			}
			if (target != null && false == target instanceof DSegment && false == target instanceof DValueLine) {
				return false;
			}
			if (getSource() == null) {
				return true; // link creation is in progress; source is not defined yet
			}
			// target may be null here but it's possible to check constraint
			if (getContainer() == null) {
				return false;
			}
			//return TimingDBaseItemSemanticEditPolicy.LinkConstraints.canCreateDStateSwitch_4001(getContainer(), getSource(), getTarget());
			return true;
		}

		protected EObject doDefaultElementCreation() {
			//System.out.println("CheckValueSwitchCommand.doDefaultElementCreation()");
			return null;
		}

		protected EClass getEClassToEdit() {
			return TimingDPackage.eINSTANCE.getDBlock();
		}

		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			if (!canExecute()) {
				throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
			}
			return super.doExecuteWithResult(monitor, info);
		}

		protected ConfigureRequest createConfigureRequest() {
			ConfigureRequest request = super.createConfigureRequest();
			request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
			request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
			return request;
		}

		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		protected DSegment getSource() {
			return (DSegment) source;
		}

		protected EObject getTarget() {
			return target;
		}

		public DBlock getContainer() {
			return container;
		}

		private static DBlock deduceContainer(EObject source, EObject target) {
			if (source instanceof DSegment){
				DSegment srcSegment = (DSegment) source;
				return srcSegment.getState().getBlock();
			}
			if (target instanceof DSegment){
				DSegment destSegment = (DSegment) target;
				return destSegment.getState().getBlock();
			}
			if (target instanceof DValueLine){
				return ((DValueLine)target).getBlock();
			}
			return null;
		}

	}
	

}
