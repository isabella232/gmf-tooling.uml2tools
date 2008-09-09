package org.eclipse.uml2.diagram.timing.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * @generated
 */

public class TimingDDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == TimingDPackage.eINSTANCE.getDFrameContainer()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDFrame()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDBlock()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDValueLine()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDSegment()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDSegmentElement()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDSegmentMiddlePoint()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDSegmentStart()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDSegmentEnd()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDStateSwitch()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDMessage()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDInterval()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getDPointConstraint()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLConstraint()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLStateInvariant()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLInteraction()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLPackage()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLLifeline()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLOccurrenceSpecification()) {
			return true;
		}
		if (eClass == TimingDPackage.eINSTANCE.getUMLMessage()) {
			return true;
		}
		return false;
	}

}
