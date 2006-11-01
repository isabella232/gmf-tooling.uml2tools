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
import java.util.HashMap;
import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.uml2.diagram.clazz.edit.helpers.AssociationEditHelper;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AggregationKind;

public class CreateAssociationLinkTool extends UnspecifiedTypeConnectionTool {

	private final AggregationKind myKind;

	public CreateAssociationLinkTool(AggregationKind kind) {
		super(Collections.singletonList(UMLElementTypes.Association_4005));
		myKind = kind;
	}
	
	protected Request createTargetRequest() {
		CreateUnspecifiedTypeConnectionRequest request = (CreateUnspecifiedTypeConnectionRequest)super.createTargetRequest();
		
		//below is the only way to propagate extended data into IEditCommandRequest#parameters  
		HashMap extendedData = new HashMap();
		extendedData.putAll(request.getExtendedData());
		extendedData.put(AssociationEditHelper.PARAMETER_CONFIGURE_AGGREGATION_KIND, myKind);
		for (CreateRequest next : (List<CreateRequest>)request.getAllRequests()){
			next.setExtendedData(extendedData);
		}
		return request;
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
