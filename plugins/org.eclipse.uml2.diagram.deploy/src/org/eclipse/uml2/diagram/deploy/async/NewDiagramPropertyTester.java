package org.eclipse.uml2.diagram.deploy.async;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.uml.Element;

/**
 * @generated
 */
public class NewDiagramPropertyTester extends PropertyTester {

	/**
	 * @generated
	 */
	private static final String PROPERTY_IS_UMLDEPLOYMENT_DIAGRAM_ELEMENT = "isUMLDeploymentElement"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_IS_UMLDEPLOYMENT_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLDeploymentElement(receiver);
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public static boolean isUMLDeploymentElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Device) //
				|| (element instanceof org.eclipse.uml2.uml.Node) //
				|| (element instanceof org.eclipse.uml2.uml.ExecutionEnvironment) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Deployment) //
				|| (element instanceof org.eclipse.uml2.uml.Comment);
	}

	/**
	 * @generated
	 */
	public static Element resolve(Object object) {
		if (object instanceof IGraphicalEditPart) {
			object = ((IGraphicalEditPart) object).resolveSemanticElement();
		}
		if (object instanceof Element) {
			return (Element) object;
		}
		return null;
	}

}
