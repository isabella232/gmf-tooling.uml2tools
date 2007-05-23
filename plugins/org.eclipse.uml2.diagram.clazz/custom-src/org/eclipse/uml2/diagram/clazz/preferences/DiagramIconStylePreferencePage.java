package org.eclipse.uml2.diagram.clazz.preferences;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditor;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.preferences.IconStylePreferencePage;


public class DiagramIconStylePreferencePage extends IconStylePreferencePage{
	
	public DiagramIconStylePreferencePage() {
		setPreferenceStore(UMLDiagramEditorPlugin.getInstance().getPreferenceStore());
	}

	@Override
	public void init(IWorkbench workbench) {
		super.init(workbench);
		myWorkbench = workbench;
	}
	
    public boolean performOk() {
    	super.performOk();
    	UMLElementTypes.refreshImageRegistry();
		refreshClassDiagramEditors();
    	return true;
    }

	private void refreshClassDiagramEditors() {
		IEditorReference[] editors = myWorkbench.getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		for (int i = 0; i < editors.length; i++) {
			IEditorPart editor = editors[i].getEditor(false);
			if (editor != null && editor instanceof UMLDiagramEditor) {
		    	((UMLDiagramEditor)editor).refresh();
			}
		}
	}
    
	@Override
	protected void initHelp() {
		// TODO Auto-generated method stub
		
	};

	private IWorkbench myWorkbench;
}
