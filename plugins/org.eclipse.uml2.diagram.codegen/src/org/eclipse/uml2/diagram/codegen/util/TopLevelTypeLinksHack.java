/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.codegen.util;

import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.TypeModelFacet;

public class TopLevelTypeLinksHack {
	public static TypeModelFacet diagramDomainElementAsFakeTypeModelFacet(GenDiagram genDiagram){
		// hack for #188069 -- GMF M7 requires TypeModelFacet in order to generate
		// updater code for top-level diagram type links
		TypeModelFacet result = GMFGenFactory.eINSTANCE.createTypeModelFacet();
		result.setMetaClass(genDiagram.getDomainDiagramElement());
		return result;
	}

}
