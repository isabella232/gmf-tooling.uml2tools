package org.eclipse.uml2.diagram.profile.part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ImportUmlPrimitiveTypesAction extends ProfileModelAction {
	@Override
	protected String getActionLabel() {
		return "Import UML Primitive types";
	}

	@Override
	protected void runInModel(EObject selected) {
		createDefaultPrimitiveTypeImports((Profile)selected);
	}
	private void createDefaultPrimitiveTypeImports(Profile root) {
		Model umlLibrary = loadUMLPrimitiveTypeLibrary(root);

		if (umlLibrary == null) {
			System.out.println("umlLibrary == null!");
			return;
		}

		importPrimitiveType(umlLibrary, root, "Boolean");
		importPrimitiveType(umlLibrary, root, "String");
		importPrimitiveType(umlLibrary, root, "Integer");
		importPrimitiveType(umlLibrary, root, "UnlimitedNatural");
	}

	private static void importPrimitiveType(Model umlLibrary,
			org.eclipse.uml2.uml.Profile profile, String name) {
		PrimitiveType primitiveType = (PrimitiveType) umlLibrary
				.getOwnedType(name);
		if (profile.getElementImport(primitiveType) == null) {
			profile.createElementImport(primitiveType);
		}
	}

	private Model loadUMLPrimitiveTypeLibrary(
			org.eclipse.uml2.uml.Package package_) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI
				.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), true);
		if (resource == null) {
			System.err.println("Cannot load UML Primitive Type Library: Null resource");
		}
		return (Model) EcoreUtil.getObjectByType(resource.getContents(),
				UMLPackage.Literals.PACKAGE);
	}

}
