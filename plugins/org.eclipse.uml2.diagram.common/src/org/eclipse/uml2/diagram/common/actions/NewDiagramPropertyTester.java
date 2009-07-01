package org.eclipse.uml2.diagram.common.actions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;

public class NewDiagramPropertyTester extends PropertyTester {

	private static final String PROPERTY_IS_PACKAGE = "isPackage"; //$NON-NLS-1$

	private static final String PROPERTY_IS_CLASS_DIAGRAM_ELEMENT = "isClassDiagramElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_COMPONENT_DIAGRAM_ELEMENT = "isComponentDiagramElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_COMPOSITE_STRUCTURE_DIAGRAM_ELEMENT = "isCompositeStructureDiagramElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_DEPLOYMENT_DIAGRAM_ELEMENT = "isDeploymentDiagramElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_PROFILE_DIAGRAM_ELEMENT = "isProfileDiagramElement"; //$NON-NLS-1$

	private static final String PROPERTY_IS_USE_CASE_DIAGRAM_ELEMENT = "isUseCaseDiagramElement"; //$NON-NLS-1$

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_IS_PACKAGE.equals(property)) {
			return isPackage(receiver);
		}
		if (PROPERTY_IS_CLASS_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateClassDiagram(receiver);
		}
		if (PROPERTY_IS_COMPONENT_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateComponentDiagram(receiver);
		}
		if (PROPERTY_IS_COMPOSITE_STRUCTURE_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateCompositeStructureDiagram(receiver);
		}
		if (PROPERTY_IS_DEPLOYMENT_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateDeploymentDiagram(receiver);
		}
		if (PROPERTY_IS_PROFILE_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateProfileDiagram(receiver);
		}
		if (PROPERTY_IS_USE_CASE_DIAGRAM_ELEMENT.equals(property)) {
			return canCreateUseCaseDiagram(receiver);
		}
		return false;
	}

	private static boolean isPackage(Object object) {
		EObject element = resolve(object);
		return (element != null) && (element instanceof org.eclipse.uml2.uml.Package);
	}

	private static boolean canCreateClassDiagram(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Class) // 
				|| (element instanceof org.eclipse.uml2.uml.AssociationClass) //
				|| (element instanceof org.eclipse.uml2.uml.DataType) //
				|| (element instanceof org.eclipse.uml2.uml.PrimitiveType) // 
				|| (element instanceof org.eclipse.uml2.uml.Enumeration) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment) //
				|| (element instanceof org.eclipse.uml2.uml.InstanceSpecification);
	}

	private static boolean canCreateComponentDiagram(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Component) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.Class) //
				|| (element instanceof org.eclipse.uml2.uml.Package) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

	private static boolean canCreateCompositeStructureDiagram(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Collaboration) //
				|| (element instanceof org.eclipse.uml2.uml.Class) //
				|| (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Interface) //
				|| (element instanceof org.eclipse.uml2.uml.InstanceSpecification) // 
				|| (element instanceof org.eclipse.uml2.uml.Constraint) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

	private static boolean canCreateDeploymentDiagram(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Device) //
				|| (element instanceof org.eclipse.uml2.uml.Node) //
				|| (element instanceof org.eclipse.uml2.uml.ExecutionEnvironment) //
				|| (element instanceof org.eclipse.uml2.uml.Artifact) //
				|| (element instanceof org.eclipse.uml2.uml.Deployment) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment)
				;
	}

	private static boolean canCreateProfileDiagram(Object object) {
		Element element = resolve(object);
		if (false == element.getOwner() instanceof Profile) {
			return false;
		}
		return (element instanceof org.eclipse.uml2.uml.Stereotype) //
				|| (element instanceof org.eclipse.uml2.uml.Profile) //
				|| (element instanceof org.eclipse.uml2.uml.Enumeration) //
				|| (element instanceof org.eclipse.uml2.uml.ElementImport) //
				|| (element instanceof org.eclipse.uml2.uml.Constraint) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment);
				;
	}

	private static boolean canCreateUseCaseDiagram(Object object) {
		EObject element = resolve(object);
		return (element instanceof org.eclipse.uml2.uml.Package) //
				|| (element instanceof org.eclipse.uml2.uml.Actor) //
				|| (element instanceof org.eclipse.uml2.uml.UseCase) //
				|| (element instanceof org.eclipse.uml2.uml.Component) //
//				|| (element instanceof org.eclipse.uml2.uml.Comment)
		;
	}

	private static Element resolve(Object object) {
		if (object instanceof IGraphicalEditPart) {
			object = ((IGraphicalEditPart) object).resolveSemanticElement();
		}
		if (object instanceof Element) {
			return (Element) object;
		}
		return null;
	}

}
