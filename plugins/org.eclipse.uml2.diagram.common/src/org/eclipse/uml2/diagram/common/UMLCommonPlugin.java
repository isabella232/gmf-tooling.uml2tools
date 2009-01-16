/**
 * 
 */
package org.eclipse.uml2.diagram.common;

import org.eclipse.ui.plugin.AbstractUIPlugin;


/**
 * @author tfesenko
 *
 */
public class UMLCommonPlugin extends AbstractUIPlugin {

	private static UMLCommonPlugin plugin;

	/**
	 * The constructor.
	 */
	public UMLCommonPlugin() {
		super();
		plugin = this;
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the plugin instance
	 */
	public static UMLCommonPlugin getInstance() {
		return plugin;
	}

	/**
	 * Retrieves the unique identifier of this plug-in.
	 *
	 * @return A non-empty string which is unique within the plug-in registry.
	 */
	public static String getPluginId() {
		return getInstance().getBundle().getSymbolicName();
	}

}
