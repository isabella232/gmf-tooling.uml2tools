package org.eclipse.uml2.diagram.codegen.qvt;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

public class NativeEMFUtils {

	@Operation(contextual = false, kind = Kind.HELPER)
	public static String getSimpleClassName(String fqn) {
		return org.eclipse.emf.codegen.util.CodeGenUtil.getSimpleClassName(fqn);
	}

	@Operation(contextual = false, kind = Kind.HELPER)
	public static String getPackageName(String fqn) {
		return org.eclipse.emf.codegen.util.CodeGenUtil.getPackageName(fqn);
	}
}