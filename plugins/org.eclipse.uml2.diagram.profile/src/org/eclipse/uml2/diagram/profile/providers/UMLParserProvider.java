package org.eclipse.uml2.diagram.profile.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileName2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeNameEditPart;

import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser constraintConstraint_3008Parser;

	/**
	 * @generated
	 */
	private IParser getConstraintConstraint_3008Parser() {
		if (constraintConstraint_3008Parser == null) {
			constraintConstraint_3008Parser = createConstraintConstraint_3008Parser();
		}
		return constraintConstraint_3008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConstraintConstraint_3008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stereotypeStereotype_3003Parser;

	/**
	 * @generated
	 */
	private IParser getStereotypeStereotype_3003Parser() {
		if (stereotypeStereotype_3003Parser == null) {
			stereotypeStereotype_3003Parser = createStereotypeStereotype_3003Parser();
		}
		return stereotypeStereotype_3003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStereotypeStereotype_3003Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser enumerationLiteralEnumerationLiteral_3005Parser;

	/**
	 * @generated
	 */
	private IParser getEnumerationLiteralEnumerationLiteral_3005Parser() {
		if (enumerationLiteralEnumerationLiteral_3005Parser == null) {
			enumerationLiteralEnumerationLiteral_3005Parser = createEnumerationLiteralEnumerationLiteral_3005Parser();
		}
		return enumerationLiteralEnumerationLiteral_3005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createEnumerationLiteralEnumerationLiteral_3005Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stereotypeStereotypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStereotypeStereotypeName_5001Parser() {
		if (stereotypeStereotypeName_5001Parser == null) {
			stereotypeStereotypeName_5001Parser = createStereotypeStereotypeName_5001Parser();
		}
		return stereotypeStereotypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStereotypeStereotypeName_5001Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser profileProfileName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProfileProfileName_5004Parser() {
		if (profileProfileName_5004Parser == null) {
			profileProfileName_5004Parser = createProfileProfileName_5004Parser();
		}
		return profileProfileName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProfileProfileName_5004Parser() {
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
	private IParser profileProfileName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getProfileProfileName_5009Parser() {
		if (profileProfileName_5009Parser == null) {
			profileProfileName_5009Parser = createProfileProfileName_5009Parser();
		}
		return profileProfileName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createProfileProfileName_5009Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConstraintEditPart.VISUAL_ID:
			return getConstraintConstraint_3008Parser();
		case Stereotype2EditPart.VISUAL_ID:
			return getStereotypeStereotype_3003Parser();
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteralEnumerationLiteral_3005Parser();
		case StereotypeNameEditPart.VISUAL_ID:
			return getStereotypeStereotypeName_5001Parser();
		case ProfileNameEditPart.VISUAL_ID:
			return getProfileProfileName_5004Parser();
		case EnumerationNameEditPart.VISUAL_ID:
			return getEnumerationEnumerationName_5005Parser();
		case ProfileName2EditPart.VISUAL_ID:
			return getProfileProfileName_5009Parser();
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
