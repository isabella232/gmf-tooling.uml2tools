package org.eclipse.uml2.diagram.usecase.providers;

import java.util.Collection;
import org.eclipse.uml2.diagram.usecase.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;

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
	public void init_Actor_2002(Actor instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getActor(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Actor_2005(Actor instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getActor(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_2003(UseCase instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getUseCase(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_2004(UseCase instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getUseCase(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_2006(Component instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getComponent(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_2007(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
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
			Object value_0_0_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_0 instanceof Collection) {
				newInstance_0_0.getLanguages().clear();
				newInstance_0_0.getLanguages().addAll(((Collection) value_0_0_0));
			} else {
				newInstance_0_0.getLanguages().add((String) value_0_0_0);
			}
			Object value_0_0_1 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
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
	public void init_ExtensionPoint_3002(ExtensionPoint instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getExtensionPoint(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExtensionPoint_3003(ExtensionPoint instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getExtensionPoint(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_3004(UseCase instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getUseCase(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Actor_3005(Actor instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getActor(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_UseCase_3006(UseCase instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getUseCase(), null).evaluate(instance);
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
