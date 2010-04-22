package org.eclipse.uml2.diagram.common.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.gmf.runtime.common.ui.preferences.CheckBoxFieldEditor;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.diagram.common.Messages;

public class ViewFiltersPreferencePage extends AbstractPreferencePage {

	private static final String HIDE_PROVIDED_INTERFACE_LINKS_LABEL = Messages.ViewFiltersPreferencePage_label_hide_provided_interface_links;

	private static final String HIDE_REQUIRED_INTERFACE_LINKS_LABEL = Messages.ViewFiltersPreferencePage_label_hide_required_interface_links;

	private static final String HIDE_INTERFACE_REALIZATION_LINKS_LABEL = Messages.ViewFiltersPreferencePage_label_hide_interface_realization_links;

	private static final String HIDE_USAGE_LINKS_LABEL = Messages.ViewFiltersPreferencePage_label_hide_usage_links;

	@Override
	protected void addFields(Composite parent) {
		Composite composite = createPageLayout(parent);

		createCheckBox(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_PROVIDED_INTERFACE_LINKS,//
				HIDE_PROVIDED_INTERFACE_LINKS_LABEL, composite);

		createCheckBox(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_REQUIRED_INTERFACE_LINKS,//
				HIDE_REQUIRED_INTERFACE_LINKS_LABEL, composite);

		createCheckBox(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_INTERFACE_REALIZATION_LINKS,//
				HIDE_INTERFACE_REALIZATION_LINKS_LABEL, composite);

		createCheckBox(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_USAGE_LINKS,//
				HIDE_USAGE_LINKS_LABEL, composite);
	}

	private void createCheckBox(String constant, String label, Composite composite) {
		CheckBoxFieldEditor hideLinksCheckBoxFieldEditor = new CheckBoxFieldEditor(constant, label, composite);
		addField(hideLinksCheckBoxFieldEditor);
	}

	@Override
	protected void initHelp() {
	}

	private Composite createPageLayout(Composite parent) {
		Composite main = new Composite(parent, SWT.NULL);
		main.setLayout(new GridLayout());
		main.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		return main;
	}

	public static void initDefaults(IPreferenceStore store) {
		ConnectionsPreferencePage.initDefaults(store);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_PROVIDED_INTERFACE_LINKS, false);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_REQUIRED_INTERFACE_LINKS, false);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_INTERFACE_REALIZATION_LINKS, false);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_USAGE_LINKS, false);
	}

}
