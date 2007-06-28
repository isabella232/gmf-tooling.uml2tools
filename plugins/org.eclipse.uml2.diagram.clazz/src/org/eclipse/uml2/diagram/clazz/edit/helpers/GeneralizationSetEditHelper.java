package org.eclipse.uml2.diagram.clazz.edit.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
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
		Generalization generalization = getGeneralization(req);
		if (generalization != null && req.getElementToConfigure() instanceof GeneralizationSet) {
			GeneralizationSet generalizationSet = (GeneralizationSet) req.getElementToConfigure();
			SetRequest request = new SetRequest(generalizationSet, UMLPackage.eINSTANCE.getGeneralizationSet_Generalization(), generalization);
			return new SetValueCommand(request);
		}
		return super.getConfigureCommand(req);
	}

	private Generalization getGeneralization(ConfigureRequest req) {
		Object parameter = req.getParameter(PARAMETER_SET_GENERALIZATION);
		if (parameter instanceof Generalization) {
			return (Generalization) parameter;
		}
		return null;
	}
}
