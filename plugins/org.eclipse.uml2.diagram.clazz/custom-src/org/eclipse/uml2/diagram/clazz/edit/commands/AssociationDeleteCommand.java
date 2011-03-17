package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

public class AssociationDeleteCommand extends DestroyElementCommand {

	public AssociationDeleteCommand(DestroyElementRequest request) {
		super(request);
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		//look for Association Ends, which are not owned by the Association itself
		Association association = (Association) getElementToDestroy();
		EList<Property> memberEnds = association.getMemberEnds();
		for (Property p : memberEnds) {
			if (p.getOwner() != association) {
				EcoreUtil.remove(p);
			}
		}

		return super.doExecuteWithResult(monitor, info);
	}

}
