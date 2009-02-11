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
package org.eclipse.uml2.diagram.common.stereo;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

public class StereotypeImages {

	private static final ImageDescriptor CORRUPTED_ICON = PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_WARN_TSK);

	private static ImageRegistry imageRegistry;

	public static ImageDescriptor getImageDescriptor(EObject stereotypeApplication) {
		Stereotype stereo = UMLUtil.getStereotype(stereotypeApplication);
		if (stereo == null) {
			return null;
		}
		String key = getImageRegistryKey(stereotypeApplication);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(stereo);
			if (imageDescriptor == null) {
				return null;
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	private static ImageDescriptor getProvidedImageDescriptor(Stereotype appliedStereotype) {
		Resource eResource = appliedStereotype.eResource();
		if (eResource == null || eResource.getResourceSet() == null) {
			return null;
		}
		for (Image icon : appliedStereotype.getIcons()) {
			String location = icon.getLocation();
			if (!UML2Util.isEmpty(location)) {
				URIConverter uriConverter = eResource.getResourceSet().getURIConverter();
				URI normalizedURI = uriConverter.normalize(eResource.getURI());
				URI uri = URI.createURI(location).resolve(normalizedURI);
				try {
					URL url = new URL(uriConverter.normalize(uri).toString());
					url.openStream().close();
					return ImageDescriptor.createFromURL(url);
				} catch (Exception e) {
					return CORRUPTED_ICON;
				}
			}
		}
		return null;
	}

	private static String getImageRegistryKey(EObject stereotypeApplication) {
		return EcoreUtil.getURI(stereotypeApplication).toString();
	}

	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

}