package org.eclipse.uml2.diagram.clazz.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName7EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetIsCoveringIsDisjointEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.clazz.parser.GeneralizationSetParser;
import org.eclipse.uml2.diagram.clazz.parser.association.end.AssociationEndApplyStrategy;
import org.eclipse.uml2.diagram.clazz.parser.association.end.AssociationEndParser;
import org.eclipse.uml2.diagram.clazz.parser.association.end.AssociationEndToString;
import org.eclipse.uml2.diagram.clazz.parser.association.name.AssociationNameParser;
import org.eclipse.uml2.diagram.clazz.parser.association.name.AssociationNameToString;
import org.eclipse.uml2.diagram.clazz.parser.dependency.DependencyTypeParser;
import org.eclipse.uml2.diagram.clazz.parser.instance.InstanceSpecificationParser;
import org.eclipse.uml2.diagram.clazz.parser.instance.InstanceSpecificationToString;
import org.eclipse.uml2.diagram.clazz.parser.slot.SlotParser;
import org.eclipse.uml2.diagram.clazz.parser.slot.SlotToString;
import org.eclipse.uml2.diagram.clazz.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.parser.operation.OperationInplaceApplier;
import org.eclipse.uml2.diagram.common.parser.operation.OperationParser;
import org.eclipse.uml2.diagram.common.parser.operation.OperationToString;
import org.eclipse.uml2.diagram.common.parser.port.PortParser;
import org.eclipse.uml2.diagram.common.parser.port.PortToString;
import org.eclipse.uml2.diagram.common.parser.property.PropertyParser;
import org.eclipse.uml2.diagram.common.parser.property.PropertyToString;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.ParserAdapter;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.lookup.DefaultOclLookups;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuiteImpl;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser packageName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5004Parser() {
		if (packageName_5004Parser == null) {
			packageName_5004Parser = createPackageName_5004Parser();
		}
		return packageName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5003Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5003Parser() {
		if (className_5003Parser == null) {
			className_5003Parser = createClassName_5003Parser();
		}
		return className_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationClassName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationClassName_5009Parser() {
		if (associationClassName_5009Parser == null) {
			associationClassName_5009Parser = createAssociationClassName_5009Parser();
		}
		return associationClassName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationClassName_5009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeName_5006Parser() {
		if (dataTypeName_5006Parser == null) {
			dataTypeName_5006Parser = createDataTypeName_5006Parser();
		}
		return dataTypeName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDataTypeName_5006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveTypeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveTypeName_5007Parser() {
		if (primitiveTypeName_5007Parser == null) {
			primitiveTypeName_5007Parser = createPrimitiveTypeName_5007Parser();
		}
		return primitiveTypeName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPrimitiveTypeName_5007Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationName_5005Parser() {
		if (enumerationName_5005Parser == null) {
			enumerationName_5005Parser = createEnumerationName_5005Parser();
		}
		return enumerationName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationName_5005Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5012Parser() {
		if (interfaceName_5012Parser == null) {
			interfaceName_5012Parser = createInterfaceName_5012Parser();
		}
		return interfaceName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5012Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintName_5008Parser() {
		if (constraintName_5008Parser == null) {
			constraintName_5008Parser = createConstraintName_5008Parser();
		}
		return constraintName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConstraintName_5008Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceSpecificationName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceSpecificationName_5010Parser() {
		if (instanceSpecificationName_5010Parser == null) {
			instanceSpecificationName_5010Parser = createInstanceSpecificationName_5010Parser();
		}
		return instanceSpecificationName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_5011Parser() {
		if (dependencyName_5011Parser == null) {
			dependencyName_5011Parser = createDependencyName_5011Parser();
		}
		return dependencyName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyName_5011Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationSetIsCoveringIsDisjoint_5016Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationSetIsCoveringIsDisjoint_5016Parser() {
		if (generalizationSetIsCoveringIsDisjoint_5016Parser == null) {
			generalizationSetIsCoveringIsDisjoint_5016Parser = createGeneralizationSetIsCoveringIsDisjoint_5016Parser();
		}
		return generalizationSetIsCoveringIsDisjoint_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationSetName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationSetName_5017Parser() {
		if (generalizationSetName_5017Parser == null) {
			generalizationSetName_5017Parser = createGeneralizationSetName_5017Parser();
		}
		return generalizationSetName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createGeneralizationSetName_5017Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern(":{0}");
		parser.setEditorPattern(":{0}");
		parser.setEditPattern(":{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5018Parser() {
		if (interfaceName_5018Parser == null) {
			interfaceName_5018Parser = createInterfaceName_5018Parser();
		}
		return interfaceName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5018Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser package_3006Parser;

	/**
	 * @generated
	 */
	private IParser getPackage_3006Parser() {
		if (package_3006Parser == null) {
			package_3006Parser = createPackage_3006Parser();
		}
		return package_3006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackage_3006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser class_3007Parser;

	/**
	 * @generated
	 */
	private IParser getClass_3007Parser() {
		if (class_3007Parser == null) {
			class_3007Parser = createClass_3007Parser();
		}
		return class_3007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClass_3007Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataType_3008Parser;

	/**
	 * @generated
	 */
	private IParser getDataType_3008Parser() {
		if (dataType_3008Parser == null) {
			dataType_3008Parser = createDataType_3008Parser();
		}
		return dataType_3008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDataType_3008Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveType_3009Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveType_3009Parser() {
		if (primitiveType_3009Parser == null) {
			primitiveType_3009Parser = createPrimitiveType_3009Parser();
		}
		return primitiveType_3009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPrimitiveType_3009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enumeration_3011Parser;

	/**
	 * @generated
	 */
	private IParser getEnumeration_3011Parser() {
		if (enumeration_3011Parser == null) {
			enumeration_3011Parser = createEnumeration_3011Parser();
		}
		return enumeration_3011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumeration_3011Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationClass_3012Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationClass_3012Parser() {
		if (associationClass_3012Parser == null) {
			associationClass_3012Parser = createAssociationClass_3012Parser();
		}
		return associationClass_3012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationClass_3012Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceSpecification_3013Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceSpecification_3013Parser() {
		if (instanceSpecification_3013Parser == null) {
			instanceSpecification_3013Parser = createInstanceSpecification_3013Parser();
		}
		return instanceSpecification_3013Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3001Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3001Parser() {
		if (property_3001Parser == null) {
			property_3001Parser = createProperty_3001Parser();
		}
		return property_3001Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3002Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3002Parser() {
		if (operation_3002Parser == null) {
			operation_3002Parser = createOperation_3002Parser();
		}
		return operation_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser class_3003Parser;

	/**
	 * @generated
	 */
	private IParser getClass_3003Parser() {
		if (class_3003Parser == null) {
			class_3003Parser = createClass_3003Parser();
		}
		return class_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClass_3003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getPortName_5013Parser() {
		if (portName_5013Parser == null) {
			portName_5013Parser = createPortName_5013Parser();
		}
		return portName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3019Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3019Parser() {
		if (property_3019Parser == null) {
			property_3019Parser = createProperty_3019Parser();
		}
		return property_3019Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3020Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3020Parser() {
		if (operation_3020Parser == null) {
			operation_3020Parser = createOperation_3020Parser();
		}
		return operation_3020Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3014Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3014Parser() {
		if (property_3014Parser == null) {
			property_3014Parser = createProperty_3014Parser();
		}
		return property_3014Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3015Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3015Parser() {
		if (operation_3015Parser == null) {
			operation_3015Parser = createOperation_3015Parser();
		}
		return operation_3015Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3021Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3021Parser() {
		if (property_3021Parser == null) {
			property_3021Parser = createProperty_3021Parser();
		}
		return property_3021Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3022Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3022Parser() {
		if (operation_3022Parser == null) {
			operation_3022Parser = createOperation_3022Parser();
		}
		return operation_3022Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationLiteral_3016Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationLiteral_3016Parser() {
		if (enumerationLiteral_3016Parser == null) {
			enumerationLiteral_3016Parser = createEnumerationLiteral_3016Parser();
		}
		return enumerationLiteral_3016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationLiteral_3016Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3023Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3023Parser() {
		if (property_3023Parser == null) {
			property_3023Parser = createProperty_3023Parser();
		}
		return property_3023Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3024Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3024Parser() {
		if (operation_3024Parser == null) {
			operation_3024Parser = createOperation_3024Parser();
		}
		return operation_3024Parser;
	}

	/**
	 * @generated
	 */
	private IParser slot_3017Parser;

	/**
	 * @generated
	 */
	private IParser getSlot_3017Parser() {
		if (slot_3017Parser == null) {
			slot_3017Parser = createSlot_3017Parser();
		}
		return slot_3017Parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3028Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3028Parser() {
		if (property_3028Parser == null) {
			property_3028Parser = createProperty_3028Parser();
		}
		return property_3028Parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_3029Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3029Parser() {
		if (operation_3029Parser == null) {
			operation_3029Parser = createOperation_3029Parser();
		}
		return operation_3029Parser;
	}

	/**
	 * @generated
	 */
	private IParser class_3030Parser;

	/**
	 * @generated
	 */
	private IParser getClass_3030Parser() {
		if (class_3030Parser == null) {
			class_3030Parser = createClass_3030Parser();
		}
		return class_3030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClass_3030Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_6001Parser() {
		if (dependencyName_6001Parser == null) {
			dependencyName_6001Parser = createDependencyName_6001Parser();
		}
		return dependencyName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyName_6001Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_6010Parser() {
		if (dependencyName_6010Parser == null) {
			dependencyName_6010Parser = createDependencyName_6010Parser();
		}
		return dependencyName_6010Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_6002Parser() {
		if (propertyName_6002Parser == null) {
			propertyName_6002Parser = createPropertyName_6002Parser();
		}
		return propertyName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyName_6002Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6003Parser() {
		if (associationName_6003Parser == null) {
			associationName_6003Parser = createAssociationName_6003Parser();
		}
		return associationName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6004Parser() {
		if (associationName_6004Parser == null) {
			associationName_6004Parser = createAssociationName_6004Parser();
		}
		return associationName_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6005Parser() {
		if (associationName_6005Parser == null) {
			associationName_6005Parser = createAssociationName_6005Parser();
		}
		return associationName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6006Parser() {
		if (associationName_6006Parser == null) {
			associationName_6006Parser = createAssociationName_6006Parser();
		}
		return associationName_6006Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6007Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6007Parser() {
		if (associationName_6007Parser == null) {
			associationName_6007Parser = createAssociationName_6007Parser();
		}
		return associationName_6007Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6008Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6008Parser() {
		if (associationName_6008Parser == null) {
			associationName_6008Parser = createAssociationName_6008Parser();
		}
		return associationName_6008Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6009Parser() {
		if (associationName_6009Parser == null) {
			associationName_6009Parser = createAssociationName_6009Parser();
		}
		return associationName_6009Parser;
	}

	/**
	 * @generated
	 */
	private IParser realizationName_6011Parser;

	/**
	 * @generated
	 */
	private IParser getRealizationName_6011Parser() {
		if (realizationName_6011Parser == null) {
			realizationName_6011Parser = createRealizationName_6011Parser();
		}
		return realizationName_6011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRealizationName_6011Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	public static final OCLLookup<Type> TYPE_LOOKUP = new OCLLookup<Type>(//
			UMLOCLFactory.getOCLLookupExpression(DefaultOclLookups.DEFAULT_TYPE_LOOKUP, UMLPackage.eINSTANCE.getNamedElement()), // 
			new IElementType[] { //
			/*
			 UMLElementTypes.Class_2001, // 
			 UMLElementTypes.DataType_2004, // 
			 UMLElementTypes.Enumeration_2003, // 
			 UMLElementTypes.PrimitiveType_2005, //
			 */
			});

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3001Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3019Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3014Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3021Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3023Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3028Parser() {
		return createPropertyParser();
	}

	/**
	 * @NOT-GENERATED
	 */
	private IParser createPropertyParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new PropertyParser(lookupSuite), new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3002Parser() {
		return createOperationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3020Parser() {
		return createOperationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3015Parser() {
		return createOperationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3029Parser() {
		return createOperationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3022Parser() {
		return createOperationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperation_3024Parser() {
		return createOperationParser();
	}

	/**
	 * @NOT-GENERATED
	 */
	protected IParser createOperationParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new OperationParser(lookupSuite), new OperationInplaceApplier(), new OperationToString.VIEW(), new OperationToString.EDIT());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createPortName_5013Parser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new PortParser(lookupSuite), new BasicApplyStrategy(), new PortToString());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createInstanceSpecification_3013Parser() {
		return createInstanceSpecificationParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createInstanceSpecificationName_5010Parser() {
		return createInstanceSpecificationParser();
	}

	/**
	 * @NOT-GENERATED
	 */
	private IParser createInstanceSpecificationParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);
		return new SemanticParserAdapter(new InstanceSpecificationParser(lookupSuite), new BasicApplyStrategy(), new InstanceSpecificationToString.VIEW(), new InstanceSpecificationToString.EDIT());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createSlot_3017Parser() {
		return new SemanticParserAdapter(new SlotParser(), new BasicApplyStrategy(), new SlotToString.VIEW(), new SlotToString.EDIT());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createGeneralizationSetIsCoveringIsDisjoint_5016Parser() {
		return new GeneralizationSetParser();
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDependencyName_6010Parser() {
		return new DependencyTypeParser();
	}

	/**
	 * @NOT-GENERATED
	 * Different view's but shared common edit.
	 */
	private IParser createAssocationRoleParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.ROLE_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	/**
	 * @NOT-GENERATED
	 */
	private IParser createAssocationModifiersParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.MODIFIERS_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	/**
	 * @NOT-GENERATED
	 */
	protected IParser createAssocationMultiplicityParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.MULTIPLICITY_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	/**
	 * @NOT-GENERATED
	 */
	private LookupSuite getAssociationLookupSuite() {
		return LookupSuite.NULL_SUITE;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6003Parser() {
		LookupSuite lookupSuite = LookupSuite.NULL_SUITE;
		return new ParserAdapter(new AssociationNameParser(lookupSuite), new BasicApplyStrategy(), new AssociationNameToString.VIEW(), new AssociationNameToString.EDIT());
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6004Parser() {
		return createAssocationRoleParser(true);
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6005Parser() {
		return createAssocationRoleParser(false);
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6006Parser() {
		return createAssocationModifiersParser(true);
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6007Parser() {
		return createAssocationModifiersParser(false);
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6008Parser() {
		return createAssocationMultiplicityParser(true);
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationName_6009Parser() {
		return createAssocationMultiplicityParser(false);
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5004Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5003Parser();
		case AssociationClassNameEditPart.VISUAL_ID:
			return getAssociationClassName_5009Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5006Parser();
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return getPrimitiveTypeName_5007Parser();
		case EnumerationNameEditPart.VISUAL_ID:
			return getEnumerationName_5005Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_5012Parser();
		case ConstraintNameEditPart.VISUAL_ID:
			return getConstraintName_5008Parser();
		case InstanceSpecificationNameEditPart.VISUAL_ID:
			return getInstanceSpecificationName_5010Parser();
		case DependencyNameEditPart.VISUAL_ID:
			return getDependencyName_5011Parser();
		case GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID:
			return getGeneralizationSetIsCoveringIsDisjoint_5016Parser();
		case GeneralizationSetNameEditPart.VISUAL_ID:
			return getGeneralizationSetName_5017Parser();
		case InterfaceName2EditPart.VISUAL_ID:
			return getInterfaceName_5018Parser();
		case Package3EditPart.VISUAL_ID:
			return getPackage_3006Parser();
		case ClassEditPart.VISUAL_ID:
			return getClass_3007Parser();
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3008Parser();
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_3009Parser();
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_3011Parser();
		case AssociationClassEditPart.VISUAL_ID:
			return getAssociationClass_3012Parser();
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getInstanceSpecification_3013Parser();
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002Parser();
		case Class3EditPart.VISUAL_ID:
			return getClass_3003Parser();
		case PortNameEditPart.VISUAL_ID:
			return getPortName_5013Parser();
		case Property2EditPart.VISUAL_ID:
			return getProperty_3019Parser();
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3020Parser();
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014Parser();
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3015Parser();
		case Property4EditPart.VISUAL_ID:
			return getProperty_3021Parser();
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3022Parser();
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3016Parser();
		case Property5EditPart.VISUAL_ID:
			return getProperty_3023Parser();
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3024Parser();
		case SlotEditPart.VISUAL_ID:
			return getSlot_3017Parser();
		case Property6EditPart.VISUAL_ID:
			return getProperty_3028Parser();
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3029Parser();
		case Class4EditPart.VISUAL_ID:
			return getClass_3030Parser();
		case DependencyName2EditPart.VISUAL_ID:
			return getDependencyName_6001Parser();
		case DependencyName3EditPart.VISUAL_ID:
			return getDependencyName_6010Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyName_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case AssociationName2EditPart.VISUAL_ID:
			return getAssociationName_6004Parser();
		case AssociationName3EditPart.VISUAL_ID:
			return getAssociationName_6005Parser();
		case AssociationName4EditPart.VISUAL_ID:
			return getAssociationName_6006Parser();
		case AssociationName5EditPart.VISUAL_ID:
			return getAssociationName_6007Parser();
		case AssociationName6EditPart.VISUAL_ID:
			return getAssociationName_6008Parser();
		case AssociationName7EditPart.VISUAL_ID:
			return getAssociationName_6009Parser();
		case RealizationNameEditPart.VISUAL_ID:
			return getRealizationName_6011Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		private final IElementType elementType;

		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
}
