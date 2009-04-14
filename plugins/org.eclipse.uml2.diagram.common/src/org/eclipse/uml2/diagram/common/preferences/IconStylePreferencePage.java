package org.eclipse.uml2.diagram.common.preferences;

import org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
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
	
	@Override
	protected Composite getFieldEditorParent() {
		Composite parent = super.getFieldEditorParent();
		ScrolledComposite s = createScrolledComposite(parent);
		Composite sbody = createComposite(s);
		s.setContent(sbody);
		return sbody;
	}

	/*
	 * Creates ExpandableComposite as it was done in
	 * <code>PDECompilersConfigurationBlock</code>
	 */
	protected Composite createExpansibleComposite(Composite parent, String title) {
		ExpandableComposite ecomp = new ExpandableComposite(parent, SWT.NONE, ExpandableComposite.TWISTIE | ExpandableComposite.CLIENT_INDENT);
		ecomp.setText(title);
		// ecomp.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT));
		ecomp.setLayoutData(new GridData());
		ecomp.addExpansionListener(new ExpansionAdapter() {

			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				Object obj = e.getSource();
				handleExpand(getScrollingParent(obj));
			}
		});
		// ecomp.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DIALOG_FONT));
		Composite client = createComposite(ecomp);
		ecomp.setClient(client);
		return client;
	}

	protected static Composite createComposite(Composite parent) {
		Composite g = new Composite(parent, SWT.NONE);
		g.setLayout(new GridLayout());
		g.setFont(parent.getFont());
		g.setLayoutData(new GridData(GridData.FILL_BOTH));
		return g;
	}

	private ScrolledComposite getScrollingParent(Object obj) {
		if (obj instanceof ExpandableComposite) {
			ExpandableComposite ecomp = (ExpandableComposite) obj;
			Composite parent = ecomp.getParent();
			while (parent != null && !(parent instanceof ScrolledComposite)) {
				parent = parent.getParent();
			}
			if (parent != null) {
				return (ScrolledComposite) parent;
			}
		}
		if (obj instanceof ScrolledComposite) {
			return (ScrolledComposite) obj;
		}
		return null;
	}

	private void handleExpand(ScrolledComposite composite) {
		if (composite == null) {
			return;
		}
		try {
			composite.setRedraw(false);
			Composite c = (Composite) composite.getContent();
			if (c == null) {
				return;
			}
			Point newSize = c.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			composite.setMinSize(newSize);
			c.layout(true);
		} finally {
			composite.setRedraw(true);
		}
	}
	
	private ScrolledComposite createScrolledComposite(Composite parent) {
		ScrolledComposite scomp = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		scomp.setExpandHorizontal(true);
		scomp.setExpandVertical(true);
		scomp.setLayout(new GridLayout());
		scomp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		scomp.addListener(SWT.Resize, new Listener() {
			public void handleEvent(Event event) {
				handleExpand(getScrollingParent(event.widget));
			}
		});
		return scomp;
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
