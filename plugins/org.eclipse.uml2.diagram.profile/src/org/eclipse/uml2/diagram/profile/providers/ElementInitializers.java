package org.eclipse.uml2.diagram.profile.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.diagram.profile.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.profile.expressions.UMLOCLFactory;

import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Stereotype_2001(Stereotype instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getStereotype(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Profile_2002(Profile instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getProfile(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Enumeration_2003(Enumeration instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getEnumeration(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_2008(Constraint instance) {
		try {
			OpaqueExpression newInstance_0_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_0_0);
			Object value_0_0_0 = UMLOCLFactory.getExpression(13, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_0 instanceof Collection) {
				newInstance_0_0.getLanguages().clear();
				newInstance_0_0.getLanguages().addAll(((Collection) value_0_0_0));
			} else {
				newInstance_0_0.getLanguages().add((String) value_0_0_0);
			}
			Object value_0_0_1 = UMLOCLFactory.getExpression(14, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_1 instanceof Collection) {
				newInstance_0_0.getBodies().clear();
				newInstance_0_0.getBodies().addAll(((Collection) value_0_0_1));
			} else {
				newInstance_0_0.getBodies().add((String) value_0_0_1);
			}

		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3001(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_3008(Constraint instance) {
		try {
			OpaqueExpression newInstance_0_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_0_0);
			Object value_0_0_0 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_0 instanceof Collection) {
				newInstance_0_0.getLanguages().clear();
				newInstance_0_0.getLanguages().addAll(((Collection) value_0_0_0));
			} else {
				newInstance_0_0.getLanguages().add((String) value_0_0_0);
			}
			Object value_0_0_1 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_1 instanceof Collection) {
				newInstance_0_0.getBodies().clear();
				newInstance_0_0.getBodies().addAll(((Collection) value_0_0_1));
			} else {
				newInstance_0_0.getBodies().add((String) value_0_0_1);
			}

		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Image_3010(Image instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getImage(), null).evaluate(instance);
			instance.setLocation((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Stereotype_3003(Stereotype instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getStereotype(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_EnumerationLiteral_3005(EnumerationLiteral instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getEnumerationLiteral(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UMLDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
