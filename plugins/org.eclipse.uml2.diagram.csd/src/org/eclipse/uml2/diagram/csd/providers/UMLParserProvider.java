package org.eclipse.uml2.diagram.csd.providers;

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
import org.eclipse.uml2.diagram.common.parser.imports.ElementImportParser;
import org.eclipse.uml2.diagram.common.parser.property.PropertyParser;
import org.eclipse.uml2.diagram.common.parser.property.PropertyToString;
import org.eclipse.uml2.diagram.compositestructures.parser.collaborationuse.CollaborationUseParser;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassQualifiedNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUseName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.csd.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.csd.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.lookup.DefaultOclLookups;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuiteImpl;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @NOT-generated
	 */
	public static final OCLLookup<Type> TYPE_LOOKUP = new OCLLookup<Type>(//
			UMLOCLFactory.getOCLLookupExpression(DefaultOclLookups.DEFAULT_TYPE_LOOKUP, UMLPackage.eINSTANCE.getNamedElement()), // 
			new IElementType[] { //
			});

	/**
	 * @generated
	 */
	private IParser collaborationName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCollaborationName_5009Parser() {
		if (collaborationName_5009Parser == null) {
			collaborationName_5009Parser = createCollaborationName_5009Parser();
		}
		return collaborationName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCollaborationName_5009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5013Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5013Parser() {
		if (className_5013Parser == null) {
			className_5013Parser = createClassName_5013Parser();
		}
		return className_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5013Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classQualifiedName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getClassQualifiedName_5014Parser() {
		if (classQualifiedName_5014Parser == null) {
			classQualifiedName_5014Parser = createClassQualifiedName_5014Parser();
		}
		return classQualifiedName_5014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassQualifiedName_5014Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_QualifiedName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5006Parser() {
		if (packageName_5006Parser == null) {
			packageName_5006Parser = createPackageName_5006Parser();
		}
		return packageName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5018Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5018Parser() {
		if (className_5018Parser == null) {
			className_5018Parser = createClassName_5018Parser();
		}
		return className_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5018Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser collaborationUseName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCollaborationUseName_5002Parser() {
		if (collaborationUseName_5002Parser == null) {
			collaborationUseName_5002Parser = createCollaborationUseName_5002Parser();
		}
		return collaborationUseName_5002Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCollaborationUseName_5002Parser() {
		return new CollaborationUseParser();
	}

	/**
	 * @generated
	 */
	private IParser propertyName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_5011Parser() {
		if (propertyName_5011Parser == null) {
			propertyName_5011Parser = createPropertyName_5011Parser();
		}
		return propertyName_5011Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createPropertyName_5011Parser() {
		return createPropertyParser();
	}

	/**
	 * @NOT-generated
	 */
	private IParser createPropertyParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);
		return new SemanticParserAdapter(new PropertyParser(lookupSuite), new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser parameterName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getParameterName_5016Parser() {
		if (parameterName_5016Parser == null) {
			parameterName_5016Parser = createParameterName_5016Parser();
		}
		return parameterName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createParameterName_5016Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3008Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3008Parser() {
		if (property_3008Parser == null) {
			property_3008Parser = createProperty_3008Parser();
		}
		return property_3008Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3008Parser() {
		return createPropertyParser();
	}

	/**
	 * @generated
	 */
	private IParser operation_3009Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_3009Parser() {
		if (operation_3009Parser == null) {
			operation_3009Parser = createOperation_3009Parser();
		}
		return operation_3009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_3009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getPortName_5012Parser() {
		if (portName_5012Parser == null) {
			portName_5012Parser = createPortName_5012Parser();
		}
		return portName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPortName_5012Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser elementImport_3004Parser;

	/**
	 * @generated
	 */
	private IParser getElementImport_3004Parser() {
		if (elementImport_3004Parser == null) {
			elementImport_3004Parser = createElementImport_3004Parser();
		}
		return elementImport_3004Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createElementImport_3004Parser() {
		return new ElementImportParser();
	}

	/**
	 * @generated
	 */
	private IParser propertyName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_5017Parser() {
		if (propertyName_5017Parser == null) {
			propertyName_5017Parser = createPropertyName_5017Parser();
		}
		return propertyName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyName_5017Parser() {
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
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollaborationNameEditPart.VISUAL_ID:
			return getCollaborationName_5009Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5013Parser();
		case ClassQualifiedNameEditPart.VISUAL_ID:
			return getClassQualifiedName_5014Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5006Parser();
		case ClassName2EditPart.VISUAL_ID:
			return getClassName_5018Parser();
		case CollaborationUseName2EditPart.VISUAL_ID:
			return getCollaborationUseName_5002Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyName_5011Parser();
		case ParameterNameEditPart.VISUAL_ID:
			return getParameterName_5016Parser();
		case Property2EditPart.VISUAL_ID:
			return getProperty_3008Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperation_3009Parser();
		case PortNameEditPart.VISUAL_ID:
			return getPortName_5012Parser();
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3004Parser();
		case PropertyName2EditPart.VISUAL_ID:
			return getPropertyName_5017Parser();
		case DependencyNameEditPart.VISUAL_ID:
			return getDependencyName_6001Parser();
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

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
