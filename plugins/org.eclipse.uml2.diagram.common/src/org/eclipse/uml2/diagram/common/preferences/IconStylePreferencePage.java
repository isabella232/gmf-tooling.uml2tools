package org.eclipse.uml2.diagram.common.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.diagram.common.Messages;

public abstract class IconStylePreferencePage extends AbstractPreferencePage {

	@Override
	protected void addFields(Composite parent) {
		Composite main = new Composite(parent, SWT.NULL);
		main.setLayout(new GridLayout());
		main.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		createIconStyleGroup(main);
	}

	protected void createIconStyleGroup(Composite parent) {
		String[][] choices = new String[][] { //
		//
				{ ALTERNATIVE_STYLE_ICON_LABEL, UMLPreferencesConstants.PREF_ICON_STYLE_CHEERFUL }, //
				{ ECLIPSE_STYLE_ICON_LABEL, UMLPreferencesConstants.PREF_ICON_STYLE_STANDARD } };
		myIconStyleFieldEditor = new RadioGroupFieldEditor(UMLPreferencesConstants.PREF_ICON_STYLE, ICONSTYLE_GROUPBOX_LABEL, 1, choices, parent, true);
		addField(myIconStyleFieldEditor);
	}

	public static void initDefaults(IPreferenceStore store) {
		store.setDefault(UMLPreferencesConstants.PREF_ICON_STYLE, UMLPreferencesConstants.PREF_ICON_STYLE_STANDARD);
		store.setDefault(UMLPreferencesConstants.PREF_ICONS_SHOW_HIDE_MODE, UMLPreferencesConstants.VALUE_ICONS_SHOW_ALL);
	}

	private static final String ICONSTYLE_GROUPBOX_LABEL = Messages.IconStylePreferencePage_icon_style_group;

	private static final String ALTERNATIVE_STYLE_ICON_LABEL = Messages.IconStylePreferencePage_cheerful_style;

	private static final String ECLIPSE_STYLE_ICON_LABEL = Messages.IconStylePreferencePage_eclipse_style;

	protected static final String LABEL_SHOW_HIDE_MODE = "Show/Hide Icons";

	protected static final String LABEL_HIDE_ALL = "Hide All";

	protected static final String LABEL_SHOW_ALL = "Show All";

	protected static final String LABEL_SHOW_BY_VISUAL_ID = "Show For Selected Elements Only";

	private RadioGroupFieldEditor myIconStyleFieldEditor;

}
