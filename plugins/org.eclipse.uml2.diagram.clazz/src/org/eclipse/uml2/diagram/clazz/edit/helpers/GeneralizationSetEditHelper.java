package org.eclipse.uml2.diagram.clazz.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class GeneralizationSetEditHelper extends UMLBaseEditHelper {

	public static final String PARAMETER_SET_GENERALIZATION = GeneralizationSetEditHelper.class.getName() + ":SetGeneralizationSet"; //$NON-NLS-1$

	/**
	 * @NOT-generated 
	 */
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		ICommand superCommand = super.getConfigureCommand(req);
		Generalization generalization = getGeneralization(req);
		if (generalization != null && req.getElementToConfigure() instanceof GeneralizationSet) {
			GeneralizationSet generalizationSet = (GeneralizationSet) req.getElementToConfigure();
			SetRequest request = new SetRequest(generalizationSet, UMLPackage.eINSTANCE.getGeneralizationSet_Generalization(), generalization);
			SetValueCommand setType = new SetValueCommand(request);
			if (superCommand!= null) {
				CompositeCommand result = new CompositeCommand("");
				result.add(superCommand);
				result.add(setType);
				return result; 
			}
			return setType;
		}
		return superCommand;
	}

	private Generalization getGeneralization(ConfigureRequest req) {
		Object parameter = req.getParameter(PARAMETER_SET_GENERALIZATION);
		if (parameter instanceof Generalization) {
			return (Generalization) parameter;
		}
		return null;
	}
}
