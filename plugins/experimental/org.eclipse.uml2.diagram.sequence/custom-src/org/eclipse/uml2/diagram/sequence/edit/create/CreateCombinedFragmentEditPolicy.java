package org.eclipse.uml2.diagram.sequence.edit.create;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.util.INotationType;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.diagram.sequence.edit.helpers.CoveredLifelineConfigurer;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.uml2.diagram.sequence.edit.policies.InteractionNestedLayoutRequest;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;

public class CreateCombinedFragmentEditPolicy extends AbstractCreateSDElementEditPolicy {
	@Override
	public boolean understandsRequest(Request req) {
		if (req instanceof CreateInteractionUseRequest){
			return true;
		}	
		return super.understandsRequest(req);
	}
	
	@Override
	public Command getCommand(Request request) {
		if (request instanceof CreateCombinedFragmentRequest){
			return createCombinedFragment((CreateCombinedFragmentRequest)request);
		}
		return super.getCommand(request);
	}
	
	protected Command createCombinedFragment(CreateCombinedFragmentRequest request){
		GraphicalEditPart bracketEP = getHostImpl();
		GraphicalEditPart frameEP = findFrameEditPart(bracketEP);
		
		GraphicalEditPart lifeLineEP = findLifeLineEditPart(bracketEP);
		final Lifeline lifeline = (Lifeline) lifeLineEP.resolveSemanticElement();
		CoveredLifelineConfigurer.setCoveredLifeLines(request, lifeLineEP);
		
		if (frameEP == null){
			System.out.println("CreateCombinedFragmentEditPolicy.createCombinedFragment(): NO-1");
			return UnexecutableCommand.INSTANCE;
		}
		
		final ShowDialogCommand dialog = new ShowDialogCommand(getEditingDomain());
		
		Helper helper = getHelper(request);
		final CreateViewAndElementRequest semanticAndNodeInFrameRequest = helper.createNodeAndElement(UMLElementTypes.CombinedFragment_3008);
		Command semanticAndNodeInFrameCommand = frameEP.getCommand(semanticAndNodeInFrameRequest);
		if (!isValid(semanticAndNodeInFrameCommand)){
			System.out.println("CreateCombinedFragmentEditPolicy.createCombinedFragment(): NO-2");
			return UnexecutableCommand.INSTANCE;
		}
		
		final CreateViewRequest mountingRegionRequest = helper.postCreateViewNode(UMLElementTypes.CombinedFragment_3010, semanticAndNodeInFrameRequest);
		Command mountingRegionCommand = bracketEP.getCommand(mountingRegionRequest);
		
		if (!isValid(mountingRegionCommand)){
			System.out.println("CreateCombinedFragmentEditPolicy.createCombinedFragment(): NO-3");
			return UnexecutableCommand.INSTANCE;
		}
		
		CreateConnectionViewRequest mountingLinkRequest = createMountingLinkRequest();
		CompositeCommand mountingLinkCommand = createMountingLinkCommand(//
				(IAdaptable)mountingRegionRequest.getViewDescriptors().get(0), //
				semanticAndNodeInFrameRequest.getViewAndElementDescriptor(), mountingLinkRequest);
		if (!mountingLinkCommand.canExecute()){
			System.out.println("CreateCombinedFragmentEditPolicy.createCombinedFragment(): NO-4");
			return UnexecutableCommand.INSTANCE;
		}
		
		AbstractTransactionalCommand setupFragmentAndMountOperands = new AbstractTransactionalCommand(getEditingDomain(), "", Collections.emptyList()){
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				Node fragmentNode = getCreatedFragmentNode();
				if (fragmentNode == null){
					return CommandResult.newCancelledCommandResult();
				}
				
				CombinedFragment fragment = (CombinedFragment)fragmentNode.getElement();
				if (fragment == null){
					return CommandResult.newCancelledCommandResult();
				}
				ChooseOperatorDialog.OperatorProperties config = dialog.getOperatorProperties();
				fragment.setInteractionOperator(config.getOperatorKind());
				
				for (int i = 0; i < config.getNumberOfOperands(); i++){
					InteractionOperand nextOperand = fragment.createOperand("Operand-" + i);
					nextOperand.getCovereds().add(lifeline);
					
					class SemanticAdapter extends EObjectAdapter {
						private final IElementType myType;

						public SemanticAdapter(IElementType type, EObject eObject){
							super(eObject);
							myType = type;
						}
						
						@SuppressWarnings("unchecked")
						@Override
						public Object getAdapter(Class adapter) {
							if (IElementType.class.isAssignableFrom(adapter)){
								return myType;
							}
							return super.getAdapter(adapter);
						}
					}
					
					Node nextOperandNode = 
						(Node)ViewService.getInstance().createView(
							Node.class, 
							new SemanticAdapter(UMLElementTypes.InteractionOperand_3009, nextOperand), 
							fragmentNode,
							UMLElementTypes.InteractionOperand_3009.getSemanticHint(),
							ViewUtil.APPEND,
							true,
							getPreferencesHint());
					
					ViewDescriptor parentMRDescriptor = (ViewDescriptor)mountingRegionRequest.getViewDescriptors().get(0);
					Node parentMR = (Node)parentMRDescriptor.getAdapter(Node.class);
					
					Node nextMountingRegionNode = 
						(Node)ViewService.getInstance().createView(
							Node.class, 
							new SemanticAdapter(UMLElementTypes.InteractionOperand_3011, nextOperand), 
							parentMR,
							UMLElementTypes.InteractionOperand_3011.getSemanticHint(),
							ViewUtil.APPEND,
							true,
							getPreferencesHint());
					
					Edge nextMountingLink = 
						(Edge)ViewService.getInstance().createView(
								Edge.class, 
								UMLElementTypes.Link_4002, 
								parentMR.getDiagram(),
								((INotationType)UMLElementTypes.Link_4002).getSemanticHint(),
								ViewUtil.APPEND,
								true,
								getPreferencesHint());
					
					nextMountingLink.setSource(nextMountingRegionNode);
					nextMountingLink.setTarget(nextOperandNode);
				}
				
				return CommandResult.newOKCommandResult();
			}
			
			private Node getCreatedFragmentNode(){
				EObject created = (EObject) semanticAndNodeInFrameRequest.getViewAndElementDescriptor().getAdapter(EObject.class);
				if (created instanceof Node){
					return (Node)created;
				}
				return null;
			}
		};
		
		
		
		InteractionNestedLayoutRequest layoutRequest = new InteractionNestedLayoutRequest();
//		layoutRequest.addViewAdapter(semanticAndNodeInFrameRequest.getViewAndElementDescriptor());
//		layoutRequest.addViewAdapters(mountingRegionRequest.getViewDescriptors());
//		layoutRequest.addViewAdapter(mountingLinkRequest.getConnectionViewDescriptor());
		Command layoutCommand = getLayoutCommand(layoutRequest);
//		Command layoutCommand = null;
		
		GEFAwareCompositeCommand result = new GEFAwareCompositeCommand(bracketEP.getEditingDomain(), "Creating Combined Fragment");
		result.add(dialog);
		result.add(semanticAndNodeInFrameCommand);
		result.add(mountingRegionCommand);
		result.add(mountingLinkCommand);
		result.add(setupFragmentAndMountOperands);
		
		Command main = new ICommandProxy(result);

		return postScheduleLayout(main, layoutCommand);
	}
	
	private GraphicalEditPart findFrameEditPart(GraphicalEditPart bracketEP){
		if (bracketEP instanceof LifelineEditPart){
			return (GraphicalEditPart)bracketEP.getParent();
		}
		return null;
	}
	
	private static class ShowDialogCommand extends AbstractTransactionalCommand {
		private ChooseOperatorDialog.OperatorProperties myProperties;

		public ShowDialogCommand(TransactionalEditingDomain domain){
			super(domain, "Select", Collections.emptyList());
		}
		
		public ChooseOperatorDialog.OperatorProperties getOperatorProperties() {
			return myProperties;
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
	        ChooseOperatorDialog dialog = new ChooseOperatorDialog(Display.getCurrent().getActiveShell()); 
	        if (Window.OK == dialog.open()) {
	            myProperties = dialog.getResult();
	            return CommandResult.newOKCommandResult();
	        }
	        return CommandResult.newCancelledCommandResult();
		}
	}
	
	
}
