package org.eclipse.uml2.diagram.sequence.edit.policies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest.ConnectionViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;


public class LifelineGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	@Override
	protected Command getConnectionCompleteCommand(final CreateConnectionRequest request) {
		Command result = super.getConnectionCompleteCommand(request);
		if (result == null || result != request.getStartCommand()){
			return result;
		}
		if (false == request instanceof CreateConnectionViewAndElementRequest){
			return result;
		}
		
		CreateConnectionViewAndElementRequest requestImpl = (CreateConnectionViewAndElementRequest)request;
		ConnectionViewAndElementDescriptor descriptor = requestImpl.getConnectionViewAndElementDescriptor();
		IElementType elementType = (IElementType) descriptor.getCreateElementRequestAdapter().getAdapter(IElementType.class);
		if (elementType != UMLElementTypes.Message_4001){
			return result; 		
		}
		
		//in general, we are extensively relying on the super implementation in the code below
		ICommandProxy proxy = (ICommandProxy)result;
		CompositeCommand cc = (CompositeCommand) proxy.getICommand();
		
        Iterator<?> commandItr = cc.iterator();
        AbstractTransactionalCommand creation = (AbstractTransactionalCommand) commandItr.next(); //0
        SetConnectionEndsCommand sceCommand = (SetConnectionEndsCommand) commandItr.next(); //1
        SetConnectionAnchorsCommand scaCommand = (SetConnectionAnchorsCommand) commandItr.next(); //2
        AbstractTransactionalCommand sbbCommand = (AbstractTransactionalCommand) commandItr.next(); //3
        
        sceCommand.setNewSourceAdaptor(new MissedViewAdapter(requestImpl, true, sceCommand.getNewSourceAdaptor()));
        sceCommand.setNewTargetAdaptor(new MissedViewAdapter(requestImpl, false, sceCommand.getNewTargetAdaptor()));

		return result;
	}
	
	@Override
	protected Command getConnectionAndRelationshipCompleteCommand(CreateConnectionViewAndElementRequest request) {
		Command result = super.getConnectionAndRelationshipCompleteCommand(request);
		if (result == null){
			return result;
		}
		ConnectionViewAndElementDescriptor descriptor = request.getConnectionViewAndElementDescriptor();
		IElementType elementType = (IElementType) descriptor.getCreateElementRequestAdapter().getAdapter(IElementType.class);
		if (elementType != UMLElementTypes.Message_4001){
			return result; 		
		}
		
		//relying extensively on super implementation 
		ICommandProxy proxy = (ICommandProxy)result;
		CompositeCommand originalCommand = (CompositeCommand) proxy.getICommand();
		CompositeCommand withFixedViewCreation = new CompositeCommand(originalCommand.getLabel());
		
		Iterator<?> originalCommandsIt = originalCommand.iterator();
		SemanticCreateCommand semanticCommand = (SemanticCreateCommand) originalCommandsIt.next();
		withFixedViewCreation.compose(semanticCommand);
		
		TransactionalEditingDomain domain = getHostImpl().getEditingDomain();
		IGraphicalEditPart sourceEP = (IGraphicalEditPart) request.getSourceEditPart();
		IGraphicalEditPart targetEP = (IGraphicalEditPart) request.getTargetEditPart();
		
//		System.err.println("SourceEP: " + sourceEP);
//		System.err.println("TargetEP: " + targetEP);
//		if (sourceEP != null){
//			System.err.println("SourceEP model: " + sourceEP.getNotationView().getElement());
//		}
//		if (targetEP != null){
//			System.err.println("TargetEP model: " + targetEP.getNotationView().getElement());
//		}
		
		if (sourceEP instanceof LifelineEditPart){
			CreateViewsForBehaviorExecutionCommand fixMissedSource = new CreateViewsForBehaviorExecutionCommand(domain, request, new ViewCreationHelper(sourceEP), true);
			withFixedViewCreation.compose(fixMissedSource);
		}
		
		if (targetEP instanceof LifelineEditPart){
			CreateViewsForBehaviorExecutionCommand fixMissedTarget = new CreateViewsForBehaviorExecutionCommand(domain, request, new ViewCreationHelper(targetEP), false);
			withFixedViewCreation.compose(fixMissedTarget);
		}
		
		while (originalCommandsIt.hasNext()){
			withFixedViewCreation.compose((IUndoableOperation)originalCommandsIt.next());
		}

		CompoundCommand gefResult = new CompoundCommand();
		gefResult.add(new ICommandProxy(withFixedViewCreation));
		InteractionEditPart interactionEP = findInteractionEditPart(getHost());
		if (interactionEP != null){
			gefResult.add(interactionEP.getCommand(new InteractionNestedLayoutRequest()));
		}
		return gefResult.unwrap();
	}
	
	protected InteractionEditPart findInteractionEditPart(EditPart ep){
		RootEditPart root = ep.getRoot();
		while (ep != root && ep != null){
			if (ep instanceof InteractionEditPart){
				return (InteractionEditPart)ep;
			}
			ep = ep.getParent();
		}
		return null;
	}

	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart)getHost();
	}
	
	private static interface IViewCreationHelper {
		public IGraphicalEditPart getHostEditPart();
		public List<?> helpCreateViews(EObject domainElement);
		public List<?> helpCreateViews(List<EObject> domainElements);
	}
	
	private static class ViewCreationHelper extends LifelineCanonicalEditPolicy implements IViewCreationHelper {
		public ViewCreationHelper(IGraphicalEditPart host){
			super();
			setHost(host);
		}
		
		public IGraphicalEditPart getHostEditPart() {
			return (IGraphicalEditPart) getHost();
		}
		
		public List<?> helpCreateViews(EObject domainElement){
			ArrayList<EObject> list = new ArrayList<EObject>();
			list.add(domainElement);
			return helpCreateViews(list);
		}
		
		public List<?> helpCreateViews(List<EObject> domainElements){
			return createViews(domainElements);
		}
	}
	
	private static class CreateViewsForBehaviorExecutionCommand extends AbstractTransactionalCommand {
		private final CreateConnectionViewAndElementRequest myRequest;
		private final IViewCreationHelper myHelper;
		private final boolean myForSource;
		
		public CreateViewsForBehaviorExecutionCommand(TransactionalEditingDomain domain, CreateConnectionViewAndElementRequest request, IViewCreationHelper helper, boolean forSource){
			super(domain, "", Collections.emptyList());
			myRequest = request;
			myHelper = helper;
			myForSource = forSource;
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			ConnectionViewAndElementDescriptor descriptor = myRequest.getConnectionViewAndElementDescriptor();
			CreateElementRequestAdapter adapter = descriptor.getCreateElementRequestAdapter();
			CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) adapter.getAdapter(CreateRelationshipRequest.class);
			EObject newElement = createElementRequest.getNewElement();
			if (newElement instanceof Message){
				Message message = (Message)newElement;
				MessageEnd domainEnd = myForSource ? message.getSendEvent() : message.getReceiveEvent(); 
				List<?> viewAdapters = null;
				if (domainEnd instanceof MessageOccurrenceSpecification){
					UMLDiagramUpdater.MessageDiagramEndReplace replacer = new UMLDiagramUpdater.MessageDiagramEndReplace(message.getInteraction());
					viewAdapters = myHelper.helpCreateViews(replacer.findDiagramMessageEnd(domainEnd));
				}
				
				if (viewAdapters != null && !viewAdapters.isEmpty() && myRequest.getLocation() != null){
					IGraphicalEditPart viewHost = myHelper.getHostEditPart();
					IFigure contentPane = viewHost.getContentPane();
					Point origin = contentPane.getClientArea().getLocation();
					Point relativeLocation = new Point(myRequest.getLocation());
					System.err.println("RelativeLocation BEFORE:" + relativeLocation);
					contentPane.translateToRelative(relativeLocation);
					relativeLocation.translate(origin.getNegated());
					System.err.println("RelativeLocation AFTER-AFTER: " + relativeLocation);

					IAdaptable firstViewAdapter = (IAdaptable) viewAdapters.get(0);
					View firstView = (View) firstViewAdapter.getAdapter(View.class);
					if (firstView instanceof Node){
						Node node = (Node)firstView;
						if (node.getLayoutConstraint() == null){
							node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
						}
						ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLocation_Y(), new Integer(relativeLocation.y));
						ViewUtil.setStructuralFeatureValue(node, NotationPackage.eINSTANCE.getLocation_X(), Integer.valueOf(0));
					}
				}
				MissedViewAdapter.storeInRequest(myRequest, myForSource, viewAdapters);
			}
			return CommandResult.newOKCommandResult();
		}
		
	}
	
	private static class MissedViewAdapter implements IAdaptable {
		private static final String SOURCE_EXECUTION_VIEW_KEY = "CreateViewForBehaviorExecutionCommand:source";
		private static final String TARGET_EXECUTION_VIEW_KEY = "CreateViewForBehaviorExecutionCommand:target";
		private final CreateConnectionViewAndElementRequest myRequest;
		private final boolean myForSource;
		private final IAdaptable myOriginalViewAdapter;
		
		public MissedViewAdapter(CreateConnectionViewAndElementRequest request, boolean forSource, IAdaptable notFixedViewAdapter){
			myRequest = request;
			myForSource = forSource;
			myOriginalViewAdapter = notFixedViewAdapter;
		}
		
		public Object getAdapter(Class adapter) {
			if (View.class == adapter){
				CreateRelationshipRequest createElementRequest = adaptToStorage(myRequest);
				IAdaptable viewAdapter = (IAdaptable) createElementRequest.getParameter(myForSource ? SOURCE_EXECUTION_VIEW_KEY : TARGET_EXECUTION_VIEW_KEY);
				if (viewAdapter != null){
					return viewAdapter.getAdapter(adapter);
				}
				return myOriginalViewAdapter.getAdapter(adapter);
			}
			return null;
		}
		
		public static void storeInRequest(CreateConnectionViewAndElementRequest request, boolean forSource, List<?> viewAdapters){
			if (viewAdapters == null || viewAdapters.isEmpty()){
				return;
			}
			IAdaptable adapter = (IAdaptable) viewAdapters.get(0);
			String key = forSource ? SOURCE_EXECUTION_VIEW_KEY : TARGET_EXECUTION_VIEW_KEY;
			CreateRelationshipRequest createElementRequest = adaptToStorage(request);
			createElementRequest.addParameters(Collections.singletonMap(key, adapter));			
		}
		
		private static CreateRelationshipRequest adaptToStorage(CreateConnectionViewAndElementRequest request){
			ConnectionViewAndElementDescriptor descriptor = request.getConnectionViewAndElementDescriptor();
			CreateElementRequestAdapter requestAdapter = descriptor.getCreateElementRequestAdapter();
			CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) requestAdapter.getAdapter(CreateRelationshipRequest.class);
			return createElementRequest;
		}
		
	}
	
	
}
