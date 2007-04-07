package org.eclipse.uml2.diagram.common.tests.palette;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

public abstract class EntryMetaclassTest extends PaletteEntriesTestBase {
	
	public EntryMetaclassTest(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		super(paletteRoot, groupIndex, type, entryIndex);
	}

	@Override
	protected void testEntry() {
		ToolEntry entry = getToolEntryAt(myPaletteGroup, myEntryIndex);
		List elementTypes = getElementTypes(entry);
		assertNotNull("Impossible to get 'elementTypes' field value.", elementTypes);
		for (Object object: elementTypes) {
			IAdaptable hint = (IAdaptable) object;
			ENamedElement element = getElement(hint);
			assertEquals("Incorrect metaclass in entry " + myEntryIndex + " in " + myPaletteGroup.getId() + " group.", myType, element);
		}
	}
	
	@Override
	public String getName() {
		return "test" + myType.getName() + "MetaclassEntry";
	}

	private List getElementTypes(ToolEntry tool) {
			Field elementTypeField;
			try {
				elementTypeField = tool.getClass().getDeclaredField("elementTypes");
				if (!elementTypeField.isAccessible()) {
					elementTypeField.setAccessible(true);
				}
				List elementTypes = (List) elementTypeField.get(tool);
				return elementTypes;
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return null;
	}
	protected abstract ENamedElement getElement(IAdaptable hint);

}
