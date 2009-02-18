package org.eclipse.uml2.diagram.common.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.common.UMLCommonPlugin;
import org.osgi.framework.Bundle;

public class ImageUtils {

	private static final Bundle UML_BUNDLE = UMLCommonPlugin.getInstance().getBundle();

	private static final String IMG_SYNC_DIAGRAM = "icons/ovr16/SyncDiagram.gif";

	public static ImageDescriptor overlay(ImageDescriptor original, ImageDescriptor overlay) {
		List<ImageDescriptor> images = new ArrayList<ImageDescriptor>(2);
		images.add(original);
		images.add(overlay);
		ComposedImage ci = new ComposedImage(images);
		return ExtendedImageRegistry.INSTANCE.getImageDescriptor(ci);
	}

	public static Image getPackageImage(Image original, boolean isSync) {
		if (!isSync) {
			return original;
		}
		return getOverlayedImage(original, getSyncPackageImage());
	}

	public static ImageDescriptor getSyncPackageImage() {
		String imgRegistryKey = "SyncDiagram";
		ImageDescriptor imageDescriptor = UMLCommonPlugin.getInstance().getImageRegistry().getDescriptor(imgRegistryKey);
		if (imageDescriptor == null) {
			imageDescriptor = ImageDescriptor.createFromURL(FileLocator.find(UML_BUNDLE, new Path(IMG_SYNC_DIAGRAM), null));
			if (imageDescriptor == null) {
				return null;
			}
			UMLCommonPlugin.getInstance().getImageRegistry().put(imgRegistryKey, imageDescriptor);
		}
		return imageDescriptor;
	}

	private static Image getOverlayedImage(Object original, Object overlay) {
		List<Object> images = new ArrayList<Object>(2);
		images.add(original);
		images.add(overlay);
		ComposedImage ci = new ComposedImage(images);
		return ExtendedImageRegistry.INSTANCE.getImage(ci);
	}

}
