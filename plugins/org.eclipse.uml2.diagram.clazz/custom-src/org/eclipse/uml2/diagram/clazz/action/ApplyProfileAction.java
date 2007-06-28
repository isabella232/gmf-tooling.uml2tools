package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.part.CustomMessages;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;


public class ApplyProfileAction extends DiagramAction {
	private static final String EMPTY_NAME = CustomMessages.ApplyProfileAction_empty_name;
	private  org.eclipse.uml2.uml.Package myPackage;
	private Profile myProfile;

	public ApplyProfileAction(IWorkbenchPage workbenchPage, org.eclipse.uml2.uml.Package package_, Profile profile) {
		super(workbenchPage);
		myPackage = package_;
		myProfile = profile;
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
		PackageEditPart packageEditPart = getPackageEditPart();
		if (packageEditPart == null) {
			return UnexecutableCommand.INSTANCE;
		}
		TransactionalEditingDomain editingDomain = packageEditPart.getEditingDomain();
		IEditCommandRequest request = new AbstractEditCommandRequest(editingDomain) {

			public Object getEditHelperContext() {
				// TODO Auto-generated method stub
				return null;
			}};
		boolean toApply = !isProfileAppliedTo(myPackage, myProfile);
		if (toApply) {
			return new ICommandProxy(new ApplyProfileCommand(CustomMessages.ApplyProfileAction_apply_profile_command, myPackage, myProfile, request));
		} 
		return new ICommandProxy(new UnapplyProfileCommand(CustomMessages.ApplyProfileAction_unapply_profile_command, myPackage, myProfile, request));
	}


	@Override
	public boolean isEnabled() {
		return getPackageEditPart() != null;
	}

	@Override
	public void refresh() {
		super.refresh();
		setText(calculateText());
		setChecked(calculateChecked());
	}
	
	private String calculateText() {
		String name = myProfile.getName(); 
		return name != null ? name : EMPTY_NAME;
	}

	private boolean calculateChecked() {
		return isProfileAppliedTo(myPackage, myProfile);
	}

	private PackageEditPart getPackageEditPart() {
		for (Object next : getSelectedObjects()) {
			if (next instanceof PackageEditPart) {
				PackageEditPart packageEditPart = (PackageEditPart)next;
				return packageEditPart;
			}
		}
		return null;
	}

	private boolean isProfileAppliedTo( org.eclipse.uml2.uml.Package package_, Profile profile) {
		ProfileApplication profileApplication = package_.getProfileApplication(profile);
		return profileApplication != null && profileApplication.getAppliedDefinition() == profile.getDefinition();
	}
	

	private class ApplyProfileCommand extends EditElementCommand {
		
		org.eclipse.uml2.uml.Package myPackage;
		private Profile myProfile;

		protected ApplyProfileCommand(String label, org.eclipse.uml2.uml.Package package_, Profile profile, IEditCommandRequest request) {
			super(label, package_, request);
			myPackage = package_;
			myProfile = profile;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			myPackage.applyProfile(myProfile);
			return CommandResult.newOKCommandResult(myProfile);
		}
		
	}
	private class UnapplyProfileCommand extends EditElementCommand {
		
		org.eclipse.uml2.uml.Package myPackage;
		private Profile myProfile;

		protected UnapplyProfileCommand(String label, org.eclipse.uml2.uml.Package package_, Profile profile, IEditCommandRequest request) {
			super(label, package_, request);
			myPackage = package_;
			myProfile = profile;
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			myPackage.unapplyProfile(myProfile);
			return CommandResult.newOKCommandResult(myProfile);
		}
		
	}
}
