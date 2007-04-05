package org.eclipse.uml2.diagram.codegen.ui;

import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesAction;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesOperation;
import org.eclipse.uml2.diagram.codegen.ExecuteTemplatesOperationExt;


public class ExecuteTemplatesActionExt extends ExecuteTemplatesAction {
	@Override
	protected ExecuteTemplatesOperation createOperation() {
		return new ExecuteTemplatesOperationExt();
	}
}
