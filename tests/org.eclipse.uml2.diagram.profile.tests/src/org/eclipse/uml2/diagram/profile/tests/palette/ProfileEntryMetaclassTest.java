package org.eclipse.uml2.diagram.profile.tests.palette;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.uml2.diagram.common.tests.palette.EntryMetaclassTest;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;


public class ProfileEntryMetaclassTest extends EntryMetaclassTest{

	public ProfileEntryMetaclassTest(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		super(paletteRoot, groupIndex, type, entryIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ENamedElement getElement(IAdaptable hint) {
		return UMLElementTypes.getElement(hint);
	}

}
