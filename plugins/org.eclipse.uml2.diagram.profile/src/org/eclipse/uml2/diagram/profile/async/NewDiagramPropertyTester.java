package org.eclipse.uml2.diagram.profile.async;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;

/**
 * @generated
 */
public class NewDiagramPropertyTester extends PropertyTester {

	/**
	 * @generated
	 */
	private static final String PROPERTY_IS_UMLPROFILE_DIAGRAM_ELEMENT = "isUMLProfileElement"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_IS_UMLPROFILE_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLProfileElement(receiver);
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public static boolean isUMLProfileElement(Object object) {
		Element element = resolve(object);
		if (element == null) {
			return false;
		}
		if (false == element.getOwner() instanceof Profile) {
			return false;
		}
		return (element instanceof org.eclipse.uml2.uml.Stereotype) //
				|| (element instanceof org.eclipse.uml2.uml.Profile) //
				|| (element instanceof org.eclipse.uml2.uml.Enumeration) //
				|| (element instanceof org.eclipse.uml2.uml.ElementImport) //
				|| (element instanceof org.eclipse.uml2.uml.Constraint) //
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
