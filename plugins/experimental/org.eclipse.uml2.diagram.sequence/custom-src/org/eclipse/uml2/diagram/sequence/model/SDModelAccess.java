package org.eclipse.uml2.diagram.sequence.model;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.uml.Interaction;


public class SDModelAccess {
	public static SDFrame findSDModel(View view, boolean buildOnDemand){
		View interactionView = findInteractionView(view);
		if (interactionView == null){
			return null;
		}
		
		SDModelAccessStyle sdModelAccess = findSDModelAccess(interactionView);
		if (sdModelAccess == null){
			return null;
		}
		
		SDFrame result = sdModelAccess.getFrame();
		if (buildOnDemand && result == null){
			Interaction interaction = (Interaction) interactionView.getElement();	
			result = new SDBuilder(interaction).getSDFrame();
			if (result != null){
				result = safeSetSDModel(view, sdModelAccess, result);
			}
		}
		return result;
	}
	
	public static SDModelAccessStyle findSDModelAccess(View view){
		View interactionView = findInteractionView(view);
		if (interactionView == null){
			return null;
		}
		return (SDModelAccessStyle)view.getNamedStyle(SDNotationPackage.eINSTANCE.getSDModelAccessStyle(), SDModelAccessStyle.STYLE_NAME);
	}
	
	public static View findInteractionView(View view){
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

	private static void invalidateSDModel(View view){
		View interactionView = findInteractionView(view);
		if (interactionView == null){
			return;
		}
		
		SDModelAccessStyle sdModelAccess = findSDModelAccess(interactionView);
		if (sdModelAccess == null){
			return;
		}
		safeSetSDModel(interactionView, sdModelAccess, null);
	}
	
	private static SDFrame safeSetSDModel(View view, SDModelAccessStyle sdModelAccess, SDFrame value) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(view);
		SetRequest setRequest = new SetRequest(domain, sdModelAccess, SDNotationPackage.eINSTANCE.getSDModelAccessStyle_Frame(), value);
		SetValueCommand setValueCommand = new SetValueCommand(setRequest);
		try {
			OperationHistoryFactory.getOperationHistory().execute(setValueCommand, new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			e.printStackTrace();
			return null;
		}
		return sdModelAccess.getFrame();
	}
	

}
