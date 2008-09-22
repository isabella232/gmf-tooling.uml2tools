/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.codeassist;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Type;

public class PropertyCompletionProcessor extends CompositeCompletionProcessor {
	
	final OCLLookup<Type> myTypeLookup;
	public PropertyCompletionProcessor(OCLLookup<Type> lookup) {
		myTypeLookup = lookup;
	}
	
	
	@Override
	protected CompletionProcessor getCompletionProcessor(String prefix) {
		if (PropertyAnalizer.isInType(prefix)) {
			return new TypeCompletionProcessor();
		}
		return CompletionProcessor.NULL_PROCESSOR;
	}
	
	private static class PropertyAnalizer {
		
		public static boolean isInType(String prefix) {
			return PROPERTY_TYPE.matcher(prefix).find();
		}

		public static String getTypePrefix(String str) {
			Matcher m = PROPERTY_TYPE.matcher(str);
			m.find();
			return m.group(1);
		}

	}
	
	private class TypeCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return PropertyAnalizer.getTypePrefix(prefix);
		}

		public Iterable<String> computeProposals(EObject context) {
			List<Type> scope = myTypeLookup.computeScope(context);
			List<String> res = new ArrayList<String>();
			for (NamedElement el: scope) {
				res.add(el.getName());
			}
			return res;
		}

	}

	private static final Pattern PROPERTY_TYPE = Pattern.compile("\\:\\s*(\\w*)\\z");

}
