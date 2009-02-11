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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
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
	private static final ExtendedImageRegistry myExtendedImageRegistry = ExtendedImageRegistry.INSTANCE;

	public static ImageDescriptor getImageDescriptorForStereotypeApplication(EObject stereotypeApplication) {
		return getImageDescriptorForStereotypeApplication(stereotypeApplication, null);
	}

	public static ImageDescriptor getImageDescriptor(Stereotype stereotype) {
		return getImageDescriptorForStereotype(stereotype, null);
	}

	public static ImageDescriptor getImageDescriptorForStereotypeApplication(EObject stereotypeApplication, ImageDescriptor metaclassImage) {
		Stereotype stereo = UMLUtil.getStereotype(stereotypeApplication);
		if (stereo == null) {
			return null;
		}
		String key = getImageRegistryKey(stereotypeApplication);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(stereo, metaclassImage);
			if (imageDescriptor == null) {
				return null;
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	public static ImageDescriptor getImageDescriptorForStereotype(Stereotype stereo, ImageDescriptor metaclassImage) {
		String key = getImageRegistryKey(stereo);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(stereo, metaclassImage);
			if (imageDescriptor == null) {
				return null;
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	private static ImageDescriptor getProvidedImageDescriptor(Stereotype appliedStereotype, ImageDescriptor metaclassImage) {
		Resource eResource = appliedStereotype.eResource();
		if (eResource == null || eResource.getResourceSet() == null) {
			return null;
		}
		for (Image icon : appliedStereotype.getIcons()) {
			URIConverter uriConverter = eResource.getResourceSet().getURIConverter();
			URI normalizedURI = uriConverter.normalize(eResource.getURI());
			String location = icon.getLocation();
			ImageDescriptor imgDescriptor = getProvidedImageDescriptor(location, uriConverter, normalizedURI);
			if (imgDescriptor != null) {
				if (metaclassImage != null && location.indexOf("ovr16") != -1) {
					return overlay(metaclassImage, imgDescriptor);
				}
				return imgDescriptor;
			}
		}
		return null;
	}

	private static ImageDescriptor getProvidedImageDescriptor(String location, URIConverter uriConverter, URI normalizedURI) {
		if (!UML2Util.isEmpty(location)) {
			URI uri = URI.createURI(location).resolve(normalizedURI);
			try {
				URL url = new URL(uriConverter.normalize(uri).toString());
				url.openStream().close();
				return ImageDescriptor.createFromURL(url);
			} catch (Exception e) {
				return CORRUPTED_ICON;
			}
		}
		return null;
	}
	
	private static ImageDescriptor overlay(ImageDescriptor metaclassImage, ImageDescriptor stereoImage) {
		List<ImageDescriptor> images = new ArrayList<ImageDescriptor>(2);
		images.add(metaclassImage);
		images.add(stereoImage);
		ComposedImage ci = new ComposedImage(images);
		return myExtendedImageRegistry.getImageDescriptor(ci);
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