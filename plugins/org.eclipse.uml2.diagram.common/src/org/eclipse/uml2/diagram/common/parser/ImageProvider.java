package org.eclipse.uml2.diagram.common.parser;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.swt.graphics.Image;

public interface ImageProvider {
	Image getImage(ENamedElement element);
}
