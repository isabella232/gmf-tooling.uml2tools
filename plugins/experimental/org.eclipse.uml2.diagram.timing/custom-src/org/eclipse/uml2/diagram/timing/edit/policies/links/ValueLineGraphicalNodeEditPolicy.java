package org.eclipse.uml2.diagram.timing.edit.policies.links;

import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

public class ValueLineGraphicalNodeEditPolicy extends AbstractFilteringConnectionsGraphicalNodeEditPolicy {

	@Override
	protected boolean ignoreRequestImpl(CreateConnectionViewAndElementRequest req) {
		CreateElementRequestAdapter requestAdapter = req.getConnectionViewAndElementDescriptor().getCreateElementRequestAdapter();
		IElementType elementType = (IElementType)requestAdapter.getAdapter(IElementType.class);
		return TimingDElementTypes.DStateSwitch_4001.equals(elementType);
	}
}
