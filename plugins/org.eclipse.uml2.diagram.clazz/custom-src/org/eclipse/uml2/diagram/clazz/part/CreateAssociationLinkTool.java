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

package org.eclipse.uml2.diagram.clazz.part;

import java.util.Collections;
import java.util.Map;

import org.eclipse.uml2.diagram.clazz.edit.helpers.AssociationEditHelper;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AggregationKind;

public class CreateAssociationLinkTool extends CreateLinkToolBase {

	private final AggregationKind myKind;

	public CreateAssociationLinkTool(AggregationKind kind) {
		super(Collections.singletonList(UMLElementTypes.Association_4005));
		myKind = kind;
	}
	
	@Override
	protected Map<String, ?> createAdditionalExtendedData() {
		return Collections.singletonMap(AssociationEditHelper.PARAMETER_CONFIGURE_AGGREGATION_KIND, myKind);
	}
	
	public static class NONE extends CreateAssociationLinkTool {
		public NONE(){
			super(AggregationKind.NONE_LITERAL);
		}
	}
	
	public static class COMPOSITE extends CreateAssociationLinkTool {
		public COMPOSITE(){
			super(AggregationKind.COMPOSITE_LITERAL);
		}
	}
	
	public static class SHARED extends CreateAssociationLinkTool {
		public SHARED(){
			super(AggregationKind.SHARED_LITERAL);
		}
	}

}
