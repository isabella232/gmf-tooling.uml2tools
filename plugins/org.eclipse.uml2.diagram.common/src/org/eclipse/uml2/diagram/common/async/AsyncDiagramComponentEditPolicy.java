package org.eclipse.uml2.diagram.common.async;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IInsertableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;

public class AsyncDiagramComponentEditPolicy extends ComponentEditPolicy {
	/**
	 * This is to combine the default GMF ComponentEditPolicy and ListItemComponentEditPolicy 
	 * into single U2T wrapper.
	 * 
	 * It affects the way how this editpolicy search for the insertableEditPart only in response to 
	 * semantic insert requests 
	 * @see getInsertableEditPart
	 */
	private final boolean myForListItem;

	public AsyncDiagramComponentEditPolicy(boolean forListItem){
		myForListItem = forListItem;
	}
	
	public AsyncDiagramComponentEditPolicy(){
		this(false);
	}
	

	@Override
	public Command getCommand(Request request) {
		if (!(request instanceof GroupRequest)) {
			return null;
		}
		if (request instanceof AsyncDiagramDeleteRequest) {
			AsyncDiagramDeleteRequest reqImpl = (AsyncDiagramDeleteRequest) request;
			switch (reqImpl.getKind()) {
			case LET_TARGET_DECIDE:
				return getDeleteCommand(reqImpl);
			case SEMANTIC_AND_NOTATION:
				return createDeleteSemanticCommand(reqImpl);
			case NOTATION_ONLY:
				return createSwitchSyncAndDeleteViewCommand(reqImpl);
			default:
				throw new IllegalArgumentException("Unknown kind: " + reqImpl.getKind());
			}
		}
		return super.getCommand(request);
	}
	

	private Command createSwitchSyncAndDeleteViewCommand(AsyncDiagramDeleteRequest req) {
		TransactionalEditingDomain editingDomain = getHostImpl().getEditingDomain();
		List<?> toDel = req.getEditParts();
		if (toDel == null || toDel.isEmpty()) {
			return new ICommandProxy(//
					doCreateSwitchSyncAndDeleteViewCommand(editingDomain, getHostImpl()));
		} 
		
		CompositeCommand cc = new CompositeCommand(StringStatics.BLANK);
		for (Object next : toDel) {
			IGraphicalEditPart nextEP = (IGraphicalEditPart) next;
			cc.compose(doCreateSwitchSyncAndDeleteViewCommand(editingDomain, nextEP));
		}
		return new ICommandProxy(cc.reduce());
	}
	
	private ICommand doCreateSwitchSyncAndDeleteViewCommand(TransactionalEditingDomain domain, IGraphicalEditPart editPart){
		EditPart parentEP = editPart.getParent();
		ICommand switchCommand = null;
		if (parentEP instanceof IGraphicalEditPart){
			View parentView = ((IGraphicalEditPart)parentEP).getNotationView();
			if (getCanonicalHelper().isAutoSynchronized(parentView)){
				switchCommand = new SwitchSyncModeCommand(domain, parentView, false);
			}
		}
		DeleteCommand deleteCommand = new DeleteCommand(domain, editPart.getNotationView());
		if (switchCommand == null){
			return deleteCommand;
		} 
		CompositeCommand result = new CompositeCommand(deleteCommand.getLabel());
		return result.compose(switchCommand).compose(deleteCommand);
	}
	
	protected IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
	protected IInsertableEditPart getInsertableEditPart() {
		if (myForListItem){
			// get the container of the host list item
			EditPart container = getHost().getParent();
			return (container instanceof IInsertableEditPart) ? (IInsertableEditPart)container : null; 
		}
		return super.getInsertableEditPart();
	}
	
	private ICanonicalHelper getCanonicalHelper(){
		return ICanonicalHelper.IMPLEMENTATION;
	}
	
	protected Command getInsertCommand(GroupRequest insertRequest) {
		IInsertableEditPart insertEP = getInsertableEditPart();
		if (null == insertEP) {
			return null;
		}

		EObject hostElement = ViewUtil.resolveSemanticElement((View) insertEP.getModel());
		if (hostElement != null) {
			TransactionalEditingDomain editingDomain = getHostImpl().getEditingDomain();
			if (editingDomain == null) {
				return null;
			}

			CreateUnspecifiedTypeRequest createReq = new CreateUnspecifiedTypeRequest( //
					Collections.singletonList(insertEP.getElementType()), getHostImpl().getDiagramPreferencesHint());
			
			Command result = insertEP.getCommand(createReq);
			if (result != null && result.canExecute()){
				Command selectCommand = new SelectJustCreatedCommand(getHostImpl().getViewer(), createReq);
				CompoundCommand withSelect = new CompoundCommand(result.getLabel());
				withSelect.add(result);
				withSelect.add(selectCommand);
				result = withSelect;
			}
			return result;
		}

		return null;
	}
	
	private static class SelectJustCreatedCommand extends Command {
		private final CreateUnspecifiedTypeRequest myCreateReq;
		private final EditPartViewer myViewer;

		public SelectJustCreatedCommand(EditPartViewer viewer, CreateUnspecifiedTypeRequest createReq){
			myViewer = viewer;
			myCreateReq = createReq;
		}
		
		@Override
		public void execute() {
			Object editPart = findCreatedEditPart();
			if (editPart != null){
				myViewer.setSelection(new StructuredSelection(editPart));
			}
		}
		
		@SuppressWarnings("unchecked")
		private Object findCreatedEditPart(){
			Object creationResult = myCreateReq.getNewObject();
			if (creationResult instanceof List){
				creationResult = ((List)creationResult).get(0);
			}
			View createdView = null;
			if (creationResult instanceof IAdaptable){
				createdView = (View) ((IAdaptable)creationResult).getAdapter(View.class);
			}
			return createdView == null ? null : myViewer.getEditPartRegistry().get(createdView);
		}
	}
	

}
