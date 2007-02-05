package org.eclipse.uml2.diagram.clazz.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class DependencyEditHelper extends UMLBaseEditHelper {

	public static final String PARAMETER_DEPENDENCY_TYPE = DependencyEditHelper.class.getName() + ":ConfigureDependencyKind";

	public static final String PARAMETER_DEPENDENCY_NAME = DependencyEditHelper.class.getName() + ":SetDependencyName";

	/**
	 * @NOT-generated
	 */
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		if (req.getElementToConfigure() instanceof Dependency && req.getParameter(PARAMETER_DEPENDENCY_NAME) instanceof String) {
			Dependency dependency = (Dependency) req.getElementToConfigure();
			String name = (String) req.getParameter(PARAMETER_DEPENDENCY_NAME);
			SetRequest request = new SetRequest(dependency, UMLPackage.eINSTANCE.getNamedElement_Name(), name);
			return new SetValueCommand(request);
		}
		return super.getConfigureCommand(req);
	}
}