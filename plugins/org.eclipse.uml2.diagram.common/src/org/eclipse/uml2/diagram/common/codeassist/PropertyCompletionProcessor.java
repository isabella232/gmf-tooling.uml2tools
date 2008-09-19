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
import org.eclipse.uml2.diagram.parser.assist.EObjectCompletionProcessor;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Type;


public class PropertyCompletionProcessor extends EObjectCompletionProcessor {
	
	final OCLLookup<Type> myTypeLookup;
	public PropertyCompletionProcessor(OCLLookup<Type> lookup) {
		myTypeLookup = lookup;
	}
	
	@Override
	protected Iterable<String> computeContextProposals(EObject context) {
		List<Type> scope = myTypeLookup.computeScope(context);
		List<String> res = new ArrayList<String>();
		for (NamedElement el: scope) {
			res.add(el.getName());
		}
		return res;
	}

	@Override
	protected String getProposalPrefix(String prefix) {
		Matcher matcher = PROPERTY_TYPE_PATTERN.matcher(prefix);
		if (matcher.matches() && matcher.groupCount() > 1) {
			return matcher.group(2);

		}
		return "";
	}
	
	private static final String NEW_LINE = System.getProperty("line.separator");

	private static final String PROPERTY_TYPE_REGEXP = "#name group:" + NEW_LINE + "((?:\\s)*(?:\\w)+(?:\\s)*):" + NEW_LINE + "#type group:" + NEW_LINE + "(?:\\s)*(\\w)*";

	private static final Pattern PROPERTY_TYPE_PATTERN = Pattern.compile(PROPERTY_TYPE_REGEXP, Pattern.COMMENTS);

}
