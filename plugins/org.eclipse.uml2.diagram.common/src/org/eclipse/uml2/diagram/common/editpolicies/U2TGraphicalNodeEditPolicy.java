package org.eclipse.uml2.diagram.common.editpolicies;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class U2TGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		if (!(request instanceof CreateConnectionViewRequest)) {
			return null;
		}

		CreateConnectionViewRequest req = (CreateConnectionViewRequest) request;
		TransactionalEditingDomain editingDomain = getHostImpl().getEditingDomain();

		U2TCreateLinkCommand result = new U2TCreateLinkCommand(editingDomain);
		Diagram diagramView = getView().getDiagram();

		CreateCommand createCommand = new CreateCommand(editingDomain, req.getConnectionViewDescriptor(), diagramView);
		result.setEdgeCreation(createCommand);

		IAdaptable edgeAdaptor = (IAdaptable) createCommand.getCommandResult().getReturnValue();
		result.setEdgeAdapter(edgeAdaptor);

		SetConnectionEndsCommand sceCommand = result.getSetConnectionEndsCommand();
		sceCommand.setNewSourceAdaptor(new EObjectAdapter(getView()));
		ConnectionAnchor sourceAnchor = getConnectableEditPart().getSourceConnectionAnchor(request);

		SetConnectionAnchorsCommand scaCommand = result.getSetConnectionAnchorsCommand();
		scaCommand.setNewSourceTerminal(getConnectableEditPart().mapConnectionAnchorToTerminal(sourceAnchor));

		Command c = new ICommandProxy(result);
		request.setStartCommand(c);
		return c;
	}

	
	@SuppressWarnings("restriction")
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		ICommandProxy proxy = (ICommandProxy) request.getStartCommand();
		if (proxy == null) {
			return null;
		}

		// reset the target edit-part for the request
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		if (targetEP == null) {
			return null;
		}

		U2TCreateLinkCommand cc = (U2TCreateLinkCommand) proxy.getICommand();
		
		ConnectionAnchor targetAnchor = targetEP.getTargetConnectionAnchor(request);
		SetConnectionEndsCommand sceCommand = cc.getSetConnectionEndsCommand();
		sceCommand.setNewTargetAdaptor(new EObjectAdapter(((IGraphicalEditPart) targetEP).getNotationView()));
		
		SetConnectionAnchorsCommand scaCommand = cc.getSetConnectionAnchorsCommand();
		scaCommand.setNewTargetTerminal(targetEP.mapConnectionAnchorToTerminal(targetAnchor));
		
		INodeEditPart sourceEditPart = (INodeEditPart) request.getSourceEditPart();
		ConnectionAnchor sourceAnchor = sourceEditPart.mapTerminalToConnectionAnchor(scaCommand.getNewSourceTerminal());
		PointList pointList = new PointList();
		if (request.getLocation() == null) {
			pointList.addPoint(sourceAnchor.getLocation(targetAnchor.getReferencePoint()));
			pointList.addPoint(targetAnchor.getLocation(sourceAnchor.getReferencePoint()));
		} else {
			pointList.addPoint(sourceAnchor.getLocation(request.getLocation()));
			pointList.addPoint(targetAnchor.getLocation(request.getLocation()));
		}

		cc.getSetConnectionBendpointsCommand().setNewPointList(pointList, sourceAnchor.getReferencePoint(), targetAnchor.getReferencePoint());
		return request.getStartCommand();
	}

	protected Command getConnectionAndRelationshipCompleteCommand(CreateConnectionViewAndElementRequest request) {
		// get the element descriptor
		CreateElementRequestAdapter requestAdapter = request.getConnectionViewAndElementDescriptor().getCreateElementRequestAdapter();
		// get the semantic request
		CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) requestAdapter.getAdapter(CreateRelationshipRequest.class);
		
		createElementRequest.setPrompt(!request.isUISupressed());
		
		// complete the semantic request by filling in the source and
		// destination
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		View sourceView = (View)request.getSourceEditPart().getModel();
		View targetView = (View)targetEP.getModel();
		
		// resolve the source
		EObject source = ViewUtil.resolveSemanticElement(sourceView);
		if (source == null) {
			source = sourceView;
		}

		createElementRequest.setSource(source);
		
		// resolve the target
		EObject target = ViewUtil.resolveSemanticElement(targetView);
		if (target == null) {
			target = targetView;
		}
		createElementRequest.setTarget(target);
		
		// get the create element request based on the elementdescriptor's
		// request
		Command createElementCommand = targetEP
				.getCommand(new EditCommandRequestWrapper(
						(CreateRelationshipRequest) requestAdapter
								.getAdapter(CreateRelationshipRequest.class), request.getExtendedData()));
		
		// create the create semantic element wrapper command
		if (null == createElementCommand){
			return null;
		}
		
		SemanticCreateCommand semanticCommand = new SemanticCreateCommand(requestAdapter, createElementCommand);

		// get the view command
		ICommandProxy result = (ICommandProxy)getConnectionCompleteCommand(request);
		if (null == result){
			return null;
		}
		
		U2TCreateLinkCommand viewCommandImpl = (U2TCreateLinkCommand)result.getICommand();

		// set semantic creation to be executed before edge creation and setup
		viewCommandImpl.setSemanticCreation(semanticCommand);

		return result;
	}

	private IGraphicalEditPart getHostImpl() {
		return (IGraphicalEditPart) getHost();
	}
}
