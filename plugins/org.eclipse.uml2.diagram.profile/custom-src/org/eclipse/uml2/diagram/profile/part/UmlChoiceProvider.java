package org.eclipse.uml2.diagram.profile.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UmlChoiceProvider {
	public List<EObject> getUmlElements(EObject source) {
		List<EObject> choiceOfValues = new ArrayList<EObject>();
		EList referencedMetaclasses = getReferencedElements(source);
		Resource resource = source.eResource().getResourceSet().getResource(
				URI.createURI(UMLResource.UML_METAMODEL_URI), true);

		for (Iterator contents = resource.getAllContents(); contents.hasNext();) {

			Object object = contents.next();
			if (isValidElement(object)
					&& !referencedMetaclasses.contains(object)) {
				choiceOfValues.add((EObject) object);
			}
		}
		Collections.sort(choiceOfValues, new UmlTextComparator());
		return choiceOfValues;
	}
	protected boolean isValidElement(Object object) {
		return true;
	}
	
	protected EList getReferencedElements(EObject object) {
		return new BasicEList();
	}

}
