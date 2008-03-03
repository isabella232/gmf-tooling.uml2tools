package org.eclipse.uml2.diagram.clazz.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.CheckBoxFieldEditor;
import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @NOT-generated
	 */
	private static final String REQUIRED_INTERFACE_LINKS_GROUP_LABEL = "Manage Required Interface Links";

	/**
	 * @NOT-generated
	 */
	private static final String HIDE_DERIVED_LABEL = "Hide Derived Links";
	
	/**
	 * @NOT-generated
	 */
	private static final String HIDE_GENUINE_LABEL = "Hide Genuine Links";
	
	/**
	 * @NOT-generated
	 */
	private CheckBoxFieldEditor myManageRequireds_hideDeriveds;

	/**
	 * @NOT-generated
	 */
	private CheckBoxFieldEditor myManageRequireds_hideGenuine;

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(UMLDiagramEditorPlugin.getInstance().getPreferenceStore());
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	protected void addFieldEditors(Composite composite) {
		super.addFieldEditors(composite);
		createManageRequiredLinksGroup(composite);
	}
	
	/**
	 * @generated NOT
	 */
	private Composite createManageRequiredLinksGroup(Composite parent) {    	
    	Group group = new Group(parent, SWT.NONE);
    	group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    	group.setLayout(new GridLayout(3, false));
    	Composite composite = new Composite(group, SWT.NONE);
    	GridLayout gridLayout = new GridLayout(3, false);
    	composite.setLayout(gridLayout);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalSpan = 3;
		composite.setLayoutData(gridData);
		group.setText(REQUIRED_INTERFACE_LINKS_GROUP_LABEL);
    	
 		addManageRequiredLinksFields(composite);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 8;
		composite.setLayout(layout);               
    	
		return group;
	}

	/**
	 * @NOT-generated
	 */
	protected void addManageRequiredLinksFields(Composite composite) {
		myManageRequireds_hideDeriveds = new CheckBoxFieldEditor(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_DERIVED, HIDE_DERIVED_LABEL, composite);
		addField(myManageRequireds_hideDeriveds);
		myManageRequireds_hideGenuine = new CheckBoxFieldEditor(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_GENUINE, HIDE_GENUINE_LABEL, composite);
		addField(myManageRequireds_hideGenuine);
	}

	/**
	 * @NOT-generated
	 */
	public static void initDefaults(IPreferenceStore store) {
		ConnectionsPreferencePage.initDefaults(store);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_DERIVED, false);
		store.setDefault(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_GENUINE, false);
	}
}
