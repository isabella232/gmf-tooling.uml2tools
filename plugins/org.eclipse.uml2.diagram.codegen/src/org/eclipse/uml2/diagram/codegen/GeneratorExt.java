package org.eclipse.uml2.diagram.codegen;

import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.internal.common.codegen.TextMerger;

public class GeneratorExt extends Generator {

	public GeneratorExt(GenEditorGenerator genModel, CodegenEmittersExt emitters) {
		super(genModel, emitters);
	}
	
	@Override
	protected TextMerger createMergeService() {
		//see #181484, temporary workaround
		final TextMerger defaultMerger = super.createMergeService();
		return new TextMerger(){
			@Override
			public String process(String fileNameExt, String oldText, String newText) {
				if ("properties".equals(fileNameExt) && newText != null && newText.contains("#seeBugzilla=181484")){
					return newText;
				}
				return defaultMerger.process(fileNameExt, oldText, newText);
			}
			
			@Override
			public String mergeJava(String oldText, String newText) {
				return defaultMerger.mergeJava(oldText, newText);
			}
			
			@Override
			public String mergeProperties(String oldText, String newText) {
				return defaultMerger.mergeProperties(oldText, newText);
			}
			
			@Override
			public String mergeXML(String oldText, String newText) {
				return defaultMerger.mergeXML(oldText, newText);
			}
		};
	}

}
