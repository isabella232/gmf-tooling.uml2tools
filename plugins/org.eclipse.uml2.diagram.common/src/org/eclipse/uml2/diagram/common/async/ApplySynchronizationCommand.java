package org.eclipse.uml2.diagram.common.async;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

public class ApplySynchronizationCommand extends AbstractTransactionalCommand {
	private final SyncModelNode mySyncRoot;

	public ApplySynchronizationCommand(SyncModelNode syncRoot) {
		super(syncRoot.getContext().getDomain(), "Applying synchronization changes", getWorkspaceFiles(syncRoot.getDiagramView()));
		assert (syncRoot.getDiagramView() != null);
		mySyncRoot = syncRoot;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		LinkedList<SyncModelNode> queue = new LinkedList<SyncModelNode>();
		queue.add(mySyncRoot);
		while (!queue.isEmpty()){
			SyncModelNode next = queue.removeFirst();
			syncNode(next, queue);
		}
		return CommandResult.newOKCommandResult();
	}

	private void syncNode(SyncModelNode node, List<SyncModelNode> queue) {
		View diagramView = node.getDiagramView();
		assert (diagramView != null);

		if (!node.isRoot() && !node.isChecked()) {
			removeView(diagramView);
			return;
		}

		node.applyCanonicalStyle();

		for (SyncModelNode nextSyncChild : node.getChildren()) {
			if (nextSyncChild.isChecked()) {
				forceHasDiagramView(nextSyncChild);
				queue.add(nextSyncChild);
			} else {
				if (nextSyncChild.getDiagramView() != null) {
					queue.add(nextSyncChild); //diagram view will be removed at next step
				}
			}
		}
	}

	private void forceHasDiagramView(SyncModelNode node) {
		if (node.getDiagramView() != null) {
			return;
		}

		SyncModelNode parent = node.getParent();
		View diagramParent = parent.getDiagramView();
		if (node.isInCompartment()) {
			View syncCompartment = node.getSyncModelCompartment();
			View diagramCompartment = SyncModelNode.findCounterpart(syncCompartment, node.getParent().getDiagramView());
			if (diagramCompartment == null) {
				throw new IllegalStateException(//
						"Can't find diagram compartment for sync-model compartment: " + syncCompartment + // 
								", sync-model parent: " + node.getSyncModelView() + //
								", diagram parent: " + node.getDiagramView());
			}
			diagramParent = diagramCompartment;
		}
		
		View copy = ViewService.createNode(diagramParent, node.getSyncModelView().getElement(), node.getSyncModelView().getType(), mySyncRoot.getContext().getPreferencesHint());
		assert copy != null;
		
		node.associateWithDiagramView(copy);
		node.applyCanonicalStyle();
	}
	
	private void removeView(View view) {
		ViewUtil.destroy(view);
	}

}
