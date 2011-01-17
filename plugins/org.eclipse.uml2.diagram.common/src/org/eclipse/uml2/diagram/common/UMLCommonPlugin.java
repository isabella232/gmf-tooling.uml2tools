/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.diagram.common.providers.AlternativeUMLItemProviderAdapterFactory;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.osgi.framework.BundleContext;

public class UMLCommonPlugin extends AbstractUIPlugin {

	public static final String IMAGE_PLUS = "icons/plus.gif"; //$NON-NLS-1$

	public static final String IMAGE_MINUS = "icons/minus.gif"; //$NON-NLS-1$

	private static UMLCommonPlugin plugin;

	private ComposedAdapterFactory adapterFactory;

	/**
	 * The constructor.
	 */
	public UMLCommonPlugin() {
		super();
		plugin = this;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		adapterFactory = createAdapterFactory();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		super.stop(context);
	}

	private ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	private void fillItemProviderFactories(List factories) {
		//custom icons for diagram elements
		factories.add(new AlternativeUMLItemProviderAdapterFactory(getPreferenceStore()));

		factories.add(new UMLItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
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

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);

		addImage(reg, IMAGE_PLUS);
		addImage(reg, IMAGE_MINUS);
	}

	private void addImage(ImageRegistry registry, String pluginPath) {
		registry.put(pluginPath, ImageDescriptor.createFromURL(FileLocator.find(getBundle(), new Path(pluginPath), null)));
	}
}
