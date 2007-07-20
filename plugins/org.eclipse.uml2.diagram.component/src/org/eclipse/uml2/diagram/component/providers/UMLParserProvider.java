package org.eclipse.uml2.diagram.component.providers;

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
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.component.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.component.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.parser.lookup.DefaultOclLookups;
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
	private IParser componentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5001Parser() {
		if (componentName_5001Parser == null) {
			componentName_5001Parser = createComponentName_5001Parser();
		}
		return componentName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentName_5001Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactName_5004Parser() {
		if (artifactName_5004Parser == null) {
			artifactName_5004Parser = createArtifactName_5004Parser();
		}
		return artifactName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactName_5004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5005Parser() {
		if (interfaceName_5005Parser == null) {
			interfaceName_5005Parser = createInterfaceName_5005Parser();
		}
		return interfaceName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5005Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5008Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5008Parser() {
		if (className_5008Parser == null) {
			className_5008Parser = createClassName_5008Parser();
		}
		return className_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5008Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5002Parser() {
		if (componentName_5002Parser == null) {
			componentName_5002Parser = createComponentName_5002Parser();
		}
		return componentName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentName_5002Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPortName_5003Parser() {
		if (portName_5003Parser == null) {
			portName_5003Parser = createPortName_5003Parser();
		}
		return portName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPortName_5003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactName_5006Parser() {
		if (artifactName_5006Parser == null) {
			artifactName_5006Parser = createArtifactName_5006Parser();
		}
		return artifactName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactName_5006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5007Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5007Parser() {
		if (className_5007Parser == null) {
			className_5007Parser = createClassName_5007Parser();
		}
		return className_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5007Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5009Parser() {
		if (interfaceName_5009Parser == null) {
			interfaceName_5009Parser = createInterfaceName_5009Parser();
		}
		return interfaceName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_5010Parser() {
		if (propertyName_5010Parser == null) {
			propertyName_5010Parser = createPropertyName_5010Parser();
		}
		return propertyName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPropertyName_5010Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	public static final OCLLookup<Type> TYPE_LOOKUP = new OCLLookup<Type>(//
			UMLOCLFactory.getOCLLookupExpression(DefaultOclLookups.DEFAULT_TYPE_LOOKUP, UMLPackage.eINSTANCE.getNamedElement()), // 
			new IElementType[] { //
			/*
			 UMLElementTypes.Class_2004, // 
			 */
			});

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentName_5001Parser();
		case ArtifactName2EditPart.VISUAL_ID:
			return getArtifactName_5004Parser();
		case InterfaceName2EditPart.VISUAL_ID:
			return getInterfaceName_5005Parser();
		case ClassName2EditPart.VISUAL_ID:
			return getClassName_5008Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5002Parser();
		case PortNameEditPart.VISUAL_ID:
			return getPortName_5003Parser();
		case ArtifactNameEditPart.VISUAL_ID:
			return getArtifactName_5006Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5007Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_5009Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyName_5010Parser();
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
