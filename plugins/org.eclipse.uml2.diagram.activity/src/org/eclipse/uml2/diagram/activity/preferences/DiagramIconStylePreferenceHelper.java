package org.eclipse.uml2.diagram.activity.preferences;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPostcondition_LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPrecondition_LiteralStringEditPart;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;

/**
 * @generated
 */

public class DiagramIconStylePreferenceHelper {

	/**
	 * @generated
	 */
	public static boolean shouldShowIcon(int visualId, boolean hasStereotype, PreferencesHint hint) {
		return shouldShowIcon(visualId, hint);
	}

	public static boolean shouldShowIcon(int visualId, PreferencesHint hint) {
		boolean preferencesValue = getPreferencesValueFor(visualId, hint);
		return preferencesValue;
	}

	/**
	 * @generated
	 */
	private static boolean getPreferencesValueFor(int visualId, PreferencesHint hint) {
		IPreferenceStore store = (IPreferenceStore) hint.getPreferenceStore();
		String mode = store.getString(UMLPreferencesConstants.PREF_ICONS_SHOW_HIDE_MODE);
		if (UMLPreferencesConstants.VALUE_ICONS_SHOW_ALL.equals(mode)) {
			return true;
		}
		if (UMLPreferencesConstants.VALUE_ICONS_HIDE_ALL.equals(mode)) {
			return false;
		}
		if (UMLPreferencesConstants.VALUE_ICONS_SHOW_SELECTED_VISUAL_IDS.equals(mode)) {
			switch (visualId) {
			case LocalPrecondition_LiteralStringEditPart.VISUAL_ID:
			case LocalPostcondition_LiteralStringEditPart.VISUAL_ID:
				return store.getBoolean(UMLPreferencesConstants.PREF_ICONS_SHOW_VISUAL_ID_PREFIX + ".3049.3051");
			default:
				return false;
			}
		}
		return false;
	}

}
