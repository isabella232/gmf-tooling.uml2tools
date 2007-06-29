package org.eclipse.uml2.diagram.profile.tests.palette;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.uml2.diagram.common.tests.palette.EntryExistenceTest;
import org.eclipse.uml2.diagram.common.tests.palette.EntryLabelTest;
import org.eclipse.uml2.diagram.profile.part.UMLPaletteFactory;
import org.eclipse.uml2.uml.UMLPackage;


public class ProfileDPaletteEntriesSuite extends TestSuite {
	public ProfileDPaletteEntriesSuite() {
		super("PaletteEntriesSuite");
		PaletteRoot paletteRoot = new PaletteRoot();
		UMLPaletteFactory factory = new UMLPaletteFactory();
		factory.fillPalette(paletteRoot);
		List<List<ENamedElement>> paletteDescription = getPaletteDescrition();
		for (int groupIndex = 0; groupIndex < paletteDescription.size(); groupIndex++) {
			List<ENamedElement> entryDescriptions = paletteDescription.get(groupIndex);
			for (int entryIndex = 0; entryIndex < entryDescriptions.size(); entryIndex++) {
				addTest(new EntryExistenceTest(paletteRoot, groupIndex, entryDescriptions.get(entryIndex), entryIndex));
				addTest(new ProfileEntryMetaclassTest(paletteRoot, groupIndex, entryDescriptions.get(entryIndex), entryIndex));
				addTest(new EntryLabelTest(paletteRoot, groupIndex, entryDescriptions.get(entryIndex), entryIndex));
			}
		}
	}
	private static List<List<ENamedElement>> oursGroupDescription= new ArrayList<List<ENamedElement>>();
	private static List<ENamedElement> oursProfileGroupDescription= new ArrayList<ENamedElement>();
	private static List<ENamedElement> oursUMLGroupDescription= new ArrayList<ENamedElement>();

	static {
		oursGroupDescription.add(oursProfileGroupDescription);
		oursGroupDescription.add(oursUMLGroupDescription);
		
		oursProfileGroupDescription.add(UMLPackage.eINSTANCE.getProfile());
		oursProfileGroupDescription.add(UMLPackage.eINSTANCE.getStereotype());
		oursProfileGroupDescription.add(UMLPackage.eINSTANCE.getElementImport());
		oursProfileGroupDescription.add(UMLPackage.eINSTANCE.getExtension());
		
		oursUMLGroupDescription.add(UMLPackage.eINSTANCE.getEnumeration());
		oursUMLGroupDescription.add(UMLPackage.eINSTANCE.getGeneralization());
		oursUMLGroupDescription.add(UMLPackage.eINSTANCE.getProperty());
		oursUMLGroupDescription.add(UMLPackage.eINSTANCE.getConstraint());
		oursUMLGroupDescription.add(UMLPackage.eINSTANCE.getEnumerationLiteral());
	}
	protected List<List<ENamedElement>> getPaletteDescrition() {
		return oursGroupDescription;
	}
}
