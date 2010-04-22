
package org.eclipse.uml2.diagram.common.links;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;


public interface ILinkDetector {
	boolean isProvidedInterfaceLink(IUpdaterLinkDescriptor link);
	boolean isInterfaceRealizationLink(IUpdaterLinkDescriptor link);
	boolean isRequiredInterfaceLink(IUpdaterLinkDescriptor link); 
	boolean isUsageLink(IUpdaterLinkDescriptor link);
}
