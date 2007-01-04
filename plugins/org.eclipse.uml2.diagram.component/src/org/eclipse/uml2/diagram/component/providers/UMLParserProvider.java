package org.eclipse.uml2.diagram.component.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
import org.eclipse.uml2.diagram.component.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.parser.lookup.DefaultOclLookups;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
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
			 UMLElementTypes.Class_2004, // 
			 */
			});

	/**
	 * @generated
	 */
	private IParser componentComponentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getComponentComponentName_5002Parser() {
		if (componentComponentName_5002Parser == null) {
			componentComponentName_5002Parser = createComponentComponentName_5002Parser();
		}
		return componentComponentName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentComponentName_5002Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portPortName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPortPortName_5003Parser() {
		if (portPortName_5003Parser == null) {
			portPortName_5003Parser = createPortPortName_5003Parser();
		}
		return portPortName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPortPortName_5003Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactArtifactName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactArtifactName_5006Parser() {
		if (artifactArtifactName_5006Parser == null) {
			artifactArtifactName_5006Parser = createArtifactArtifactName_5006Parser();
		}
		return artifactArtifactName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactArtifactName_5006Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classClassName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getClassClassName_5007Parser() {
		if (classClassName_5007Parser == null) {
			classClassName_5007Parser = createClassClassName_5007Parser();
		}
		return classClassName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClassName_5007Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceInterfaceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceInterfaceName_5009Parser() {
		if (interfaceInterfaceName_5009Parser == null) {
			interfaceInterfaceName_5009Parser = createInterfaceInterfaceName_5009Parser();
		}
		return interfaceInterfaceName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceInterfaceName_5009Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser componentComponentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentComponentName_5001Parser() {
		if (componentComponentName_5001Parser == null) {
			componentComponentName_5001Parser = createComponentComponentName_5001Parser();
		}
		return componentComponentName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createComponentComponentName_5001Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactArtifactName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactArtifactName_5004Parser() {
		if (artifactArtifactName_5004Parser == null) {
			artifactArtifactName_5004Parser = createArtifactArtifactName_5004Parser();
		}
		return artifactArtifactName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactArtifactName_5004Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceInterfaceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceInterfaceName_5005Parser() {
		if (interfaceInterfaceName_5005Parser == null) {
			interfaceInterfaceName_5005Parser = createInterfaceInterfaceName_5005Parser();
		}
		return interfaceInterfaceName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceInterfaceName_5005Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser classClassName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getClassClassName_5008Parser() {
		if (classClassName_5008Parser == null) {
			classClassName_5008Parser = createClassClassName_5008Parser();
		}
		return classClassName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassClassName_5008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentComponentName_5002Parser();
		case PortNameEditPart.VISUAL_ID:
			return getPortPortName_5003Parser();
		case ArtifactNameEditPart.VISUAL_ID:
			return getArtifactArtifactName_5006Parser();
		case ClassNameEditPart.VISUAL_ID:
			return getClassClassName_5007Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceInterfaceName_5009Parser();
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentComponentName_5001Parser();
		case ArtifactName2EditPart.VISUAL_ID:
			return getArtifactArtifactName_5004Parser();
		case InterfaceName2EditPart.VISUAL_ID:
			return getInterfaceInterfaceName_5005Parser();
		case ClassName2EditPart.VISUAL_ID:
			return getClassClassName_5008Parser();
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
