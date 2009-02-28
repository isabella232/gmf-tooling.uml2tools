/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDPackage.java,v 1.4 2009/02/28 15:12:08 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDFactory
 * @model kind="package"
 * @generated
 */
public interface SDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequenced";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdt/uml2tools/sequence-diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml2t.seqd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SDPackage eINSTANCE = org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDModelImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDModelImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDFrame()
	 * @generated
	 */
	int SD_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Uml Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FRAME__UML_INTERACTION = 0;

	/**
	 * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FRAME__LIFELINES = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FRAME__MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FRAME__GATES = 3;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FRAME_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGate()
	 * @generated
	 */
	int SD_GATE = 1;

	/**
	 * The feature id for the '<em><b>Uml Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE__UML_GATE = 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineElementImpl <em>Life Line Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineElementImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDLifeLineElement()
	 * @generated
	 */
	int SD_LIFE_LINE_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Life Line Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_LIFE_LINE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketContainerImpl <em>Bracket Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketContainerImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBracketContainer()
	 * @generated
	 */
	int SD_BRACKET_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BRACKET_CONTAINER__BRACKETS = SD_LIFE_LINE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bracket Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BRACKET_CONTAINER_FEATURE_COUNT = SD_LIFE_LINE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketImpl <em>Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBracket()
	 * @generated
	 */
	int SD_BRACKET = 4;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BRACKET__BRACKET_CONTAINER = SD_LIFE_LINE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BRACKET_FEATURE_COUNT = SD_LIFE_LINE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineImpl <em>Life Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDLifeLine()
	 * @generated
	 */
	int SD_LIFE_LINE = 5;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_LIFE_LINE__BRACKETS = SD_BRACKET_CONTAINER__BRACKETS;

	/**
	 * The feature id for the '<em><b>Uml Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_LIFE_LINE__UML_LIFELINE = SD_BRACKET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_LIFE_LINE__FRAME = SD_BRACKET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Life Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_LIFE_LINE_FEATURE_COUNT = SD_BRACKET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBehaviorSpecImpl <em>Behavior Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBehaviorSpecImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBehaviorSpec()
	 * @generated
	 */
	int SD_BEHAVIOR_SPEC = 6;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC__BRACKET_CONTAINER = SD_BRACKET__BRACKET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC__BRACKETS = SD_BRACKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Execution Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC__UML_EXECUTION_SPEC = SD_BRACKET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uml Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC__UML_START = SD_BRACKET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uml Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC__UML_FINISH = SD_BRACKET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_BEHAVIOR_SPEC_FEATURE_COUNT = SD_BRACKET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDExecutionImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDExecution()
	 * @generated
	 */
	int SD_EXECUTION = 7;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__BRACKET_CONTAINER = SD_BEHAVIOR_SPEC__BRACKET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__BRACKETS = SD_BEHAVIOR_SPEC__BRACKETS;

	/**
	 * The feature id for the '<em><b>Uml Execution Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__UML_EXECUTION_SPEC = SD_BEHAVIOR_SPEC__UML_EXECUTION_SPEC;

	/**
	 * The feature id for the '<em><b>Uml Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__UML_START = SD_BEHAVIOR_SPEC__UML_START;

	/**
	 * The feature id for the '<em><b>Uml Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__UML_FINISH = SD_BEHAVIOR_SPEC__UML_FINISH;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__INVOCATION = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION__INCOMING_MESSAGE = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EXECUTION_FEATURE_COUNT = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDInvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDInvocationImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDInvocation()
	 * @generated
	 */
	int SD_INVOCATION = 8;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__BRACKET_CONTAINER = SD_BEHAVIOR_SPEC__BRACKET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__BRACKETS = SD_BEHAVIOR_SPEC__BRACKETS;

	/**
	 * The feature id for the '<em><b>Uml Execution Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__UML_EXECUTION_SPEC = SD_BEHAVIOR_SPEC__UML_EXECUTION_SPEC;

	/**
	 * The feature id for the '<em><b>Uml Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__UML_START = SD_BEHAVIOR_SPEC__UML_START;

	/**
	 * The feature id for the '<em><b>Uml Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__UML_FINISH = SD_BEHAVIOR_SPEC__UML_FINISH;

	/**
	 * The feature id for the '<em><b>Receive Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__RECEIVE_EXECUTION = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION__OUTGOING_MESSAGE = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_INVOCATION_FEATURE_COUNT = SD_BEHAVIOR_SPEC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDAbstractMessageImpl <em>Abstract Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDAbstractMessageImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDAbstractMessage()
	 * @generated
	 */
	int SD_ABSTRACT_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Uml Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_MESSAGE__UML_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_MESSAGE__FRAME = 1;

	/**
	 * The feature id for the '<em><b>Message Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_MESSAGE__MESSAGE_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Abstract Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDMessageImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDMessage()
	 * @generated
	 */
	int SD_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Uml Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE__UML_MESSAGE = SD_ABSTRACT_MESSAGE__UML_MESSAGE;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE__FRAME = SD_ABSTRACT_MESSAGE__FRAME;

	/**
	 * The feature id for the '<em><b>Message Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE__MESSAGE_NUMBER = SD_ABSTRACT_MESSAGE__MESSAGE_NUMBER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE__SOURCE = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE__TARGET = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MESSAGE_FEATURE_COUNT = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageImpl <em>Gate Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGateMessage()
	 * @generated
	 */
	int SD_GATE_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>Uml Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__UML_MESSAGE = SD_ABSTRACT_MESSAGE__UML_MESSAGE;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__FRAME = SD_ABSTRACT_MESSAGE__FRAME;

	/**
	 * The feature id for the '<em><b>Message Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__MESSAGE_NUMBER = SD_ABSTRACT_MESSAGE__MESSAGE_NUMBER;

	/**
	 * The feature id for the '<em><b>From Not To Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__FROM_NOT_TO_GATE = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__GATE = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normal End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE__NORMAL_END = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gate Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE_FEATURE_COUNT = SD_ABSTRACT_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageEndImpl <em>Gate Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageEndImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGateMessageEnd()
	 * @generated
	 */
	int SD_GATE_MESSAGE_END = 12;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE_END__BRACKET_CONTAINER = SD_BRACKET__BRACKET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Uml Message End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE_END__UML_MESSAGE_END = SD_BRACKET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Start Not Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE_END__IS_START_NOT_FINISH = SD_BRACKET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GATE_MESSAGE_END_FEATURE_COUNT = SD_BRACKET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDSimpleNodeImpl <em>Simple Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDSimpleNodeImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDSimpleNode()
	 * @generated
	 */
	int SD_SIMPLE_NODE = 13;

	/**
	 * The feature id for the '<em><b>Bracket Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_SIMPLE_NODE__BRACKET_CONTAINER = SD_BRACKET__BRACKET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Uml Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_SIMPLE_NODE__UML_FRAGMENT = SD_BRACKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_SIMPLE_NODE_FEATURE_COUNT = SD_BRACKET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Constraint <em>UML Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Constraint
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLConstraint()
	 * @generated
	 */
	int UML_CONSTRAINT = 14;

	/**
	 * The number of structural features of the '<em>UML Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.StateInvariant <em>UML State Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.StateInvariant
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLStateInvariant()
	 * @generated
	 */
	int UML_STATE_INVARIANT = 15;

	/**
	 * The number of structural features of the '<em>UML State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STATE_INVARIANT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Interaction <em>UML Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Interaction
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLInteraction()
	 * @generated
	 */
	int UML_INTERACTION = 16;

	/**
	 * The number of structural features of the '<em>UML Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Package <em>UML Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLPackage()
	 * @generated
	 */
	int UML_PACKAGE = 17;

	/**
	 * The number of structural features of the '<em>UML Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Lifeline <em>UML Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Lifeline
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLLifeline()
	 * @generated
	 */
	int UML_LIFELINE = 18;

	/**
	 * The number of structural features of the '<em>UML Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LIFELINE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.OccurrenceSpecification <em>UML Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLOccurrenceSpecification()
	 * @generated
	 */
	int UML_OCCURRENCE_SPECIFICATION = 19;

	/**
	 * The number of structural features of the '<em>UML Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Message <em>UML Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Message
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLMessage()
	 * @generated
	 */
	int UML_MESSAGE = 20;

	/**
	 * The number of structural features of the '<em>UML Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MESSAGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.DurationConstraint <em>UML Duration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.DurationConstraint
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLDurationConstraint()
	 * @generated
	 */
	int UML_DURATION_CONSTRAINT = 21;

	/**
	 * The number of structural features of the '<em>UML Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DURATION_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.InteractionFragment <em>UML Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.InteractionFragment
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLInteractionFragment()
	 * @generated
	 */
	int UML_INTERACTION_FRAGMENT = 22;

	/**
	 * The number of structural features of the '<em>UML Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INTERACTION_FRAGMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.ExecutionSpecification <em>UML Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ExecutionSpecification
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLExecutionSpecification()
	 * @generated
	 */
	int UML_EXECUTION_SPECIFICATION = 23;

	/**
	 * The number of structural features of the '<em>UML Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_EXECUTION_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.uml.Gate <em>UML Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Gate
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLGate()
	 * @generated
	 */
	int UML_GATE = 24;

	/**
	 * The number of structural features of the '<em>UML Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_GATE_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDTrace()
	 * @generated
	 */
	int SD_TRACE = 25;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_TRACE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel
	 * @generated
	 */
	EClass getSDFrame();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getUmlInteraction <em>Uml Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Interaction</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getUmlInteraction()
	 * @see #getSDFrame()
	 * @generated
	 */
	EReference getSDFrame_UmlInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifelines</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getLifelines()
	 * @see #getSDFrame()
	 * @generated
	 */
	EReference getSDFrame_Lifelines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getMessages()
	 * @see #getSDFrame()
	 * @generated
	 */
	EReference getSDFrame_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel#getGates()
	 * @see #getSDFrame()
	 * @generated
	 */
	EReference getSDFrame_Gates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate
	 * @generated
	 */
	EClass getSDGate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate#getUmlGate <em>Uml Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Gate</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate#getUmlGate()
	 * @see #getSDGate()
	 * @generated
	 */
	EReference getSDGate_UmlGate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement <em>Life Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Line Element</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement
	 * @generated
	 */
	EClass getSDLifeLineElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer <em>Bracket Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracket Container</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer
	 * @generated
	 */
	EClass getSDBracketContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer#getBrackets <em>Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Brackets</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer#getBrackets()
	 * @see #getSDBracketContainer()
	 * @generated
	 */
	EReference getSDBracketContainer_Brackets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracket</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket
	 * @generated
	 */
	EClass getSDBracket();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket#getBracketContainer <em>Bracket Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bracket Container</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket#getBracketContainer()
	 * @see #getSDBracket()
	 * @generated
	 */
	EReference getSDBracket_BracketContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Line</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine
	 * @generated
	 */
	EClass getSDLifeLine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getUmlLifeline <em>Uml Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Lifeline</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getUmlLifeline()
	 * @see #getSDLifeLine()
	 * @generated
	 */
	EReference getSDLifeLine_UmlLifeline();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Frame</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getFrame()
	 * @see #getSDLifeLine()
	 * @generated
	 */
	EReference getSDLifeLine_Frame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec <em>Behavior Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Spec</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec
	 * @generated
	 */
	EClass getSDBehaviorSpec();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlExecutionSpec <em>Uml Execution Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Execution Spec</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlExecutionSpec()
	 * @see #getSDBehaviorSpec()
	 * @generated
	 */
	EReference getSDBehaviorSpec_UmlExecutionSpec();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlStart <em>Uml Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Start</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlStart()
	 * @see #getSDBehaviorSpec()
	 * @generated
	 */
	EReference getSDBehaviorSpec_UmlStart();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlFinish <em>Uml Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Finish</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec#getUmlFinish()
	 * @see #getSDBehaviorSpec()
	 * @generated
	 */
	EReference getSDBehaviorSpec_UmlFinish();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution
	 * @generated
	 */
	EClass getSDExecution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocation</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution#getInvocation()
	 * @see #getSDExecution()
	 * @generated
	 */
	EReference getSDExecution_Invocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution#getIncomingMessage <em>Incoming Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution#getIncomingMessage()
	 * @see #getSDExecution()
	 * @generated
	 */
	EReference getSDExecution_IncomingMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation
	 * @generated
	 */
	EClass getSDInvocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation#getReceiveExecution <em>Receive Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Execution</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation#getReceiveExecution()
	 * @see #getSDInvocation()
	 * @generated
	 */
	EReference getSDInvocation_ReceiveExecution();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation#getOutgoingMessage <em>Outgoing Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation#getOutgoingMessage()
	 * @see #getSDInvocation()
	 * @generated
	 */
	EReference getSDInvocation_OutgoingMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage <em>Abstract Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage
	 * @generated
	 */
	EClass getSDAbstractMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getUmlMessage <em>Uml Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getUmlMessage()
	 * @see #getSDAbstractMessage()
	 * @generated
	 */
	EReference getSDAbstractMessage_UmlMessage();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Frame</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getFrame()
	 * @see #getSDAbstractMessage()
	 * @generated
	 */
	EReference getSDAbstractMessage_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getMessageNumber <em>Message Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Number</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage#getMessageNumber()
	 * @see #getSDAbstractMessage()
	 * @generated
	 */
	EAttribute getSDAbstractMessage_MessageNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage
	 * @generated
	 */
	EClass getSDMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage#getSource()
	 * @see #getSDMessage()
	 * @generated
	 */
	EReference getSDMessage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage#getTarget()
	 * @see #getSDMessage()
	 * @generated
	 */
	EReference getSDMessage_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage <em>Gate Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Message</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage
	 * @generated
	 */
	EClass getSDGateMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#isFromNotToGate <em>From Not To Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Not To Gate</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#isFromNotToGate()
	 * @see #getSDGateMessage()
	 * @generated
	 */
	EAttribute getSDGateMessage_FromNotToGate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gate</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#getGate()
	 * @see #getSDGateMessage()
	 * @generated
	 */
	EReference getSDGateMessage_Gate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#getNormalEnd <em>Normal End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Normal End</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage#getNormalEnd()
	 * @see #getSDGateMessage()
	 * @generated
	 */
	EReference getSDGateMessage_NormalEnd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd <em>Gate Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Message End</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd
	 * @generated
	 */
	EClass getSDGateMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd#getUmlMessageEnd <em>Uml Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Message End</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd#getUmlMessageEnd()
	 * @see #getSDGateMessageEnd()
	 * @generated
	 */
	EReference getSDGateMessageEnd_UmlMessageEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd#isIsStartNotFinish <em>Is Start Not Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start Not Finish</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd#isIsStartNotFinish()
	 * @see #getSDGateMessageEnd()
	 * @generated
	 */
	EAttribute getSDGateMessageEnd_IsStartNotFinish();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode <em>Simple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Node</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode
	 * @generated
	 */
	EClass getSDSimpleNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode#getUmlFragment <em>Uml Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Fragment</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode#getUmlFragment()
	 * @see #getSDSimpleNode()
	 * @generated
	 */
	EReference getSDSimpleNode_UmlFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Constraint <em>UML Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Constraint</em>'.
	 * @see org.eclipse.uml2.uml.Constraint
	 * @model instanceClass="org.eclipse.uml2.uml.Constraint"
	 * @generated
	 */
	EClass getUMLConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.StateInvariant <em>UML State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML State Invariant</em>'.
	 * @see org.eclipse.uml2.uml.StateInvariant
	 * @model instanceClass="org.eclipse.uml2.uml.StateInvariant"
	 * @generated
	 */
	EClass getUMLStateInvariant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Interaction <em>UML Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Interaction</em>'.
	 * @see org.eclipse.uml2.uml.Interaction
	 * @model instanceClass="org.eclipse.uml2.uml.Interaction"
	 * @generated
	 */
	EClass getUMLInteraction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Package <em>UML Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Package</em>'.
	 * @see org.eclipse.uml2.uml.Package
	 * @model instanceClass="org.eclipse.uml2.uml.Package"
	 * @generated
	 */
	EClass getUMLPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Lifeline <em>UML Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Lifeline</em>'.
	 * @see org.eclipse.uml2.uml.Lifeline
	 * @model instanceClass="org.eclipse.uml2.uml.Lifeline"
	 * @generated
	 */
	EClass getUMLLifeline();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.OccurrenceSpecification <em>UML Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Occurrence Specification</em>'.
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification
	 * @model instanceClass="org.eclipse.uml2.uml.OccurrenceSpecification"
	 * @generated
	 */
	EClass getUMLOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Message <em>UML Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Message</em>'.
	 * @see org.eclipse.uml2.uml.Message
	 * @model instanceClass="org.eclipse.uml2.uml.Message"
	 * @generated
	 */
	EClass getUMLMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.DurationConstraint <em>UML Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Duration Constraint</em>'.
	 * @see org.eclipse.uml2.uml.DurationConstraint
	 * @model instanceClass="org.eclipse.uml2.uml.DurationConstraint"
	 * @generated
	 */
	EClass getUMLDurationConstraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.InteractionFragment <em>UML Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Interaction Fragment</em>'.
	 * @see org.eclipse.uml2.uml.InteractionFragment
	 * @model instanceClass="org.eclipse.uml2.uml.InteractionFragment"
	 * @generated
	 */
	EClass getUMLInteractionFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.ExecutionSpecification <em>UML Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Execution Specification</em>'.
	 * @see org.eclipse.uml2.uml.ExecutionSpecification
	 * @model instanceClass="org.eclipse.uml2.uml.ExecutionSpecification"
	 * @generated
	 */
	EClass getUMLExecutionSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.uml.Gate <em>UML Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Gate</em>'.
	 * @see org.eclipse.uml2.uml.Gate
	 * @model instanceClass="org.eclipse.uml2.uml.Gate"
	 * @generated
	 */
	EClass getUMLGate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace
	 * @model instanceClass="org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace"
	 * @generated
	 */
	EClass getSDTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SDFactory getSDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDModelImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDModelImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDFrame()
		 * @generated
		 */
		EClass SD_FRAME = eINSTANCE.getSDFrame();

		/**
		 * The meta object literal for the '<em><b>Uml Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_FRAME__UML_INTERACTION = eINSTANCE.getSDFrame_UmlInteraction();

		/**
		 * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_FRAME__LIFELINES = eINSTANCE.getSDFrame_Lifelines();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_FRAME__MESSAGES = eINSTANCE.getSDFrame_Messages();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_FRAME__GATES = eINSTANCE.getSDFrame_Gates();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGate()
		 * @generated
		 */
		EClass SD_GATE = eINSTANCE.getSDGate();

		/**
		 * The meta object literal for the '<em><b>Uml Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_GATE__UML_GATE = eINSTANCE.getSDGate_UmlGate();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineElementImpl <em>Life Line Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineElementImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDLifeLineElement()
		 * @generated
		 */
		EClass SD_LIFE_LINE_ELEMENT = eINSTANCE.getSDLifeLineElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketContainerImpl <em>Bracket Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketContainerImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBracketContainer()
		 * @generated
		 */
		EClass SD_BRACKET_CONTAINER = eINSTANCE.getSDBracketContainer();

		/**
		 * The meta object literal for the '<em><b>Brackets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_BRACKET_CONTAINER__BRACKETS = eINSTANCE.getSDBracketContainer_Brackets();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketImpl <em>Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBracketImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBracket()
		 * @generated
		 */
		EClass SD_BRACKET = eINSTANCE.getSDBracket();

		/**
		 * The meta object literal for the '<em><b>Bracket Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_BRACKET__BRACKET_CONTAINER = eINSTANCE.getSDBracket_BracketContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineImpl <em>Life Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDLifeLineImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDLifeLine()
		 * @generated
		 */
		EClass SD_LIFE_LINE = eINSTANCE.getSDLifeLine();

		/**
		 * The meta object literal for the '<em><b>Uml Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_LIFE_LINE__UML_LIFELINE = eINSTANCE.getSDLifeLine_UmlLifeline();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_LIFE_LINE__FRAME = eINSTANCE.getSDLifeLine_Frame();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBehaviorSpecImpl <em>Behavior Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDBehaviorSpecImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDBehaviorSpec()
		 * @generated
		 */
		EClass SD_BEHAVIOR_SPEC = eINSTANCE.getSDBehaviorSpec();

		/**
		 * The meta object literal for the '<em><b>Uml Execution Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_BEHAVIOR_SPEC__UML_EXECUTION_SPEC = eINSTANCE.getSDBehaviorSpec_UmlExecutionSpec();

		/**
		 * The meta object literal for the '<em><b>Uml Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_BEHAVIOR_SPEC__UML_START = eINSTANCE.getSDBehaviorSpec_UmlStart();

		/**
		 * The meta object literal for the '<em><b>Uml Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_BEHAVIOR_SPEC__UML_FINISH = eINSTANCE.getSDBehaviorSpec_UmlFinish();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDExecutionImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDExecution()
		 * @generated
		 */
		EClass SD_EXECUTION = eINSTANCE.getSDExecution();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_EXECUTION__INVOCATION = eINSTANCE.getSDExecution_Invocation();

		/**
		 * The meta object literal for the '<em><b>Incoming Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_EXECUTION__INCOMING_MESSAGE = eINSTANCE.getSDExecution_IncomingMessage();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDInvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDInvocationImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDInvocation()
		 * @generated
		 */
		EClass SD_INVOCATION = eINSTANCE.getSDInvocation();

		/**
		 * The meta object literal for the '<em><b>Receive Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_INVOCATION__RECEIVE_EXECUTION = eINSTANCE.getSDInvocation_ReceiveExecution();

		/**
		 * The meta object literal for the '<em><b>Outgoing Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_INVOCATION__OUTGOING_MESSAGE = eINSTANCE.getSDInvocation_OutgoingMessage();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDAbstractMessageImpl <em>Abstract Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDAbstractMessageImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDAbstractMessage()
		 * @generated
		 */
		EClass SD_ABSTRACT_MESSAGE = eINSTANCE.getSDAbstractMessage();

		/**
		 * The meta object literal for the '<em><b>Uml Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_ABSTRACT_MESSAGE__UML_MESSAGE = eINSTANCE.getSDAbstractMessage_UmlMessage();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_ABSTRACT_MESSAGE__FRAME = eINSTANCE.getSDAbstractMessage_Frame();

		/**
		 * The meta object literal for the '<em><b>Message Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_ABSTRACT_MESSAGE__MESSAGE_NUMBER = eINSTANCE.getSDAbstractMessage_MessageNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDMessageImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDMessage()
		 * @generated
		 */
		EClass SD_MESSAGE = eINSTANCE.getSDMessage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_MESSAGE__SOURCE = eINSTANCE.getSDMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_MESSAGE__TARGET = eINSTANCE.getSDMessage_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageImpl <em>Gate Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGateMessage()
		 * @generated
		 */
		EClass SD_GATE_MESSAGE = eINSTANCE.getSDGateMessage();

		/**
		 * The meta object literal for the '<em><b>From Not To Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_GATE_MESSAGE__FROM_NOT_TO_GATE = eINSTANCE.getSDGateMessage_FromNotToGate();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_GATE_MESSAGE__GATE = eINSTANCE.getSDGateMessage_Gate();

		/**
		 * The meta object literal for the '<em><b>Normal End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_GATE_MESSAGE__NORMAL_END = eINSTANCE.getSDGateMessage_NormalEnd();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageEndImpl <em>Gate Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDGateMessageEndImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDGateMessageEnd()
		 * @generated
		 */
		EClass SD_GATE_MESSAGE_END = eINSTANCE.getSDGateMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Uml Message End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_GATE_MESSAGE_END__UML_MESSAGE_END = eINSTANCE.getSDGateMessageEnd_UmlMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Is Start Not Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_GATE_MESSAGE_END__IS_START_NOT_FINISH = eINSTANCE.getSDGateMessageEnd_IsStartNotFinish();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDSimpleNodeImpl <em>Simple Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDSimpleNodeImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDSimpleNode()
		 * @generated
		 */
		EClass SD_SIMPLE_NODE = eINSTANCE.getSDSimpleNode();

		/**
		 * The meta object literal for the '<em><b>Uml Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_SIMPLE_NODE__UML_FRAGMENT = eINSTANCE.getSDSimpleNode_UmlFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Constraint <em>UML Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Constraint
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLConstraint()
		 * @generated
		 */
		EClass UML_CONSTRAINT = eINSTANCE.getUMLConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.StateInvariant <em>UML State Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.StateInvariant
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLStateInvariant()
		 * @generated
		 */
		EClass UML_STATE_INVARIANT = eINSTANCE.getUMLStateInvariant();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Interaction <em>UML Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Interaction
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLInteraction()
		 * @generated
		 */
		EClass UML_INTERACTION = eINSTANCE.getUMLInteraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Package <em>UML Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Package
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLPackage()
		 * @generated
		 */
		EClass UML_PACKAGE = eINSTANCE.getUMLPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Lifeline <em>UML Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Lifeline
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLLifeline()
		 * @generated
		 */
		EClass UML_LIFELINE = eINSTANCE.getUMLLifeline();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.OccurrenceSpecification <em>UML Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.OccurrenceSpecification
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLOccurrenceSpecification()
		 * @generated
		 */
		EClass UML_OCCURRENCE_SPECIFICATION = eINSTANCE.getUMLOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Message <em>UML Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Message
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLMessage()
		 * @generated
		 */
		EClass UML_MESSAGE = eINSTANCE.getUMLMessage();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.DurationConstraint <em>UML Duration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.DurationConstraint
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLDurationConstraint()
		 * @generated
		 */
		EClass UML_DURATION_CONSTRAINT = eINSTANCE.getUMLDurationConstraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.InteractionFragment <em>UML Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.InteractionFragment
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLInteractionFragment()
		 * @generated
		 */
		EClass UML_INTERACTION_FRAGMENT = eINSTANCE.getUMLInteractionFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.ExecutionSpecification <em>UML Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.ExecutionSpecification
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLExecutionSpecification()
		 * @generated
		 */
		EClass UML_EXECUTION_SPECIFICATION = eINSTANCE.getUMLExecutionSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.uml.Gate <em>UML Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Gate
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getUMLGate()
		 * @generated
		 */
		EClass UML_GATE = eINSTANCE.getUMLGate();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDTrace
		 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDPackageImpl#getSDTrace()
		 * @generated
		 */
		EClass SD_TRACE = eINSTANCE.getSDTrace();

	}

} //SDPackage
