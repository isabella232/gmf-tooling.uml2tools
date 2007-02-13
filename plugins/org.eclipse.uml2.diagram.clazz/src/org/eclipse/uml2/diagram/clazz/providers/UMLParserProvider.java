package org.eclipse.uml2.diagram.clazz.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import java.util.ArrayList;
import java.util.List;
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
import org.eclipse.uml2.diagram.clazz.parser.operation.OperationInplaceApplier;
import org.eclipse.uml2.diagram.clazz.parser.operation.OperationParser;
import org.eclipse.uml2.diagram.clazz.parser.operation.OperationToString;
import org.eclipse.uml2.diagram.clazz.parser.slot.SlotParser;
import org.eclipse.uml2.diagram.clazz.parser.slot.SlotToString;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
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
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

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
	 * @generated
	 */
	private IParser propertyProperty_3001Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3001Parser() {
		if (propertyProperty_3001Parser == null) {
			propertyProperty_3001Parser = createPropertyProperty_3001Parser();
		}
		return propertyProperty_3001Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createPropertyProperty_3001Parser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new PropertyParser(lookupSuite), new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3002Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3002Parser() {
		if (operationOperation_3002Parser == null) {
			operationOperation_3002Parser = createOperationOperation_3002Parser();
		}
		return operationOperation_3002Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperationOperation_3002Parser() {
		return createOperationParser();
	}

	protected IParser createOperationParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new OperationParser(lookupSuite), new OperationInplaceApplier(), new OperationToString.VIEW(), new OperationToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser classClass_3003Parser;

	/**
	 * @generated
	 */
	private IParser getClassClass_3003Parser() {
		if (classClass_3003Parser == null) {
			classClass_3003Parser = createClassClass_3003Parser();
		}
		return classClass_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClass_3003Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portPortName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getPortPortName_5013Parser() {
		if (portPortName_5013Parser == null) {
			portPortName_5013Parser = createPortPortName_5013Parser();
		}
		return portPortName_5013Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createPortPortName_5013Parser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);

		return new SemanticParserAdapter(new PortParser(lookupSuite), new BasicApplyStrategy(), new PortToString());
	}

	/**
	 * @generated
	 */
	private IParser propertyProperty_3019Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3019Parser() {
		if (propertyProperty_3019Parser == null) {
			propertyProperty_3019Parser = createPropertyProperty_3019Parser();
		}
		return propertyProperty_3019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyProperty_3019Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3020Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3020Parser() {
		if (operationOperation_3020Parser == null) {
			operationOperation_3020Parser = createOperationOperation_3020Parser();
		}
		return operationOperation_3020Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperationOperation_3020Parser() {
		return createOperationParser();
	}

	/**
	 * @generated
	 */
	private IParser packagePackage_3006Parser;

	/**
	 * @generated
	 */
	private IParser getPackagePackage_3006Parser() {
		if (packagePackage_3006Parser == null) {
			packagePackage_3006Parser = createPackagePackage_3006Parser();
		}
		return packagePackage_3006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackagePackage_3006Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classClass_3007Parser;

	/**
	 * @generated
	 */
	private IParser getClassClass_3007Parser() {
		if (classClass_3007Parser == null) {
			classClass_3007Parser = createClassClass_3007Parser();
		}
		return classClass_3007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClass_3007Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeDataType_3008Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeDataType_3008Parser() {
		if (dataTypeDataType_3008Parser == null) {
			dataTypeDataType_3008Parser = createDataTypeDataType_3008Parser();
		}
		return dataTypeDataType_3008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDataTypeDataType_3008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveTypePrimitiveType_3009Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveTypePrimitiveType_3009Parser() {
		if (primitiveTypePrimitiveType_3009Parser == null) {
			primitiveTypePrimitiveType_3009Parser = createPrimitiveTypePrimitiveType_3009Parser();
		}
		return primitiveTypePrimitiveType_3009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPrimitiveTypePrimitiveType_3009Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationEnumeration_3011Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationEnumeration_3011Parser() {
		if (enumerationEnumeration_3011Parser == null) {
			enumerationEnumeration_3011Parser = createEnumerationEnumeration_3011Parser();
		}
		return enumerationEnumeration_3011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationEnumeration_3011Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationClassAssociationClass_3012Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationClassAssociationClass_3012Parser() {
		if (associationClassAssociationClass_3012Parser == null) {
			associationClassAssociationClass_3012Parser = createAssociationClassAssociationClass_3012Parser();
		}
		return associationClassAssociationClass_3012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationClassAssociationClass_3012Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceSpecificationInstanceSpecification_3013Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceSpecificationInstanceSpecification_3013Parser() {
		if (instanceSpecificationInstanceSpecification_3013Parser == null) {
			instanceSpecificationInstanceSpecification_3013Parser = createInstanceSpecificationInstanceSpecification_3013Parser();
		}
		return instanceSpecificationInstanceSpecification_3013Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createInstanceSpecificationInstanceSpecification_3013Parser() {
		return createInstanceSpecificationParser();
	}

	/**
	 * @generated
	 */
	private IParser propertyProperty_3014Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3014Parser() {
		if (propertyProperty_3014Parser == null) {
			propertyProperty_3014Parser = createPropertyProperty_3014Parser();
		}
		return propertyProperty_3014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyProperty_3014Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3015Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3015Parser() {
		if (operationOperation_3015Parser == null) {
			operationOperation_3015Parser = createOperationOperation_3015Parser();
		}
		return operationOperation_3015Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperationOperation_3015Parser() {
		return createOperationParser();
	}

	/**
	 * @generated
	 */
	private IParser propertyProperty_3021Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3021Parser() {
		if (propertyProperty_3021Parser == null) {
			propertyProperty_3021Parser = createPropertyProperty_3021Parser();
		}
		return propertyProperty_3021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyProperty_3021Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3022Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3022Parser() {
		if (operationOperation_3022Parser == null) {
			operationOperation_3022Parser = createOperationOperation_3022Parser();
		}
		return operationOperation_3022Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperationOperation_3022Parser() {
		return createOperationParser();
	}

	/**
	 * @generated
	 */
	private IParser enumerationLiteralEnumerationLiteral_3016Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationLiteralEnumerationLiteral_3016Parser() {
		if (enumerationLiteralEnumerationLiteral_3016Parser == null) {
			enumerationLiteralEnumerationLiteral_3016Parser = createEnumerationLiteralEnumerationLiteral_3016Parser();
		}
		return enumerationLiteralEnumerationLiteral_3016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationLiteralEnumerationLiteral_3016Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyProperty_3023Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3023Parser() {
		if (propertyProperty_3023Parser == null) {
			propertyProperty_3023Parser = createPropertyProperty_3023Parser();
		}
		return propertyProperty_3023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyProperty_3023Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3024Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3024Parser() {
		if (operationOperation_3024Parser == null) {
			operationOperation_3024Parser = createOperationOperation_3024Parser();
		}
		return operationOperation_3024Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createOperationOperation_3024Parser() {
		return createOperationParser();
	}

	/**
	 * @generated
	 */
	private IParser slotSlot_3017Parser;

	/**
	 * @generated
	 */
	private IParser getSlotSlot_3017Parser() {
		if (slotSlot_3017Parser == null) {
			slotSlot_3017Parser = createSlotSlot_3017Parser();
		}
		return slotSlot_3017Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createSlotSlot_3017Parser() {
		return new SemanticParserAdapter(new SlotParser(), new BasicApplyStrategy(), new SlotToString.VIEW(), new SlotToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser propertyProperty_3028Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyProperty_3028Parser() {
		if (propertyProperty_3028Parser == null) {
			propertyProperty_3028Parser = createPropertyProperty_3028Parser();
		}
		return propertyProperty_3028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyProperty_3028Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operationOperation_3029Parser;

	/**
	 * @generated
	 */
	private IParser getOperationOperation_3029Parser() {
		if (operationOperation_3029Parser == null) {
			operationOperation_3029Parser = createOperationOperation_3029Parser();
		}
		return operationOperation_3029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperationOperation_3029Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classClass_3030Parser;

	/**
	 * @generated
	 */
	private IParser getClassClass_3030Parser() {
		if (classClass_3030Parser == null) {
			classClass_3030Parser = createClassClass_3030Parser();
		}
		return classClass_3030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClass_3030Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classClassName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getClassClassName_5003Parser() {
		if (classClassName_5003Parser == null) {
			classClassName_5003Parser = createClassClassName_5003Parser();
		}
		return classClassName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClassName_5003Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packagePackageName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getPackagePackageName_5004Parser() {
		if (packagePackageName_5004Parser == null) {
			packagePackageName_5004Parser = createPackagePackageName_5004Parser();
		}
		return packagePackageName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackagePackageName_5004Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationEnumerationName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationEnumerationName_5005Parser() {
		if (enumerationEnumerationName_5005Parser == null) {
			enumerationEnumerationName_5005Parser = createEnumerationEnumerationName_5005Parser();
		}
		return enumerationEnumerationName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationEnumerationName_5005Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataTypeDataTypeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDataTypeDataTypeName_5006Parser() {
		if (dataTypeDataTypeName_5006Parser == null) {
			dataTypeDataTypeName_5006Parser = createDataTypeDataTypeName_5006Parser();
		}
		return dataTypeDataTypeName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDataTypeDataTypeName_5006Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveTypePrimitiveTypeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveTypePrimitiveTypeName_5007Parser() {
		if (primitiveTypePrimitiveTypeName_5007Parser == null) {
			primitiveTypePrimitiveTypeName_5007Parser = createPrimitiveTypePrimitiveTypeName_5007Parser();
		}
		return primitiveTypePrimitiveTypeName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPrimitiveTypePrimitiveTypeName_5007Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser constraintConstraintName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintConstraintName_5008Parser() {
		if (constraintConstraintName_5008Parser == null) {
			constraintConstraintName_5008Parser = createConstraintConstraintName_5008Parser();
		}
		return constraintConstraintName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConstraintConstraintName_5008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationClassAssociationClassName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationClassAssociationClassName_5009Parser() {
		if (associationClassAssociationClassName_5009Parser == null) {
			associationClassAssociationClassName_5009Parser = createAssociationClassAssociationClassName_5009Parser();
		}
		return associationClassAssociationClassName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationClassAssociationClassName_5009Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser instanceSpecificationInstanceSpecificationName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getInstanceSpecificationInstanceSpecificationName_5010Parser() {
		if (instanceSpecificationInstanceSpecificationName_5010Parser == null) {
			instanceSpecificationInstanceSpecificationName_5010Parser = createInstanceSpecificationInstanceSpecificationName_5010Parser();
		}
		return instanceSpecificationInstanceSpecificationName_5010Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createInstanceSpecificationInstanceSpecificationName_5010Parser() {
		return createInstanceSpecificationParser();
	}

	protected IParser createInstanceSpecificationParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);
		return new SemanticParserAdapter(new InstanceSpecificationParser(lookupSuite), new BasicApplyStrategy(), new InstanceSpecificationToString.VIEW(), new InstanceSpecificationToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser dependencyDependencyName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyDependencyName_5011Parser() {
		if (dependencyDependencyName_5011Parser == null) {
			dependencyDependencyName_5011Parser = createDependencyDependencyName_5011Parser();
		}
		return dependencyDependencyName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyDependencyName_5011Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser() {
		if (generalizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser == null) {
			generalizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser = createGeneralizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser();
		}
		return generalizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createGeneralizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser() {
		return new GeneralizationSetParser();
	}

	/**
	 * @generated
	 */
	private IParser generalizationSetGeneralizationSetName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationSetGeneralizationSetName_5017Parser() {
		if (generalizationSetGeneralizationSetName_5017Parser == null) {
			generalizationSetGeneralizationSetName_5017Parser = createGeneralizationSetGeneralizationSetName_5017Parser();
		}
		return generalizationSetGeneralizationSetName_5017Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createGeneralizationSetGeneralizationSetName_5017Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name()) {

			@Override
			protected EObject getDomainElement(EObject element) {
				if (element instanceof GeneralizationSet) {
					return ((GeneralizationSet) element).getPowertype();
				}
				return super.getDomainElement(element);
			}
		};
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceInterfaceName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceInterfaceName_5018Parser() {
		if (interfaceInterfaceName_5018Parser == null) {
			interfaceInterfaceName_5018Parser = createInterfaceInterfaceName_5018Parser();
		}
		return interfaceInterfaceName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceInterfaceName_5018Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceInterfaceName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceInterfaceName_5012Parser() {
		if (interfaceInterfaceName_5012Parser == null) {
			interfaceInterfaceName_5012Parser = createInterfaceInterfaceName_5012Parser();
		}
		return interfaceInterfaceName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceInterfaceName_5012Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyDependencyName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyDependencyName_6001Parser() {
		if (dependencyDependencyName_6001Parser == null) {
			dependencyDependencyName_6001Parser = createDependencyDependencyName_6001Parser();
		}
		return dependencyDependencyName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyDependencyName_6001Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyDependencyName_6010Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyDependencyName_6010Parser() {
		if (dependencyDependencyName_6010Parser == null) {
			dependencyDependencyName_6010Parser = createDependencyDependencyName_6010Parser();
		}
		return dependencyDependencyName_6010Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDependencyDependencyName_6010Parser() {
		return new DependencyTypeParser();
	}

	/**
	 * @generated
	 */
	private IParser propertyPropertyName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyPropertyName_6002Parser() {
		if (propertyPropertyName_6002Parser == null) {
			propertyPropertyName_6002Parser = createPropertyPropertyName_6002Parser();
		}
		return propertyPropertyName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyPropertyName_6002Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6003Parser() {
		if (associationAssociationName_6003Parser == null) {
			associationAssociationName_6003Parser = createAssociationAssociationName_6003Parser();
		}
		return associationAssociationName_6003Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6003Parser() {
		LookupSuite lookupSuite = LookupSuite.NULL_SUITE;
		return new ParserAdapter(new AssociationNameParser(lookupSuite), new BasicApplyStrategy(), new AssociationNameToString.VIEW(), new AssociationNameToString.EDIT());
	}

	/**
	 * Different view's but shared common edit.
	 */
	protected IParser createAssocationRoleParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.ROLE_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	protected IParser createAssocationModifiersParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.MODIFIERS_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	protected IParser createAssocationMultiplicityParser(boolean sourceNotTarget) {
		LookupSuite lookupSuite = getAssociationLookupSuite();
		return new SemanticParserAdapter(new AssociationEndParser(lookupSuite), new AssociationEndApplyStrategy(sourceNotTarget), new AssociationEndToString.MULTIPLICITY_VIEW(sourceNotTarget),
				new AssociationEndToString.EDIT(sourceNotTarget));
	}

	protected LookupSuite getAssociationLookupSuite() {
		return LookupSuite.NULL_SUITE;
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6004Parser() {
		if (associationAssociationName_6004Parser == null) {
			associationAssociationName_6004Parser = createAssociationAssociationName_6004Parser();
		}
		return associationAssociationName_6004Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6004Parser() {
		return createAssocationRoleParser(true);
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6005Parser() {
		if (associationAssociationName_6005Parser == null) {
			associationAssociationName_6005Parser = createAssociationAssociationName_6005Parser();
		}
		return associationAssociationName_6005Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6005Parser() {
		return createAssocationRoleParser(false);
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6006Parser() {
		if (associationAssociationName_6006Parser == null) {
			associationAssociationName_6006Parser = createAssociationAssociationName_6006Parser();
		}
		return associationAssociationName_6006Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6006Parser() {
		return createAssocationModifiersParser(true);
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6007Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6007Parser() {
		if (associationAssociationName_6007Parser == null) {
			associationAssociationName_6007Parser = createAssociationAssociationName_6007Parser();
		}
		return associationAssociationName_6007Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6007Parser() {
		return createAssocationModifiersParser(false);
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6008Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6008Parser() {
		if (associationAssociationName_6008Parser == null) {
			associationAssociationName_6008Parser = createAssociationAssociationName_6008Parser();
		}
		return associationAssociationName_6008Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6008Parser() {
		return createAssocationMultiplicityParser(true);
	}

	/**
	 * @generated
	 */
	private IParser associationAssociationName_6009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationAssociationName_6009Parser() {
		if (associationAssociationName_6009Parser == null) {
			associationAssociationName_6009Parser = createAssociationAssociationName_6009Parser();
		}
		return associationAssociationName_6009Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createAssociationAssociationName_6009Parser() {
		return createAssocationMultiplicityParser(false);
	}

	/**
	 * @generated
	 */
	private IParser realizationRealizationName_6011Parser;

	/**
	 * @generated
	 */
	private IParser getRealizationRealizationName_6011Parser() {
		if (realizationRealizationName_6011Parser == null) {
			realizationRealizationName_6011Parser = createRealizationRealizationName_6011Parser();
		}
		return realizationRealizationName_6011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRealizationRealizationName_6011Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Package3EditPart.VISUAL_ID:
			return getPackagePackage_3006Parser();
		case ClassEditPart.VISUAL_ID:
			return getClassClass_3007Parser();
		case DataTypeEditPart.VISUAL_ID:
			return getDataTypeDataType_3008Parser();
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveTypePrimitiveType_3009Parser();
		case EnumerationEditPart.VISUAL_ID:
			return getEnumerationEnumeration_3011Parser();
		case AssociationClassEditPart.VISUAL_ID:
			return getAssociationClassAssociationClass_3012Parser();
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getInstanceSpecificationInstanceSpecification_3013Parser();
		case PropertyEditPart.VISUAL_ID:
			return getPropertyProperty_3001Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperationOperation_3002Parser();
		case Class3EditPart.VISUAL_ID:
			return getClassClass_3003Parser();
		case PortNameEditPart.VISUAL_ID:
			return getPortPortName_5013Parser();
		case Property2EditPart.VISUAL_ID:
			return getPropertyProperty_3019Parser();
		case Operation2EditPart.VISUAL_ID:
			return getOperationOperation_3020Parser();
		case Property3EditPart.VISUAL_ID:
			return getPropertyProperty_3014Parser();
		case Operation3EditPart.VISUAL_ID:
			return getOperationOperation_3015Parser();
		case Property4EditPart.VISUAL_ID:
			return getPropertyProperty_3021Parser();
		case Operation4EditPart.VISUAL_ID:
			return getOperationOperation_3022Parser();
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteralEnumerationLiteral_3016Parser();
		case Property5EditPart.VISUAL_ID:
			return getPropertyProperty_3023Parser();
		case Operation5EditPart.VISUAL_ID:
			return getOperationOperation_3024Parser();
		case SlotEditPart.VISUAL_ID:
			return getSlotSlot_3017Parser();
		case Property6EditPart.VISUAL_ID:
			return getPropertyProperty_3028Parser();
		case Operation6EditPart.VISUAL_ID:
			return getOperationOperation_3029Parser();
		case Class4EditPart.VISUAL_ID:
			return getClassClass_3030Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackagePackageName_5004Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassClassName_5003Parser();
		case AssociationClassNameEditPart.VISUAL_ID:
			return getAssociationClassAssociationClassName_5009Parser();
		case DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeDataTypeName_5006Parser();
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return getPrimitiveTypePrimitiveTypeName_5007Parser();
		case EnumerationNameEditPart.VISUAL_ID:
			return getEnumerationEnumerationName_5005Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceInterfaceName_5012Parser();
		case ConstraintNameEditPart.VISUAL_ID:
			return getConstraintConstraintName_5008Parser();
		case InstanceSpecificationNameEditPart.VISUAL_ID:
			return getInstanceSpecificationInstanceSpecificationName_5010Parser();
		case DependencyNameEditPart.VISUAL_ID:
			return getDependencyDependencyName_5011Parser();
		case GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID:
			return getGeneralizationSetGeneralizationSetIsCoveringIsDisjoint_5016Parser();
		case GeneralizationSetNameEditPart.VISUAL_ID:
			return getGeneralizationSetGeneralizationSetName_5017Parser();
		case InterfaceName2EditPart.VISUAL_ID:
			return getInterfaceInterfaceName_5018Parser();
		case DependencyName2EditPart.VISUAL_ID:
			return getDependencyDependencyName_6001Parser();
		case DependencyName3EditPart.VISUAL_ID:
			return getDependencyDependencyName_6010Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyPropertyName_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationAssociationName_6003Parser();
		case AssociationName2EditPart.VISUAL_ID:
			return getAssociationAssociationName_6004Parser();
		case AssociationName3EditPart.VISUAL_ID:
			return getAssociationAssociationName_6005Parser();
		case AssociationName4EditPart.VISUAL_ID:
			return getAssociationAssociationName_6006Parser();
		case AssociationName5EditPart.VISUAL_ID:
			return getAssociationAssociationName_6007Parser();
		case AssociationName6EditPart.VISUAL_ID:
			return getAssociationAssociationName_6008Parser();
		case AssociationName7EditPart.VISUAL_ID:
			return getAssociationAssociationName_6009Parser();
		case RealizationNameEditPart.VISUAL_ID:
			return getRealizationRealizationName_6011Parser();
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
}
