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

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

public interface CompletionProcessor {

	String getProposalPrefix(String prefix);

	Iterable<String> computeProposals(EObject context);
	
	CompletionProcessor NULL_PROCESSOR = new CompletionProcessor(){

		public Iterable<String> computeProposals(EObject context) {
			return Collections.emptyList();
		}

		public String getProposalPrefix(String prefix) {
			return "";
		}
		
	};
}
