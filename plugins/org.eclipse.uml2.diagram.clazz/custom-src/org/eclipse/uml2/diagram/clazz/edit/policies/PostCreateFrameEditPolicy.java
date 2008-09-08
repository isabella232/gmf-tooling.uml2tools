package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.editpolicies.AbstractPostCreateCommand;
import org.eclipse.uml2.uml.UMLPackage;


public class PostCreateFrameEditPolicy extends AbstractEditPolicy {
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
		return (semanticRequest.getElementType() == UMLElementTypes.Package_2016);
	}
	
	private Command getPostCreateCommand(CreateViewAndElementRequest cvaeReq){
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getDomain(), DiagramUIMessages.AddCommand_Label);
		cc.compose(new PostCreateFrameCommand(getDomain(), cvaeReq, getHostImpl()));
		return new ICommandProxy(cc.reduce());
	}
	
	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
	private TransactionalEditingDomain getDomain(){
		return getHostImpl().getEditingDomain();	
	}
	
	private static class PostCreateFrameCommand extends AbstractPostCreateCommand {
		public PostCreateFrameCommand(TransactionalEditingDomain domain, CreateViewAndElementRequest cvaeReq, IGraphicalEditPart hostEditPart){
			super(domain, cvaeReq, hostEditPart, UMLVisualIDRegistry.TYPED_ADAPTER);
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			View createdView = getCreatedView();
			EObject createdEntity = getCreatedEntity();
			
			System.err.println("Created View: " + createdView);
			System.err.println("Created Frame: " + createdEntity);
			
			org.eclipse.uml2.uml.Package pakkage = (org.eclipse.uml2.uml.Package)createdEntity;
			org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) pakkage.createOwnedType("PostCreatedClass", UMLPackage.eINSTANCE.getClass_());
			
			View compartment = findChildByType(createdView, PackageAsFrameContentsEditPart.VISUAL_ID);
			View clazzView = ViewService.getInstance().createNode(new EObjectAdapter(clazz), compartment, null, ViewUtil.APPEND, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			
			System.err.println("Class post-created: " + clazzView);
			setLocation(clazzView, new Point(50, 50));
			setSize(clazzView, new Dimension(80, 80));
			
			return CommandResult.newOKCommandResult();
		}
	}
	
	
}
