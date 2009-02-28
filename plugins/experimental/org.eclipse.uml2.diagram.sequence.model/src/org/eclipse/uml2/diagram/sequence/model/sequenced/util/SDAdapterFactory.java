/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDAdapterFactory.java,v 1.4 2009/02/28 15:21:20 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.sequence.model.sequenced.*;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage
 * @generated
 */
public class SDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SDPackage.eINSTANCE;
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
	protected SDSwitch<Adapter> modelSwitch =
		new SDSwitch<Adapter>() {
			@Override
			public Adapter caseSDModel(SDModel object) {
				return createSDModelAdapter();
			}
			@Override
			public Adapter caseSDGate(SDGate object) {
				return createSDGateAdapter();
			}
			@Override
			public Adapter caseSDLifeLineElement(SDLifeLineElement object) {
				return createSDLifeLineElementAdapter();
			}
			@Override
			public Adapter caseSDBracketContainer(SDBracketContainer object) {
				return createSDBracketContainerAdapter();
			}
			@Override
			public Adapter caseSDBracket(SDBracket object) {
				return createSDBracketAdapter();
			}
			@Override
			public Adapter caseSDLifeLine(SDLifeLine object) {
				return createSDLifeLineAdapter();
			}
			@Override
			public Adapter caseSDBehaviorSpec(SDBehaviorSpec object) {
				return createSDBehaviorSpecAdapter();
			}
			@Override
			public Adapter caseSDExecution(SDExecution object) {
				return createSDExecutionAdapter();
			}
			@Override
			public Adapter caseSDInvocation(SDInvocation object) {
				return createSDInvocationAdapter();
			}
			@Override
			public Adapter caseSDAbstractMessage(SDAbstractMessage object) {
				return createSDAbstractMessageAdapter();
			}
			@Override
			public Adapter caseSDMessage(SDMessage object) {
				return createSDMessageAdapter();
			}
			@Override
			public Adapter caseSDGateMessage(SDGateMessage object) {
				return createSDGateMessageAdapter();
			}
			@Override
			public Adapter caseSDGateMessageEnd(SDGateMessageEnd object) {
				return createSDGateMessageEndAdapter();
			}
			@Override
			public Adapter caseSDSimpleNode(SDSimpleNode object) {
				return createSDSimpleNodeAdapter();
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
			public Adapter caseUMLInteractionFragment(InteractionFragment object) {
				return createUMLInteractionFragmentAdapter();
			}
			@Override
			public Adapter caseUMLExecutionSpecification(ExecutionSpecification object) {
				return createUMLExecutionSpecificationAdapter();
			}
			@Override
			public Adapter caseUMLGate(Gate object) {
				return createUMLGateAdapter();
			}
			@Override
			public Adapter caseSDTrace(SDTrace object) {
				return createSDTraceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel
	 * @generated
	 */
	public Adapter createSDModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate
	 * @generated
	 */
	public Adapter createSDGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement <em>Life Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement
	 * @generated
	 */
	public Adapter createSDLifeLineElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer <em>Bracket Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer
	 * @generated
	 */
	public Adapter createSDBracketContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket
	 * @generated
	 */
	public Adapter createSDBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine
	 * @generated
	 */
	public Adapter createSDLifeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec <em>Behavior Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec
	 * @generated
	 */
	public Adapter createSDBehaviorSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution
	 * @generated
	 */
	public Adapter createSDExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation
	 * @generated
	 */
	public Adapter createSDInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage <em>Abstract Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage
	 * @generated
	 */
	public Adapter createSDAbstractMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage
	 * @generated
	 */
	public Adapter createSDMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage <em>Gate Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage
	 * @generated
	 */
	public Adapter createSDGateMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd <em>Gate Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd
	 * @generated
	 */
	public Adapter createSDGateMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode <em>Simple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode
	 * @generated
	 */
	public Adapter createSDSimpleNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.InteractionFragment <em>UML Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.InteractionFragment
	 * @generated
	 */
	public Adapter createUMLInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ExecutionSpecification <em>UML Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ExecutionSpecification
	 * @generated
	 */
	public Adapter createUMLExecutionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Gate <em>UML Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Gate
	 * @generated
	 */
	public Adapter createUMLGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace
	 * @generated
	 */
	public Adapter createSDTraceAdapter() {
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

} //SDAdapterFactory
