package org.eclipse.uml2.diagram.sequence.model;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelStorageStyle;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.uml.Interaction;


public class SDModelAccess {
	public static SDFrame findSDModel(View view){
		SDModelStorageStyle accessor = findSDModelAccessor(view);
		return accessor == null ? null : accessor.getAttachedModel();
	}

	public static SDModelStorageStyle findSDModelAccessor(View view){
		View interactionView = findInteractionView(view);
		if (interactionView == null){
			return null;
		}
		return (SDModelStorageStyle)interactionView.getStyle(SDNotationPackage.eINSTANCE.getSDModelStorageStyle());
	}
	
	public static View findInteractionView(View view){
		if (view instanceof Edge){
			view = ((Edge)view).getTarget();
		}
		if (view.isSetElement() && view.getElement() instanceof Interaction){
			return view;
		}
		if (view instanceof Diagram){
			return null;
		}
		if (view.eContainer() instanceof View){
			return findInteractionView((View)view.eContainer());
		}
		return null;
	}

//	private static void invalidateSDModel(View view){
//		View interactionView = findInteractionView(view);
//		if (interactionView == null){
//			return;
//		}
//		
//		SDModelAccessStyle sdModelAccess = findSDModelAccess(interactionView);
//		if (sdModelAccess == null){
//			return;
//		}
//		safeSetSDModel(interactionView, sdModelAccess, null);
//	}
//	
//	private static SDFrame safeSetSDModel(View view, SDModelAccessStyle sdModelAccess, SDFrame value) {
//		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(view);
//		SetRequest setRequest = new SetRequest(domain, sdModelAccess, SDNotationPackage.eINSTANCE.getSDModelAccessStyle_Frame(), value);
//		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
//		try {
//			OperationHistoryFactory.getOperationHistory().execute(setValueCommand, new NullProgressMonitor(), null);
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//			return null;
//		}
//		return sdModelAccess.getFrame();
//	}
	
	public static ICommand getInvalidateSDModelCommand(IGraphicalEditPart editPart){
		return getInvalidateSDModelCommand(editPart.getNotationView());
	}
	
	public static ICommand getInvalidateSDModelCommand(View view){
		if (view == null){
			return null;
		}
		return new InvalidateSDModelCommand(view);
		
	}
	

}
