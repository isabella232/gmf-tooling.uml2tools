package org.eclipse.uml2.diagram.common.parser;

import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;
import org.eclipse.uml2.diagram.parser.MultiplicityViewOption;


public final class MultiplicityViewOptionConverter {

	public static MultiplicityViewOption parsePreferenceValue(String preferenceValue) {
		if (preferenceValue.equals(UMLPreferencesConstants.SHOW_NO_MULTIPLICITY)) {
			return MultiplicityViewOption.NO_MULTIPLICITY;
		}
		if (preferenceValue.equals(UMLPreferencesConstants.SHOW_NO_DEFAULT_MULTIPLICITY)) {
			return MultiplicityViewOption.NO_DEFAULT_MULTIPLICITY;
		}
		if (preferenceValue.equals(UMLPreferencesConstants.SHOW_ALL_MULTIPLICITY)) {
			return MultiplicityViewOption.ALL;
		}
		return MultiplicityViewOption.NO_DEFAULT_MULTIPLICITY;
	}
}
