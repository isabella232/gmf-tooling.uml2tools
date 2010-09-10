package org.eclipse.uml2.diagram.component.edit.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ComponentEditHelper extends UMLBaseEditHelper {

	@Override
	protected ICommand getMoveCommand(MoveRequest req) {
		List<Classifier> movedClassifiers = null;
		@SuppressWarnings("unchecked")
		Map<EObject, EReference> toMove = req.getElementsToMove();
		if (toMove != null) {
			for (Map.Entry<EObject, EReference> nextEntry : toMove.entrySet()) {
				EObject nextToMove = nextEntry.getKey();
				if (nextToMove instanceof Classifier) {
					if (movedClassifiers == null) {
						movedClassifiers = new ArrayList<Classifier>(toMove.size());
					}
					movedClassifiers.add((Classifier) nextToMove);
				}
			}
		}

		if (movedClassifiers == null) {
			return super.getMoveCommand(req);
		}

		MoveRequest withKnownTargetFeatures = new MoveRequest(req.getEditingDomain(), req.getTargetContainer(), new HashMap<EObject, EReference>(toMove));
		for (Classifier nextClassifier : movedClassifiers) {
			withKnownTargetFeatures.setTargetFeature(nextClassifier, UMLPackage.eINSTANCE.getComponent_PackagedElement());
		}
		return super.getMoveCommand(withKnownTargetFeatures);
	}
}
