package org.eclipse.uml2.diagram.common.tests.palette;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

public abstract class PaletteEntriesTestBase extends TestCase {
	protected PaletteContainer myPaletteGroup;
	protected int myGroupIndex;
	protected ENamedElement myType;
	protected int myEntryIndex;
	
	public PaletteEntriesTestBase(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		myGroupIndex = groupIndex;
		myType = type;
		myEntryIndex = entryIndex;
		List groups = paletteRoot.getChildren();
		myPaletteGroup = (PaletteContainer) groups.get(myGroupIndex);
		
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	@Override
	protected void runTest() throws Throwable {
		testEntry();		
	}
	
	protected ToolEntry getToolEntryAt(PaletteContainer group, int index) {
		return (ToolEntry)group.getChildren().get(index);
	}
	
	protected abstract void testEntry();
	
}
