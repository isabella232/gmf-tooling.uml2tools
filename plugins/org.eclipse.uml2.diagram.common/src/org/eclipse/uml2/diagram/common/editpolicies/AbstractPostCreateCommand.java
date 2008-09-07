package org.eclipse.uml2.diagram.common.editpolicies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;

public abstract class AbstractPostCreateCommand extends AbstractTransactionalCommand {

	private final CreateViewAndElementRequest myCvaeReq;

	private final IVisualIDRegistry myVisualIDRegistry;

	private final IGraphicalEditPart myHostEditPart;

	public AbstractPostCreateCommand(TransactionalEditingDomain domain, CreateViewAndElementRequest cvaeReq, IGraphicalEditPart hostEditPart, IVisualIDRegistry visualIDRegistry) {
		super(domain, null, getWorkspaceFiles(hostEditPart.getNotationView()));
		myCvaeReq = cvaeReq;
		myHostEditPart = hostEditPart;
		myVisualIDRegistry = visualIDRegistry;
	}
	
	protected PreferencesHint getPreferencesHint(){
		return getHostEditPart().getDiagramPreferencesHint();
	}

	protected IGraphicalEditPart getHostEditPart() {
		return myHostEditPart;
	}

	protected CreateViewAndElementRequest getCvaeReq() {
		return myCvaeReq;
	}

	protected CreateElementRequestAdapter getSemanticRequestAdapter() {
		return myCvaeReq.getViewAndElementDescriptor().getCreateElementRequestAdapter();
	}

	protected CreateElementRequest getSemanticRequest() {
		return (CreateElementRequest) getSemanticRequestAdapter().getAdapter(CreateElementRequest.class);
	}

	protected View getCreatedView() {
		return (View) myCvaeReq.getViewAndElementDescriptor().getAdapter(View.class);
	}

	protected EObject getCreatedEntity() {
		return (EObject) getSemanticRequestAdapter().getAdapter(EObject.class);
	}

	protected View findChildByType(View view, int visualId) {
		for (Object next : view.getChildren()) {
			View nextChildView = (View) next;
			if (myVisualIDRegistry.getVisualID(nextChildView) == visualId) {
				return nextChildView;
			}
		}
		return null;
	}

	protected static void setLocation(View view, Point location) {
		if (view == null || location == null) {
			return;
		}
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_X(), new Integer(location.x));
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getLocation_Y(), new Integer(location.y));
	}

	protected static void setSize(View view, Dimension size) {
		if (view == null || size == null) {
			return;
		}
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Width(), new Integer(size.width));
		ViewUtil.setStructuralFeatureValue(view, NotationPackage.eINSTANCE.getSize_Height(), new Integer(size.height));
	}

}
