/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtEditPlugin.java,v 1.1 2009/03/10 13:47:17 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.provider;

import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.eclipse.gmf.codegen.gmfgen.presentation.EditorPlugin;

import org.eclipse.gmf.gmfgraph.provider.GMFGraphEditPlugin;

import org.eclipse.gmf.mappings.provider.GMFMapEditPlugin;

import org.eclipse.gmf.tooldef.provider.GMFToolEditPlugin;

/**
 * This is the central singleton for the GMFGenExt edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GMFGenExtEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GMFGenExtEditPlugin INSTANCE = new GMFGenExtEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenExtEditPlugin() {
		super
		  (new ResourceLocator [] {
		     EcoreEditPlugin.INSTANCE,
		     GenModelEditPlugin.INSTANCE,
		     EditorPlugin.INSTANCE,
		     GMFGraphEditPlugin.INSTANCE,
		     GMFMapEditPlugin.INSTANCE,
		     GMFToolEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
