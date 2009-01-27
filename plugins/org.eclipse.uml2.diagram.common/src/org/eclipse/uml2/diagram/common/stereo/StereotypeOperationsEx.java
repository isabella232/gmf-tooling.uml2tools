package org.eclipse.uml2.diagram.common.stereo;

import java.net.URL;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

// Extend UMLUtil in order to use  protected static method #getEClassifier() 
public class StereotypeOperationsEx extends UMLUtil {

	private static final ImageDescriptor CORRUPTED_ICON = PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_WARN_TSK);

	public static ImageDescriptor getImage(Stereotype appliedStereotype) {
		Resource eResource = appliedStereotype.eResource();
		if (eResource == null || eResource.getResourceSet() == null) {
			return null;
		}
		URIConverter uriConverter = eResource.getResourceSet().getURIConverter();
		URI normalizedURI = uriConverter.normalize(eResource.getURI());
		for (Image icon : appliedStereotype.getIcons()) {
			String location = icon.getLocation();
			if (!UML2Util.isEmpty(location)) {
				URI uri = URI.createURI(location).resolve(normalizedURI);
				try {
					URL url = new URL(uriConverter.normalize(uri).toString());
					url.openStream().close();
					return ImageDescriptor.createFromURL(url);
				} catch (Exception e) {
					return CORRUPTED_ICON;
				}
			}
		}
		return null;
	}
	
	
// Almost copy of ElementOperations#getApplicableStereotypes()
// But we operate with metaclass of the element, not with the element itself
	public static EList<Stereotype> getApplicableStereotypes(org.eclipse.uml2.uml.Package package_, EClassifier elementMetaclass) {
		if (package_ != null) {
			EList<Stereotype> applicableStereotypes = new UniqueEList.FastCompare<Stereotype>();

			for (ProfileApplication profileApplication : package_.getAllProfileApplications()) {

				Profile appliedProfile = profileApplication.getAppliedProfile();

				if (appliedProfile != null) {

					for (Stereotype stereotype : appliedProfile.getOwnedStereotypes()) {

						ENamedElement appliedDefinition = profileApplication.getAppliedDefinition(stereotype);

						if (appliedDefinition instanceof EClass && !((EClass) appliedDefinition).isAbstract() && getExtension(elementMetaclass, stereotype) != null) {

							applicableStereotypes.add(stereotype);
						}
					}
				}
			}

			return ECollections.unmodifiableEList(applicableStereotypes);
		}

		return ECollections.emptyEList();
	}

	// Almost copy of ElementOperations#getExtension()
	protected static Extension getExtension(EClassifier elementMetaclass, Stereotype stereotype) {

		for (Property attribute : stereotype.getAllAttributes()) {
			Association association = attribute.getAssociation();

			if (association instanceof Extension) {
				String name = attribute.getName();

				if (!isEmpty(name) && name.startsWith(Extension.METACLASS_ROLE_PREFIX)) {

					Type type = attribute.getType();

					if (type instanceof org.eclipse.uml2.uml.Class) {
						EClassifier eClassifier = getEClassifier((org.eclipse.uml2.uml.Class) type);

						//
						// Almost copy of ElementOperations#getExtension()
						// diff is here
						if (eClassifier != null && ((EClass)eClassifier).isSuperTypeOf((EClass) elementMetaclass)) {

							return (Extension) association;
						}
					}
				}
			}
		}

		return null;
	}

}
