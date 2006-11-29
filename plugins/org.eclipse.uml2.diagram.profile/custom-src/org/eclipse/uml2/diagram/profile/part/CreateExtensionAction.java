package org.eclipse.uml2.diagram.profile.part;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

public class CreateExtensionAction extends ReferenceMetaclassAction {
	protected List<EObject> getSelectorChoices(EObject object) {
		return new UmlChoiceProvider() {
			protected boolean isValidElement(Object object) {
				return (object instanceof org.eclipse.uml2.uml.Class
						&& ((org.eclipse.uml2.uml.Class) object).isMetaclass());
			}
			
			protected EList getReferencedElements(EObject object) {
				return ((Stereotype)object).getExtendedMetaclasses();
			}
		}.getUmlElements(object);
	}
	
	protected void processSelection(EObject object, EObject choosenElement) {
		Stereotype stereotype = (Stereotype)object;
		org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class)choosenElement;
		Profile profile = stereotype.getProfile();
		// otherwise IllegalArgumentException is thrown
		// see StereotypeImpl
		if (!profile.getReferencedMetaclasses().contains(metaclass)
				&& !profile.getReferencedMetamodels()
					.contains(metaclass.getModel())) {
			profile.createMetamodelReference(metaclass.getModel());
		}
		stereotype
				.createExtension(metaclass, false);
	}

}
