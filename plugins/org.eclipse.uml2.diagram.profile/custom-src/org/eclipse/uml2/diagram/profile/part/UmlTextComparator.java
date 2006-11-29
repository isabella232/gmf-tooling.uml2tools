package org.eclipse.uml2.diagram.profile.part;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;

public class UmlTextComparator implements Comparator<EObject> {
	public int compare(EObject o1, EObject o2) {
		return getLabelProvider().getText(o1).compareTo(
				getLabelProvider().getText(o2));
	}

	private LabelProvider getLabelProvider() {
		if (myLabelProvider == null) {
			myLabelProvider = new UmlLabelProvider(); 
		}
		return myLabelProvider;
	}
	private static LabelProvider myLabelProvider;

}
