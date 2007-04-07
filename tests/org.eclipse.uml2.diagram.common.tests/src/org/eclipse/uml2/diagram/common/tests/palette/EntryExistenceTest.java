package org.eclipse.uml2.diagram.common.tests.palette;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;

public class EntryExistenceTest extends PaletteEntriesTestBase {
	
	public EntryExistenceTest(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		super(paletteRoot, groupIndex, type, entryIndex);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void testEntry() {
		assertTrue(myType.getName() + " Entry is estimated in " + myEntryIndex + " in group " + myPaletteGroup.getId(), myPaletteGroup.getChildren().size() > myEntryIndex);
	}
	
	@Override
	public String getName() {
		return "test" + myType.getName() + "EntryExistence";
	}
}
