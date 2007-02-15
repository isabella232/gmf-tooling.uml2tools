package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchPage;

public class InterfaceContributionItemProvider extends AbstractContributionItemProvider implements IProvider {
	public static final String ACTION_RECTANGLE_INTERFACE_NOTATION = "change_interface_notation"; //$NON-NLS-1$
	
	protected IAction createAction(String actionId, IWorkbenchPartDescriptor partDescriptor) {
		IWorkbenchPage workbenchPage = partDescriptor.getPartPage();
		if (ACTION_RECTANGLE_INTERFACE_NOTATION.equals(actionId)) {
			return new SetRectangleInterfaceNotation(workbenchPage, actionId);
		}
		return super.createAction(actionId, partDescriptor);
	}

}
