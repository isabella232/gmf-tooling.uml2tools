package org.eclipse.uml2.diagram.profile.part;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.uml2.uml.NamedElement;

public class UmlLabelProvider extends LabelProvider{
	public String getText(Object element) {
		if (element instanceof NamedElement) {
			return ((NamedElement)element).getQualifiedName();
		}
		return super.getText(element);
	}
}
