package org.eclipse.uml2.diagram.codegen;

import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesOperation;

@SuppressWarnings("restriction")
public class ExecuteTemplatesOperationExt extends ExecuteTemplatesOperation {
	@Override
	protected Generator createGenerator() {
		GenEditorGenerator genModel = getGenModel();
		return new GeneratorExt(genModel, new CodegenEmittersExt(!genModel.isDynamicTemplates(), genModel.getTemplateDirectory()));
	}
}
