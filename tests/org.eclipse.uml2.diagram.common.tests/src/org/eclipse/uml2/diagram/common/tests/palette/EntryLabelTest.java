package org.eclipse.uml2.diagram.common.tests.palette;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

public class EntryLabelTest extends PaletteEntriesTestBase {
	
	public EntryLabelTest(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		super(paletteRoot, groupIndex, type, entryIndex);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void testEntry() {
		ToolEntry entry = getToolEntryAt(myPaletteGroup, myEntryIndex);
		String name = myType.getName();
		String lowerCaseName = name.toLowerCase();
		StringBuffer label = new StringBuffer();
		label.append(name.charAt(0));
		for (int i = 1; i < name.length(); i++) {
			if (name.charAt(i) != lowerCaseName.charAt(i)) {
				label.append(" ");
			}
			label.append(name.charAt(i));
		}
		assertEquals(label.toString(), entry.getLabel());
	}
	@Override
	public String getName() {
		return "test" + myType.getName() + "EntryLabel";
	}
}
