/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.activity.parser;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.UMLPackage;


public class ObjectNodeInStateParser implements ISemanticParser {
	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		return isAffectingEvent(notification, 0);
	}

	public List<?> getSemanticElementsBeingParsed(EObject eObject) {
		return Collections.singletonList(eObject);
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(IAdaptable element, int flags) {
		EObject eObject = adaptToEObject(element);
		if (!(eObject instanceof ObjectNode)) {
			return ""; //$NON-NLS-1$
		}

		EList<State> states = ((ObjectNode) eObject).getInStates();
		StringBuffer printStringBuffer = new StringBuffer(states.size() * 20);
		for (Iterator<State> statesIterator = states.iterator(); statesIterator.hasNext();) {
			printStringBuffer.append(statesIterator.next().getName());
			if (statesIterator.hasNext()) {
				printStringBuffer.append(", "); //$NON-NLS-1$
			}
		}
		return printStringBuffer.toString();
	}

	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		List<State> inStates = new LinkedList<State>();
		StringTokenizer tokenizer = new StringTokenizer(newString, ","); //$NON-NLS-1$
		while (tokenizer.hasMoreElements()) {
			NamedElement foundElement = getElementProvider().findElement(adaptToEObject(element), tokenizer.nextToken());
			if (foundElement != null && foundElement instanceof State) {
				inStates.add((State) foundElement);
			}
		}
		return new SetValueCommand(new SetRequest(adaptToEObject(element), 
				UMLPackage.eINSTANCE.getObjectNode_InState(), inStates));
	}

	public String getPrintString(IAdaptable element, int flags) {
		StringBuffer result = new StringBuffer(getEditString(element, flags));
		if (result.length() > 0) {
			result.insert(0, '[');
			result.append(']');
		}
		return result.toString();
	}

	public boolean isAffectingEvent(Object event, int flags) {
		if (event instanceof Notification) {
			Object feature = ((Notification) event).getFeature();
			return UMLPackage.eINSTANCE.getObjectNode_InState().equals(feature);
		}
		return false;
	}

	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		StringTokenizer tokenizer = new StringTokenizer(editString, ","); //$NON-NLS-1$
		while (tokenizer.hasMoreElements()) {
			NamedElement foundElement = getElementProvider().findElement(adaptToEObject(element), tokenizer.nextToken());
			if (foundElement == null || !(foundElement instanceof State)) {
				return new ParserEditStatus(IStatus.ERROR, PLUGIN_ID, ParserEditStatus.UNEDITABLE, "State with corresponding name is not found", null);
			}
		}
		return ParserEditStatus.EDITABLE_STATUS;
	}

	private NamedElementProvider getElementProvider() {
		if (elementProvider == null) {
			elementProvider = new NamedElementProvider(true);
		}
		return elementProvider;
	}

	private EObject adaptToEObject(IAdaptable adaptable) {
		return (EObject) adaptable.getAdapter(EObject.class);
	}

	private static final String PLUGIN_ID = "org.eclipse.uml2.diagram.activity"; //$NON-NLS-1$

	private NamedElementProvider elementProvider;
	
	/**
	 * TODO: Modify org.eclipse.uml2.diagram.common.parser.ElementProvider 
	 * 			to extend it instead of copy/paste
	 */
	private static class NamedElementProvider {
		private final SortedMap<String, NamedElement> myNamesMap;
		private final SortedSet<String> myCaseInsensitiveNames;
		private final SortedSet<String> myCaseInsensitiveNamesRO;
		private ResourceSet myResourceSet;
		private EObject myContext;
		private boolean myIsCaching;
		
		public NamedElementProvider(){
			this(false);
		}

		public NamedElementProvider(boolean isCaching){
			myIsCaching = isCaching;
			myNamesMap = new TreeMap<String, NamedElement>();
			myCaseInsensitiveNames = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
			myCaseInsensitiveNamesRO = Collections.unmodifiableSortedSet(myCaseInsensitiveNames);
		}
		
		public Iterable<NamedElement> getElements(EObject eObject){
			setContext(eObject);
			return myNamesMap.values();
		}
		
		public SortedSet<String> getElementNames(EObject eObject){
			setContext(eObject);
			return myCaseInsensitiveNamesRO;
		}
		
		public NamedElement findElement(EObject context, String name){
			setContext(context);
			return myNamesMap.get(name.trim());
		}
		
		protected void setContext(EObject context){
			myContext = context;
			ResourceSet resourceSet = context.eResource().getResourceSet();
			if (myIsCaching && myResourceSet != null && myResourceSet.equals(resourceSet) && !moreResourcesWereLoaded(resourceSet)){
				return;
			}
			
			myNamesMap.clear();
			myCaseInsensitiveNames.clear();
			myResourceSet = resourceSet;
			
			for (NamedElement element : loadAllElements(resourceSet)){
				String displayName = getDisplayProposal(element);
				if (displayName == null){
					continue;
				}
				myCaseInsensitiveNames.add(displayName);
				myNamesMap.put(displayName, element);
			}
		}
		
		protected String getDisplayProposal(NamedElement element){
			return element.getName();
		}

		protected List<NamedElement> loadAllElements(ResourceSet resourceSet){
			EList<Resource> resources = resourceSet.getResources();
			List<NamedElement> allElements = new LinkedList<NamedElement>();
			for (Resource metamodel: resources) {
				for (Iterator<EObject> contents = metamodel.getAllContents(); contents.hasNext();) {
					EObject next = contents.next();
					if (isSuitable(next)) {
						allElements.add((NamedElement)next);
					}
				}
			}
			return allElements;
		}
		
		protected boolean isSuitable(Object object) {
			return object instanceof State && ((State)object).getName() != null;
		}
		
		protected EObject getContext() {
			return myContext;
		}
		
		private boolean moreResourcesWereLoaded(ResourceSet resourceSet) {
			return !myResourceSet.getResources().equals(resourceSet.getResources());
		}
	}
}
