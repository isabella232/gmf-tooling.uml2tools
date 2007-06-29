package org.eclipse.uml2.diagram.common.tests.palette;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.uml2.uml.UMLPackage;

public abstract class EntryMetaclassTest extends PaletteEntriesTestBase {

	public EntryMetaclassTest(PaletteRoot paletteRoot, int groupIndex, ENamedElement type, int entryIndex) {
		super(paletteRoot, groupIndex, type, entryIndex);
	}

	@Override
	protected void testEntry() {
		ToolEntry entry = getToolEntryAt(myPaletteGroup, myEntryIndex);
		List elementTypes = getElementTypes(entry);
		assertNotNull("Impossible to get 'elementTypes' field value.", elementTypes);
		for (Object object : elementTypes) {
			IAdaptable hint = (IAdaptable) object;
			ENamedElement element = getElement(hint);
			assertEquals("Incorrect metaclass in entry " + myEntryIndex + " in " + myPaletteGroup.getId() + " group.", myType, element);
		}
	}

	@Override
	public String getName() {
		return "test" + myType.getName() + "MetaclassEntry";
	}

	private boolean isRelationship(ENamedElement type) {
		return type instanceof EClass && ((EClass) type).getEAllSuperTypes().contains(UMLPackage.eINSTANCE.getRelationship());
	}

	private List getElementTypes(ToolEntry tool) {
		boolean isRelationship = isRelationship(myType);
		String field = (isRelationship) ? FIELD_RELATIONSHIP : FIELD_NODE;
		Field elementTypeField;
		try {
			elementTypeField = tool.getClass().getDeclaredField(field);
			if (!elementTypeField.isAccessible()) {
				elementTypeField.setAccessible(true);
			}
			List elementTypes = (List) elementTypeField.get(tool);
			return elementTypes;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			fail("Cannot get element types: SecurityException");
		} catch (NoSuchFieldException e) {
			fail("Cannot get element types: NoSuchFieldException");
		} catch (IllegalArgumentException e) {
			fail("Cannot get element types: IllegalArgumentException");
		} catch (IllegalAccessException e) {
			fail("Cannot get element types: IllegalAccessException");
		}
		return null;
	}

	protected abstract ENamedElement getElement(IAdaptable hint);

	private static final String FIELD_RELATIONSHIP = "relationshipTypes";

	private static final String FIELD_NODE = "elementTypes";

}
