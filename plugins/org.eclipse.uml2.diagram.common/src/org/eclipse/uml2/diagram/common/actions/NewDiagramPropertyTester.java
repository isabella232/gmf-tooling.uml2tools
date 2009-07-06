package org.eclipse.uml2.diagram.common.actions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;

public class NewDiagramPropertyTester extends PropertyTester {

	private static final String PROPERTY_IS_CLASS_DIAGRAM_ELEMENT = "isUMLClassElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_COMPONENT_DIAGRAM_ELEMENT = "isUMLComponentElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_COMPOSITE_STRUCTURE_DIAGRAM_ELEMENT = "isUMLCompositeStructuresElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_DEPLOYMENT_DIAGRAM_ELEMENT = "isUMLDeploymentElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_PROFILE_DIAGRAM_ELEMENT = "isUMLProfileElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_USE_CASE_DIAGRAM_ELEMENT = "isUMLUseCaseElement"; //$NON-NLS-1$

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_IS_CLASS_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLClassElement(receiver);
		}
		if (PROPERTY_IS_COMPONENT_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLComponentElement(receiver);
		}
		if (PROPERTY_IS_COMPOSITE_STRUCTURE_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLCompositeStructuresElement(receiver);
		}
		if (PROPERTY_IS_DEPLOYMENT_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLDeploymentElement(receiver);
		}
		if (PROPERTY_IS_PROFILE_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLProfileElement(receiver);
		}
		if (PROPERTY_IS_USE_CASE_DIAGRAM_ELEMENT.equals(property)) {
			return isUMLUseCaseElement(receiver);
		}
		return false;
	}

	public static boolean isUMLClassElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Class) // 
				|| (element instanceof org.eclipse.uml2.uml.AssociationClass) //
				|| (element instanceof org.eclipse.uml2.uml.DataType) //
				|| (element instanceof org.eclipse.uml2.uml.PrimitiveType) // 
				|| (element instanceof org.eclipse.uml2.uml.Enumeration) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.Comment) //
				|| (element instanceof org.eclipse.uml2.uml.InstanceSpecification);
	}

	public static boolean isUMLComponentElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Component) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.Class) //
				|| (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Comment) 
				;
	}

	public static boolean isUMLCompositeStructuresElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Collaboration) //
				|| (element instanceof org.eclipse.uml2.uml.Class) //
				|| (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.InstanceSpecification) // 
				|| (element instanceof org.eclipse.uml2.uml.Constraint) //
				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

	public static boolean isUMLDeploymentElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Device) //
				|| (element instanceof org.eclipse.uml2.uml.Node) //
				|| (element instanceof org.eclipse.uml2.uml.ExecutionEnvironment) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Deployment) //
				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

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
				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

	public static boolean isUMLUseCaseElement(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Actor) //
				|| (element instanceof org.eclipse.uml2.uml.UseCase) //
				|| (element instanceof org.eclipse.uml2.uml.Component) //
				|| (element instanceof org.eclipse.uml2.uml.Comment)
		;
	}

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
