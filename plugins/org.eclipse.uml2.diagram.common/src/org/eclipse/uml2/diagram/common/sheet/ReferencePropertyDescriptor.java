package org.eclipse.uml2.diagram.common.sheet;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

public class ReferencePropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	private final AdapterFactory myItemProvidersAdapterFactory;

	public ReferencePropertyDescriptor(Object sourceObject, IItemPropertyDescriptor itemPropertyDescriptor, String category, AdapterFactory itemProvidersAdapterFactory) {
		super(sourceObject, itemPropertyDescriptor, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	@Override
	protected CellEditor doCreateEditor(Composite composite) {
		final EStructuralFeature feature = (EStructuralFeature) getFeature();
		UMLElementChooserDialog dialog = new UMLElementChooserDialog(composite.getShell(), myItemProvidersAdapterFactory, (EObject) object, feature) {

			@Override
			protected boolean isValid(EObject selectedElement) {
				return feature.getEType().isInstance(selectedElement);
			}
		};
		return new ReferenceComboAndDialogCellEditor(composite, new ArrayList(getChoiceOfValues()), getLabelProvider(), true, dialog, TransactionUtil.getEditingDomain(object));

	}

}
