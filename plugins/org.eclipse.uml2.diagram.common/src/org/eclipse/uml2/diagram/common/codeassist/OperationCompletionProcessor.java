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
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;

public class OperationCompletionProcessor extends CompositeCompletionProcessor  {
	
	private final OCLLookup<Type> myTypeLookup;
	
	public OperationCompletionProcessor(OCLLookup<Type> lookup) {
		myTypeLookup = lookup;
	}	

	@Override
	protected CompletionProcessor getCompletionProcessor(String prefix) {
		if (OperationAnalizer.isInType(prefix)) {
			return new TypeCompletionProcessor();
		}
		if (OperationAnalizer.isInOperationProperty(prefix)) {
			return new PropertyCompletionProcessor(); 
		}
		if (OperationAnalizer.isInDirection(prefix)) {
			return new ParameterDirectionCompletionProcessor(); 
		}
		return CompletionProcessor.NULL_PROCESSOR;
	}

	@Override
	protected Iterable<String> computeContextProposals(EObject context) {
		return null;
	}
	
	private class PropertyCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return OperationAnalizer.getOperationPropertyPrefix(prefix);
		}

		public Iterable<String> computeProposals(EObject context) {
			return OPERATION_PROPERTIES;
		}
	}
	
	private class ParameterDirectionCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return OperationAnalizer.getParameterDirectionPrefix(prefix);
		}

		public Iterable<String> computeProposals(EObject context) {
			return PARAMETER_DIRECTIONS;
		}
	}

	private class TypeCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return OperationAnalizer.getTypePrefix(prefix);
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

	private static final List<String> OPERATION_PROPERTIES = Arrays.asList(new String[] { "redefines", //$NON-NLS-1$
			"ordered", //$NON-NLS-1$
			"unordered", //$NON-NLS-1$
			"unique", //$NON-NLS-1$
			"nonunique", //$NON-NLS-1$
			"query", });//$NON-NLS-1$

	private static final List<String> PARAMETER_DIRECTIONS = Arrays.asList(new String[] { ParameterDirectionKind.IN_LITERAL.getName(), 
			ParameterDirectionKind.OUT_LITERAL.getName(),
			ParameterDirectionKind.INOUT_LITERAL.getName()});
}
