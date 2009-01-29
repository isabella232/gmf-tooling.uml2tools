package org.eclipse.uml2.diagram.common.editpolicies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;

@SuppressWarnings("restriction")
public class U2TCreateLinkCommand extends CompositeCommand {
	private ICommand mySemanticCreation;
	private ICommand myEdgeCreation;
	private SetConnectionEndsCommand mySetConnectionEndsCommand;
	private SetConnectionAnchorsCommand mySetConnectionAnchorsCommand;
	private SetConnectionBendpointsCommand mySetConnectionBendpointsCommand;
	
	public U2TCreateLinkCommand(TransactionalEditingDomain domain){
		super(DiagramUIMessages.Commands_CreateCommand_Connection_Label);
		
		mySetConnectionEndsCommand = new SetConnectionEndsCommand(domain, StringStatics.BLANK);
		mySetConnectionAnchorsCommand = new SetConnectionAnchorsCommand(domain, StringStatics.BLANK);
		mySetConnectionBendpointsCommand = new SetConnectionBendpointsCommand(domain);
	}
	
	@Override
	public void add(IUndoableOperation operation) {
		assertNotExecuted();
		super.add(operation);
	}
	
	@Override
	public boolean canExecute() {
		if (mySemanticCreation != null && !mySemanticCreation.canExecute()){
			return false;
		}
		if (myEdgeCreation != null && !myEdgeCreation.canExecute()){
			return false;
		}
		if (mySetConnectionEndsCommand != null && !mySetConnectionEndsCommand.canExecute()){
			return false;
		}
		if (mySetConnectionAnchorsCommand != null && !mySetConnectionAnchorsCommand.canExecute()){
			return false;
		}
		if (mySetConnectionBendpointsCommand != null && !mySetConnectionBendpointsCommand.canExecute()){
			return false;
		}
		if (isEmpty()){
			//we are not actually empty, we do have 5 commands before
			return true;
		}
		return super.canExecute();
	}
	
	@Override
	public IStatus execute(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		add(mySemanticCreation);
		add(myEdgeCreation);
		add(mySetConnectionEndsCommand);
		add(mySetConnectionAnchorsCommand);
		add(mySetConnectionBendpointsCommand);

		IStatus result = super.execute(progressMonitor, info);
		if (result != null && result.getSeverity() == IStatus.CANCEL && !isExecuted()){
			remove(mySemanticCreation);
			remove(myEdgeCreation);
			remove(mySetConnectionEndsCommand);
			remove(mySetConnectionAnchorsCommand);
			remove(mySetConnectionBendpointsCommand);
		}
		
		return result;
	}
	
	public void setSemanticCreation(ICommand semanticCreation) {
		assertNotExecuted();
		mySemanticCreation = semanticCreation;
	}
	
	public void setEdgeCreation(ICommand edgeAndSemantic) {
		assertNotExecuted();
		myEdgeCreation = edgeAndSemantic;
	}
	
	public void setEdgeAdapter(IAdaptable edgeAdaptor){
		assertNotExecuted();
		mySetConnectionEndsCommand.setEdgeAdaptor(edgeAdaptor);
		mySetConnectionAnchorsCommand.setEdgeAdaptor(edgeAdaptor);
		mySetConnectionBendpointsCommand.setEdgeAdapter(edgeAdaptor);
	}
	
	public void setSetConnectionAnchorsCommand(SetConnectionAnchorsCommand setConnectionAnchorsCommand) {
		assertNotExecuted();
		mySetConnectionAnchorsCommand = setConnectionAnchorsCommand;
	}
	
	public void setSetConnectionEndsCommand(SetConnectionEndsCommand setConnectionEndsCommand) {
		assertNotExecuted();
		mySetConnectionEndsCommand = setConnectionEndsCommand;
	}
	
	public void setSetConnectionBendpointsCommand(SetConnectionBendpointsCommand setConnectionBendpointsCommand) {
		assertNotExecuted();
		mySetConnectionBendpointsCommand = setConnectionBendpointsCommand;
	}
	
	public ICommand getSemanticCreation() {
		return mySemanticCreation;
	}

	public ICommand getEdgeCreation() {
		return myEdgeCreation;
	}
	
	public SetConnectionAnchorsCommand getSetConnectionAnchorsCommand() {
		return mySetConnectionAnchorsCommand;
	}
	
	public SetConnectionEndsCommand getSetConnectionEndsCommand() {
		return mySetConnectionEndsCommand;
	}
	
	public SetConnectionBendpointsCommand getSetConnectionBendpointsCommand() {
		return mySetConnectionBendpointsCommand;
	}
	
}
