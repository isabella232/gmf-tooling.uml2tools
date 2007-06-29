package org.eclipse.uml2.diagram.common.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.diagram.common.Messages;


public abstract class IconStylePreferencePage extends AbstractPreferencePage {
    /**
	 * @NOT-generated
     */
    protected void addFields(Composite parent) {	  	
		Composite main = new Composite(parent, SWT.NULL);
		main.setLayout(new GridLayout());
		main.setLayoutData(
			new GridData(
				GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
		createIconStyleGroup(main);
    }
    
    /**
	 * @NOT-generated
     */
    protected void createIconStyleGroup(Composite parent) {
    	String[][] choices= new String[][]{{ALTERNATIVE_STYLE_ICON_LABEL, UmlPreferenceConstants.PREF_ICON_STYLE_CHEERFUL},{ECLIPSE_STYLE_ICON_LABEL, UmlPreferenceConstants.PREF_ICON_STYLE_STANDARD}};
    	myIconStyleFieldEditor = new RadioGroupFieldEditor(UmlPreferenceConstants.PREF_ICON_STYLE, ICONSTYLE_GROUPBOX_LABEL, 1, choices, parent, true);
    	addField(myIconStyleFieldEditor);
    }
    
    /**
	 * @NOT-generated
     */
    public static void initDefaults(IPreferenceStore store) {
    	AppearancePreferencePage.initDefaults(store);
    	store.setDefault(UmlPreferenceConstants.PREF_ICON_STYLE, UmlPreferenceConstants.PREF_ICON_STYLE_STANDARD);
    }

    private static final String ICONSTYLE_GROUPBOX_LABEL = Messages.IconStylePreferencePage_icon_style_group;
	private static final String ALTERNATIVE_STYLE_ICON_LABEL = Messages.IconStylePreferencePage_cheerful_style;
	private static final String ECLIPSE_STYLE_ICON_LABEL = Messages.IconStylePreferencePage_eclipse_style;
    private RadioGroupFieldEditor myIconStyleFieldEditor;

}
