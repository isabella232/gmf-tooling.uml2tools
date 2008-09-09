/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimingDAdapterFactory.java,v 1.5 2008/09/09 05:34:18 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.timing.model.timingd.*;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.DInterval;
import org.eclipse.uml2.diagram.timing.model.timingd.DMessage;
import org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage
 * @generated
 */
public class TimingDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimingDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingDSwitch<Adapter> modelSwitch =
		new TimingDSwitch<Adapter>() {
			@Override
			public Adapter caseDFrameContainer(DFrameContainer object) {
				return createDFrameContainerAdapter();
			}
			@Override
			public Adapter caseDFrame(DFrame object) {
				return createDFrameAdapter();
			}
			@Override
			public Adapter caseDBlock(DBlock object) {
				return createDBlockAdapter();
			}
			@Override
			public Adapter caseDValueLine(DValueLine object) {
				return createDValueLineAdapter();
			}
			@Override
			public Adapter caseDSegment(DSegment object) {
				return createDSegmentAdapter();
			}
			@Override
			public Adapter caseDSegmentElement(DSegmentElement object) {
				return createDSegmentElementAdapter();
			}
			@Override
			public Adapter caseDSegmentMiddlePoint(DSegmentMiddlePoint object) {
				return createDSegmentMiddlePointAdapter();
			}
			@Override
			public Adapter caseDSegmentStart(DSegmentStart object) {
				return createDSegmentStartAdapter();
			}
			@Override
			public Adapter caseDSegmentEnd(DSegmentEnd object) {
				return createDSegmentEndAdapter();
			}
			@Override
			public Adapter caseDStateSwitch(DStateSwitch object) {
				return createDStateSwitchAdapter();
			}
			@Override
			public Adapter caseDMessage(DMessage object) {
				return createDMessageAdapter();
			}
			@Override
			public Adapter caseDInterval(DInterval object) {
				return createDIntervalAdapter();
			}
			@Override
			public Adapter caseDPointConstraint(DPointConstraint object) {
				return createDPointConstraintAdapter();
			}
			@Override
			public Adapter caseDTick(DTick object) {
				return createDTickAdapter();
			}
			@Override
			public Adapter caseUMLConstraint(Constraint object) {
				return createUMLConstraintAdapter();
			}
			@Override
			public Adapter caseUMLStateInvariant(StateInvariant object) {
				return createUMLStateInvariantAdapter();
			}
			@Override
			public Adapter caseUMLInteraction(Interaction object) {
				return createUMLInteractionAdapter();
			}
			@Override
			public Adapter caseUMLPackage(org.eclipse.uml2.uml.Package object) {
				return createUMLPackageAdapter();
			}
			@Override
			public Adapter caseUMLLifeline(Lifeline object) {
				return createUMLLifelineAdapter();
			}
			@Override
			public Adapter caseUMLOccurrenceSpecification(OccurrenceSpecification object) {
				return createUMLOccurrenceSpecificationAdapter();
			}
			@Override
			public Adapter caseUMLMessage(Message object) {
				return createUMLMessageAdapter();
			}
			@Override
			public Adapter caseUMLDurationConstraint(DurationConstraint object) {
				return createUMLDurationConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer <em>DFrame Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer
	 * @generated
	 */
	public Adapter createDFrameContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrame <em>DFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DFrame
	 * @generated
	 */
	public Adapter createDFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock <em>DBlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DBlock
	 * @generated
	 */
	public Adapter createDBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine <em>DValue Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DValueLine
	 * @generated
	 */
	public Adapter createDValueLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment <em>DSegment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegment
	 * @generated
	 */
	public Adapter createDSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement <em>DSegment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement
	 * @generated
	 */
	public Adapter createDSegmentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint <em>DSegment Middle Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint
	 * @generated
	 */
	public Adapter createDSegmentMiddlePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart <em>DSegment Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart
	 * @generated
	 */
	public Adapter createDSegmentStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd <em>DSegment End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd
	 * @generated
	 */
	public Adapter createDSegmentEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch <em>DState Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch
	 * @generated
	 */
	public Adapter createDStateSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage <em>DMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DMessage
	 * @generated
	 */
	public Adapter createDMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval <em>DInterval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DInterval
	 * @generated
	 */
	public Adapter createDIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint <em>DPoint Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint
	 * @generated
	 */
	public Adapter createDPointConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick <em>DTick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DTick
	 * @generated
	 */
	public Adapter createDTickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Constraint <em>UML Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Constraint
	 * @generated
	 */
	public Adapter createUMLConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.StateInvariant <em>UML State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.StateInvariant
	 * @generated
	 */
	public Adapter createUMLStateInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Interaction <em>UML Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Interaction
	 * @generated
	 */
	public Adapter createUMLInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Package <em>UML Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Package
	 * @generated
	 */
	public Adapter createUMLPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Lifeline <em>UML Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Lifeline
	 * @generated
	 */
	public Adapter createUMLLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.OccurrenceSpecification <em>UML Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification
	 * @generated
	 */
	public Adapter createUMLOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Message <em>UML Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Message
	 * @generated
	 */
	public Adapter createUMLMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DurationConstraint <em>UML Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DurationConstraint
	 * @generated
	 */
	public Adapter createUMLDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimingDAdapterFactory
