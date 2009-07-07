package org.eclipse.uml2.diagram.component.async;

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
	private static final String PROPERTY_IS_UMLCOMPONENT_DIAGRAM_ELEMENT = "isUMLComponentElement"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_IS_UMLCOMPONENT_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLComponentElement(receiver);
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public static boolean isUMLComponentElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Component) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.Class) //
				|| (element instanceof org.eclipse.uml2.uml.Package) //
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
