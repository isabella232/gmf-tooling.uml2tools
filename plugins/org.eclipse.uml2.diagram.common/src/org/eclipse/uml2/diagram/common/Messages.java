package org.eclipse.uml2.diagram.common;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "messages"; //$NON-NLS-1$

	public static String ElementImportParser_undefined_value;

	public static String IconStylePreferencePage_cheerful_style;

	public static String IconStylePreferencePage_eclipse_style;

	public static String IconStylePreferencePage_icon_style_group;

	public static String RotateAction_rotate_command;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
