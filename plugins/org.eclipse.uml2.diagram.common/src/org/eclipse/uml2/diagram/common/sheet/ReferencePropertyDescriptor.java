package org.eclipse.uml2.diagram.common.sheet;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
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
		return new ReferenceComboAndDialogCellEditor(composite, new ArrayList(getChoiceOfValues()), getLabelProvider(), true, new UMLElementChooserDialog(composite.getShell(),
				myItemProvidersAdapterFactory, (EObject) object) {

			@Override
			protected boolean isCorrectElement(EObject selectedElement) {
				final EClassifier eType = feature.getEType();
				return eType.isInstance(selectedElement);
			}
		}, TransactionUtil.getEditingDomain(object));

	}

}
