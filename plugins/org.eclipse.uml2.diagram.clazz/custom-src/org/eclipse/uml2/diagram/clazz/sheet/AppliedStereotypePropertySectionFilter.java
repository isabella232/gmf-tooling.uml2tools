package org.eclipse.uml2.diagram.clazz.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Element;

public class AppliedStereotypePropertySectionFilter implements IFilter {

	public boolean select(Object toTest) {
		Object transformed = transformSelection(toTest);
		return (transformed instanceof Element) && (false == ((Element)transformed).getAppliedStereotypes().isEmpty());
	}

	protected Object transformSelection(Object selected) {

		if (selected instanceof EditPart) {
			Object model = ((EditPart) selected).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (selected instanceof View) {
			return ((View) selected).getElement();
		}
		if (selected instanceof IAdaptable) {
			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return selected;
	}

}
