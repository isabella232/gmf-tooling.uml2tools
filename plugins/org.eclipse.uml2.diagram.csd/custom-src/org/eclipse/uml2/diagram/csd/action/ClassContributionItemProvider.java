package org.eclipse.uml2.diagram.csd.action;

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchPage;

public class ClassContributionItemProvider extends AbstractContributionItemProvider implements IProvider {
	public static final String ACTION_CHANGE_PROPERTY_NOTATION = "change_property_notation"; //$NON-NLS-1$
	
	@Override
	protected IAction createAction(String actionId, IWorkbenchPartDescriptor partDescriptor) {
		IWorkbenchPage workbenchPage = partDescriptor.getPartPage();
		if (ACTION_CHANGE_PROPERTY_NOTATION.equals(actionId)) {
			return new ChangePropertyNotation(workbenchPage, actionId);
		}
		return super.createAction(actionId, partDescriptor);
	}

}
