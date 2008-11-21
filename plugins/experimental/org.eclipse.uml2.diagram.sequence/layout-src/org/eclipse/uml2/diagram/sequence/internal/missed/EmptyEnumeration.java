package org.eclipse.uml2.diagram.sequence.internal.missed;

import java.util.Enumeration;


public class EmptyEnumeration implements Enumeration {
	public boolean hasMoreElements() {
		return false;
	}

	public Object nextElement() {
		return null;
	}
	
	private static final EmptyEnumeration INSTANCE = new EmptyEnumeration();
	public static Enumeration getEnumeration(){
		return INSTANCE;
	}

}
