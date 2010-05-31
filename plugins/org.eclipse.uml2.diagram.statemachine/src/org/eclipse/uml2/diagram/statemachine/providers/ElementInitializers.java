package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
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
	public void init_StateMachine_2005(StateMachine instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getStateMachine(), null).evaluate(instance);
			instance.setName((String) value_0);
			Region newInstance_1_0 = UMLFactory.eINSTANCE.createRegion();
			instance.getRegions().add(newInstance_1_0);
			Object value_1_0_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getRegion(), null).evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_State_3001(State instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_State_3012(State instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
			Region newInstance_1_0 = UMLFactory.eINSTANCE.createRegion();
			instance.getRegions().add(newInstance_1_0);
			Object value_1_0_0 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getRegion(), null).evaluate(newInstance_1_0);
			newInstance_1_0.setName((String) value_1_0_0);

		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_State_3016(State instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(11, UMLPackage.eINSTANCE.getState(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConnectionPointReference_3017(ConnectionPointReference instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(13, UMLPackage.eINSTANCE.getConnectionPointReference(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConnectionPointReference_3018(ConnectionPointReference instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getConnectionPointReference(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3004(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(18, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3005(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(20, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3006(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(22, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3007(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(24, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3008(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(26, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3009(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(28, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3010(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(30, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3011(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(32, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3014(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(34, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(35, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pseudostate_3015(Pseudostate instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(37, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getPseudostateKind());
			instance.setKind((PseudostateKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(38, UMLPackage.eINSTANCE.getPseudostate(), null).evaluate(instance);
			instance.setName((String) value_1);
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
