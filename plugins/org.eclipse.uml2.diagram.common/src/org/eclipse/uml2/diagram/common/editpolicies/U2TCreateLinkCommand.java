package org.eclipse.uml2.diagram.common.editpolicies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

@SuppressWarnings("restriction")
public class U2TCreateLinkCommand extends CompositeCommand {

	private static final String REQUEST_PARAMETER_KEY = U2TCreateLinkCommand.class.getCanonicalName() + ":request:parameter:key";

	private ICommand mySemanticCreation;

	private ICommand myEdgeCreation;

	private SetConnectionEndsCommand mySetConnectionEndsCommand;

	private SetConnectionAnchorsCommand mySetConnectionAnchorsCommand;

	private SetConnectionBendpointsCommand mySetConnectionBendpointsCommand;
	
	private U2TCreateLinkParameters mySourceParameters;
	
	private U2TCreateLinkParameters myTargetParameters;
	
	public U2TCreateLinkCommand(TransactionalEditingDomain domain) {
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
		if (mySemanticCreation != null && !mySemanticCreation.canExecute()) {
			return false;
		}
		if (myEdgeCreation != null && !myEdgeCreation.canExecute()) {
			return false;
		}
		if (mySetConnectionEndsCommand != null && !mySetConnectionEndsCommand.canExecute()) {
			return false;
		}
		if (mySetConnectionAnchorsCommand != null && !mySetConnectionAnchorsCommand.canExecute()) {
			return false;
		}
		if (mySetConnectionBendpointsCommand != null && !mySetConnectionBendpointsCommand.canExecute()) {
			return false;
		}
		if (isEmpty()) {
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
		if (result != null && result.getSeverity() == IStatus.CANCEL && !isExecuted()) {
			remove(mySemanticCreation);
			remove(myEdgeCreation);
			remove(mySetConnectionEndsCommand);
			remove(mySetConnectionAnchorsCommand);
			remove(mySetConnectionBendpointsCommand);
		}

		return result;
	}

	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setSemanticCreation(ICommand semanticCreation) {
		assertNotExecuted();
		mySemanticCreation = semanticCreation;
	}
	
	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setSourceParameters(U2TCreateLinkParameters sourceParameters) {
		mySourceParameters = sourceParameters;
	}
	
	
	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setTargetParameters(U2TCreateLinkParameters targetParameters) {
		myTargetParameters = targetParameters;
	}

	public void setEdgeCreation(ICommand edgeAndSemantic) {
		assertNotExecuted();
		myEdgeCreation = edgeAndSemantic;
	}

	public void setEdgeAdapter(IAdaptable edgeAdaptor) {
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
	
	public U2TCreateLinkParameters getSourceParameters() {
		return mySourceParameters;
	}
	
	public U2TCreateLinkParameters getTargetParameters() {
		return myTargetParameters;
	}

	@SuppressWarnings("unchecked")
	public void registerInRequest(Request request) {
		request.getExtendedData().put(REQUEST_PARAMETER_KEY, this);
	}

	public static U2TCreateLinkCommand getFromRequest(Request request) {
		return (U2TCreateLinkCommand) request.getExtendedData().get(REQUEST_PARAMETER_KEY);
	}

	public static U2TCreateLinkCommand getFromRequest(IEditCommandRequest request) {
		return (U2TCreateLinkCommand) request.getParameter(REQUEST_PARAMETER_KEY);
	}
	
}
