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
package org.eclipse.uml2.diagram.parser.assist;

import java.util.List;

public class FixedSetCompletionProcessorWithSeparator extends FixedSetCompletionProcessor {

	private final String mySeparator;

	public FixedSetCompletionProcessorWithSeparator(List<String> proposals, String separator) {
		super(proposals);
		mySeparator = separator;
	}

	@Override
	protected String getProposalPrefix(String prefix) {
		return prefix.substring(prefix.lastIndexOf(mySeparator) + mySeparator.length()).trim();
	}

}
