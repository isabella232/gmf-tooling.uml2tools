package org.eclipse.uml2.diagram.codegen;

import org.eclipse.gmf.codegen.util.CodegenEmitters;
import org.eclipse.gmf.internal.codegen.dispatch.StaticTemplateRegistry;


public class CodegenEmittersExt extends CodegenEmitters {

	public CodegenEmittersExt(boolean usePrecompiled, String templateDirectory) {
		super(usePrecompiled, templateDirectory, extendVariables(), extendRegistry());
	}
	
	private static String[] extendVariables(){
		String[] defaultVariables = getDefaultVariables();
		String[] extended = new String[] {
			"org.eclipse.uml2.diagram.codegen", 
		};
		
		String[] result = new String[defaultVariables.length + extended.length];
		System.arraycopy(defaultVariables, 0, result, 0, defaultVariables.length);
		System.arraycopy(extended, 0, result, defaultVariables.length, extended.length);
		return result;
	}
	
	private static StaticTemplateRegistry extendRegistry(){
		return new StaticTemplateRegistry(CodegenEmittersExt.class.getClassLoader());
	}

}
