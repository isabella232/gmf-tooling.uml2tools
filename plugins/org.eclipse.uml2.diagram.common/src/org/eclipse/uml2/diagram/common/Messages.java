package org.eclipse.uml2.diagram.common;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "messages"; //$NON-NLS-1$

	public static String ElementImportParser_undefined_value;

	public static String IconStylePreferencePage_cheerful_style;

	public static String IconStylePreferencePage_eclipse_style;

	public static String IconStylePreferencePage_icon_style_group;

	public static String RotateAction_rotate_command;

	public static String ApplicableProfilesItemProvider_applied_profile_menu_title;

	public static String ApplicableProfilesItemProvider_apply_profile_menu;

	public static String ApplicableStereotypesItemProvider_apply_stereotype_menu_label;

	public static String ApplyProfileAction_apply_profile_command;

	public static String ApplyProfileAction_empty_name;

	public static String ApplyProfileAction_unapply_profile_command;

	public static String ApplyStereotypeAction_annapply_stereotype_command;

	public static String ApplyStereotypeAction_apply_stereotype_command;

	public static String ApplyStereotypeAction_empty_name;
	
	public static String EventParser_any_receive_event_denotation;
	
	public static String EventParser_time_event_absolute_denotation_prefix;
	
	public static String EventParser_time_event_relative_denotation_prefix;

	public static String EventParser_change_event_denotation_prefix;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
