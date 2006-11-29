package org.eclipse.uml2.diagram.profile.part;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

public class ReferenceMetamodelAction extends ReferenceMetaclassAction {

	protected List<EObject> getSelectorChoices(EObject object) {
		return new UmlChoiceProvider() {
			protected boolean isValidElement(Object object) {
				return object instanceof Model && ((Model) object).isMetamodel();
			}
			
			protected EList getReferencedElements(EObject object) {
				return ((Profile)object).getReferencedMetamodels();
			}
		}.getUmlElements(object);
	}
	protected void processSelection(EObject object, EObject choosenElement) {
		((Profile)object)
				.createMetamodelReference((Model) choosenElement);
	}

}
