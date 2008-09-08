package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Property;


public class PostCreateClassEditPolicy extends AbstractEditPolicy {
	@Override
	public Command getCommand(Request request) {
		if (understandsRequest(request)){
			return getPostCreateCommand((CreateViewAndElementRequest)request);
		}
		return null;
	}
	
	@Override
	public boolean understandsRequest(Request req) {
		if (false == req instanceof CreateViewAndElementRequest){
			return false;
		}
		CreateViewAndElementRequest cvaeReq = (CreateViewAndElementRequest)req;
		CreateElementRequestAdapter requestAdapter = cvaeReq.getViewAndElementDescriptor().getCreateElementRequestAdapter();
		CreateElementRequest semanticRequest = (CreateElementRequest) requestAdapter.getAdapter(CreateElementRequest.class);
		if (semanticRequest.getElementType() == UMLElementTypes.Class_2001){
			return true;
		}
		//System.err.println("request element type: " + semanticRequest.getElementType());
		return false;

	}
	
	private Command getPostCreateCommand(CreateViewAndElementRequest cvaeReq){
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getDomain(), DiagramUIMessages.AddCommand_Label);
		cc.compose(new PostCreateCommand(getDomain(), getHostView(), cvaeReq));
		return new ICommandProxy(cc.reduce());
	}
	
	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
	private TransactionalEditingDomain getDomain(){
		return getHostImpl().getEditingDomain();	
	}
	
	private View getHostView(){
		return getHostImpl().getNotationView();
	}
	
	private static class PostCreateCommand extends AbstractTransactionalCommand {
		private final CreateViewAndElementRequest myCvaeReq;
		private final View myHostView;

		public PostCreateCommand(TransactionalEditingDomain domain, View hostView, CreateViewAndElementRequest cvaeReq){
			super(domain, null, getWorkspaceFiles(hostView));
			myHostView = hostView;
			myCvaeReq = cvaeReq;
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			CreateElementRequestAdapter requestAdapter = myCvaeReq.getViewAndElementDescriptor().getCreateElementRequestAdapter();
			CreateElementRequest semanticRequest = (CreateElementRequest) requestAdapter.getAdapter(CreateElementRequest.class);
			
			View createdView = (View) myCvaeReq.getViewAndElementDescriptor().getAdapter(View.class);
			EObject createdEntity = (EObject) requestAdapter.getAdapter(EObject.class);
			
			System.err.println("Created View: " + createdView);
			System.err.println("Created Class: " + createdEntity);
			
			org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class)createdEntity;
			Property attr = clazz.createOwnedAttribute("attribute", null);
			
			for (Object next : createdView.getChildren()){
				View nextChildView = (View)next;
				if (UMLVisualIDRegistry.getVisualID(nextChildView) == ClassAttributesEditPart.VISUAL_ID){
					View attrView = ViewService.getInstance().createNode(new EObjectAdapter(attr), nextChildView, null, ViewUtil.APPEND, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					System.err.println("AttrView created: " + attrView);
				}
			}
			
			return CommandResult.newOKCommandResult();
		}
	}
	
	
	
	
}
