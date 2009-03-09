package org.eclipse.uml2.diagram.codegen.ui;

import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesAction;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesOperation;
import org.eclipse.uml2.diagram.codegen.CodegenEmittersExt;
import org.eclipse.uml2.diagram.codegen.GeneratorExt;

public class ExecuteTemplatesActionExt extends ExecuteTemplatesAction {

	@Override
	protected ExecuteTemplatesOperation createOperation() {
		return new ExecuteTemplatesOperation() {

			@Override
			protected Generator createGenerator() {
				GenEditorGenerator genModel = getGenModel();
				return new GeneratorExt(genModel, new CodegenEmittersExt(!genModel.isDynamicTemplates(), genModel.getTemplateDirectory(), genModel.getModelAccess() != null));
			}
		};
	}
}
