package org.eclipse.uml2.diagram.common.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.diagram.common.Messages;
import org.eclipse.uml2.diagram.common.UMLCommonPlugin;

public class MainPreferencePage extends AbstractPreferencePage {

	public MainPreferencePage() {
		setPreferenceStore(UMLCommonPlugin.getInstance().getPreferenceStore());
		getPreferenceStore().setDefault(UMLPreferencesConstants.SHOW_MULTIPLICITY_OPTIONS, UMLPreferencesConstants.SHOW_NO_DEFAULT_MULTIPLICITY);
	}

	@Override
	protected void addFields(Composite parent) {
		myShowMultiplicityOptions = new RadioGroupFieldEditor(UMLPreferencesConstants.SHOW_MULTIPLICITY_OPTIONS, Messages.MainPreferencePage_group_display_settings, 1, new String[][] {
				{ Messages.MainPreferencePage_show_no_multiplicity, UMLPreferencesConstants.SHOW_NO_MULTIPLICITY },
				{ Messages.MainPreferencePage_show_no_default_multiplicity, UMLPreferencesConstants.SHOW_NO_DEFAULT_MULTIPLICITY },
				{ Messages.MainPreferencePage_show_all_multiplicity, UMLPreferencesConstants.SHOW_ALL_MULTIPLICITY } }, parent, true);
		addField(myShowMultiplicityOptions);
	}

	@Override
	protected void initHelp() {
	}

	private RadioGroupFieldEditor myShowMultiplicityOptions = null;

	//	@Override
	//	protected void addFields(Composite parent) {
	//		
	//		
	//		
	//		
	//		Group associationDisplayGroup = new Group(parent, SWT.NONE);
	//		GridLayout gridLayout = new GridLayout(2, false);
	//		associationDisplayGroup.setLayout(gridLayout);
	//		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
	//		gridData.grabExcessHorizontalSpace = true;
	//		gridData.horizontalSpan = 2;
	//		associationDisplayGroup.setLayoutData(gridData);
	//		associationDisplayGroup.setText(Messages.MainPreferencePage_group_display_settings);
	//
	//		associationDisplayComposite = new Composite(associationDisplayGroup, SWT.NONE);
	//
	//		myAssociationMultiplicityDisplayOption = new BooleanFieldEditor(UMLPreferencesConstants.SHOW_DEFAULT_MULTIPLICITY, Messages.MainPreferencePage_show_default_multiplicity,
	//				associationDisplayComposite);
	//
	//		addField(myAssociationMultiplicityDisplayOption);
	//	}
	//
	//	@Override
	//	protected void initHelp() {
	//	}
	//
	//	private BooleanFieldEditor myAssociationMultiplicityDisplayOption = null;
	//
	//	private Composite associationDisplayComposite = null;
}
