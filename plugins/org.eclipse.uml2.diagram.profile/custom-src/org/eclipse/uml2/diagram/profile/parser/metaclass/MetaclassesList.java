/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.profile.parser.metaclass;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.resource.UMLResource;

import sun.security.util.Resources;

public class MetaclassesList {
	private final URI myUri;
	private final SortedMap<String, org.eclipse.uml2.uml.Class> myNamesMap;
	private final SortedSet<String> myCaseInsensitiveNames;
	private final SortedSet<String> myCaseInsensitiveNamesRO;
	private ResourceSet myResourceSet;

	public MetaclassesList(String uri){
		myUri = URI.createURI(uri);
		myNamesMap = new TreeMap<String, org.eclipse.uml2.uml.Class>();
		myCaseInsensitiveNames = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		myCaseInsensitiveNamesRO = Collections.unmodifiableSortedSet(myCaseInsensitiveNames);
	}
	
	public Iterable<org.eclipse.uml2.uml.Class> getMetaclasses(EObject eObject){
		setContext(eObject);
		return myNamesMap.values();
	}
	
	public SortedSet<String> getMetaclassNames(EObject eObject){
		setContext(eObject);
		return myCaseInsensitiveNamesRO;
	}
	
	public org.eclipse.uml2.uml.Class findMetaclass(EObject context, String name){
		setContext(context);
		return myNamesMap.get(name.trim());
	}
	
	private void setContext(EObject context){
		ResourceSet resourceSet = context.eResource().getResourceSet();
		if (myResourceSet != null && myResourceSet.equals(resourceSet)){
			return;
		}
		
		preloadPrimitiveTypesAndStandardProfile(resourceSet);
		
		myNamesMap.clear();
		myCaseInsensitiveNames.clear();
		myResourceSet = resourceSet;
		
		for (Iterator allMetas = loadAllMetaclasses(resourceSet).iterator(); allMetas.hasNext();){
			org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class)allMetas.next();
			myCaseInsensitiveNames.add(metaclass.getName());
			myNamesMap.put(metaclass.getName(), metaclass);
		}
	}
	
	/**
	 * XXX: It is workaround for magic failure in the following code 
	 * 
	 * <code>
	 * List first = loadAllMetaclasses(resourceSet);
	 * List second = loadAllMetaclasses(resourceSet);
	 * if (first.size() != second.size()){
	 * 		throw new IllegalStateException("I can not understand why, but it fails because of true == first.isEmpty() ");
	 * }
	 * </code>
	 * 
	 * Debugging shows that empty list of applied stereotypes (and thus the false == metaclass.isMetaclass() return value) 
	 * is foced by the wrong value that was cached during the loading of the STANDARD_PROFILE in the middle of loading of the UML_METAMODEL_URI.
	 * We want to force standard profile and primitive types library to be loaded before the metaclasses list.
	 */
	private void preloadPrimitiveTypesAndStandardProfile(ResourceSet resourceSet) {
		resourceSet.getResource(URI.createURI(UMLResource.STANDARD_PROFILE_URI), true);
		resourceSet.getResource(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), true);
		resourceSet.getResource(URI.createURI(UMLResource.ECORE_PROFILE_URI), true);
		resourceSet.getResource(URI.createURI(UMLResource.ECORE_METAMODEL_URI), true);
		resourceSet.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
	}

	private List loadAllMetaclasses(ResourceSet resourceSet){
		Resource metamodel = resourceSet.getResource(myUri, true);
		List allMetaclasses = new LinkedList();
		for (Iterator contents = metamodel.getAllContents(); contents.hasNext();) {
			Object next = contents.next();
			org.eclipse.uml2.uml.Class metaclass = asMetaclass(next);
			if (metaclass != null){
				allMetaclasses.add(metaclass);
			}
		}
		return allMetaclasses;
	}
	
	private static org.eclipse.uml2.uml.Class asMetaclass(Object object){
		org.eclipse.uml2.uml.Class result = null;
		if (object instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class)object;
			if (umlClass.isMetaclass()){
				result = umlClass;
			}
		}
		return result;
	}
}
