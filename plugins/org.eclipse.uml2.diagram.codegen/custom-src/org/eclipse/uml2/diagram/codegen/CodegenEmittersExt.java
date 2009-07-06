package org.eclipse.uml2.diagram.codegen;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.codegen.util.CodegenEmitters;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;


public class CodegenEmittersExt extends CodegenEmitters {
	
	public CodegenEmittersExt(boolean useBaseTemplatesOnly, String templateDirectory, boolean includeDynamicModelTemplates) {
		super(useBaseTemplatesOnly, templateDirectory, includeDynamicModelTemplates);
	}
	
	public TextEmitter getChangeNotationActionEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::actions::ChangeNotationAction::ChangeNotationAction"); //$NON-NLS-1$
	}

	public String getChangeNotationActionName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::actions::ChangeNotationAction::qualifiedClassName", input); //$NON-NLS-1$
	}

	public TextEmitter getChangeNotationContributionItemProviderEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::actions::ChangeNotationContributionItemProvider::ChangeNotationContributionItemProvider"); //$NON-NLS-1$
	}
	
	public TextEmitter getTurnCommentIntoNoteEmitter() {
		return newXpandEmitter("xpt::actions::TurnCommentIntoNoteAction::TurnCommentIntoNoteAction"); //$NON-NLS-1$
	}
	
	public String getTurnCommentIntoNoteActionFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::actions::TurnCommentIntoNoteAction::qualifiedClassName", input); //$NON-NLS-1$
	}
	

	public TextEmitter getTurnNoteIntoCommentEmitter() {
		return newXpandEmitter("xpt::actions::TurnNoteIntoCommentAction::TurnNoteIntoCommentAction"); //$NON-NLS-1$
	}
	
	public String getTurnNoteIntoCommentActionFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::actions::TurnNoteIntoCommentAction::qualifiedClassName", input); //$NON-NLS-1$
	}

	//	public TextEmitter getDynamicCanonicalEditPolicyEmitter() throws UnexpectedBehaviourException {
//		return newXpandEmitter("xpt::diagram::canonical::DynamicCanonicalEditPolicy::DynamicCanonicalEditPolicy"); //$NON-NLS-1$
//	}
//
//	public TextEmitter getDynamicCanonicalEditPolicyFQNEmitter() throws UnexpectedBehaviourException {
//		return newXpandEmitter("xpt::diagram::canonical::DynamicCanonicalEditPolicy::DynamicCanonicalEditPolicyFQN"); //$NON-NLS-1$
//	}
//

	public String getChangeNotationContributionItemProviderName(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::actions::ChangeNotationContributionItemProvider::qualifiedClassName", input); //$NON-NLS-1$
	}

	public TextEmitter getIconStylePreferencePageEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::preferences::IconStylePreferencePage::IconStylePreferencePage"); //$NON-NLS-1$
	}

	public String getIconStylePreferencePageFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::preferences::IconStylePreferencePage::qualifiedClassName", input); //$NON-NLS-1$
	}

	public TextEmitter getIconStylePreferenceHelperEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::preferences::IconStylePreferenceHelper::IconStylePreferenceHelper"); //$NON-NLS-1$
	}

	public String getIconStylePreferenceHelperFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::preferences::IconStylePreferenceHelper::qualifiedClassName", input); //$NON-NLS-1$
	}

	public TextEmitter getViewFiltersPreferencePageEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::preferences::ViewFiltersPreferencePage::ViewFiltersPreferencePage"); //$NON-NLS-1$
	}

	public String getViewFiltersPreferencePageFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::preferences::ViewFiltersPreferencePage::qualifiedClassName", input); //$NON-NLS-1$
	}
	
	public boolean isViewFiltersPreferencePage(Object... input) throws UnexpectedBehaviourException {
		TextEmitter emitter = newXpandEmitter("xpt::preferences::ViewFiltersPreferencePage::isViewFiltersPreferencePage");//$NON-NLS-1$
		String result = getText(emitter, input);
		return Boolean.valueOf(result); 
	}	
	
	public TextEmitter getPaletteProviderEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::extendedpalette::PaletteProvider::paletteProvider"); //$NON-NLS-1$
	}

	public String getPaletteProviderFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::extendedpalette::PaletteProvider::qualifiedClassName", input); //$NON-NLS-1$
	}
	
	public boolean isPaletteProviderNeeded(Object... input) throws UnexpectedBehaviourException {
		TextEmitter emitter = newXpandEmitter("xpt::extendedpalette::PaletteProvider::needsExtendedPalette");//$NON-NLS-1$
		String result = getText(emitter, input);
		return Boolean.valueOf(result); 
	}	

	public TextEmitter getFixedElementsWizardEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::async::FixedElementsWizard::FixedElementsWizard"); //$NON-NLS-1$
	}

	public String getFixedElementsWizardFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::async::FixedElementsWizard::qualifiedClassName", input); //$NON-NLS-1$
	}
	
	public boolean needsFixedElementsWizard(Object... input) throws UnexpectedBehaviourException {
		TextEmitter emitter = newXpandEmitter("xpt::async::FixedElementsWizard::needsFixedElementsWizard");//$NON-NLS-1$
		String result = getText(emitter, input);
		return Boolean.valueOf(result); 
	}

	public TextEmitter getNewDiagramHandlerEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::async::NewDiagramHandler::NewDiagramHandler"); //$NON-NLS-1$
	}

	public String getNewDiagramHandlerFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::async::NewDiagramHandler::qualifiedClassName", input); //$NON-NLS-1$
	}
	
	public TextEmitter getNewDiagramPropertyTesterEmitter() throws UnexpectedBehaviourException {
		return newXpandEmitter("xpt::async::NewDiagramPropertyTester::NewDiagramPropertyTester"); //$NON-NLS-1$
	}

	public String getNewDiagramPropertyTesterFQN(Object... input) throws UnexpectedBehaviourException {
		return getQualifiedClassName("xpt::async::NewDiagramPropertyTester::qualifiedClassName", input); //$NON-NLS-1$
	}	
	
	/**
	 * Returns qualified class name defined in template.
	 */
	private String getQualifiedClassName(String templateName, Object... input) throws UnexpectedBehaviourException {
		TextEmitter emitter = newXpandEmitter(templateName);
		return getText(emitter, input);
	}

	/**
	 * copy from the private method in super class
	 * Returns text generated by emitter.
	 */
	private String getText(TextEmitter emitter, Object... input) throws UnexpectedBehaviourException {
		try {
			return emitter.generate(new NullProgressMonitor(), input).trim();
		} catch (InterruptedException ie) {
			return null;
		} catch (InvocationTargetException ite) {
			throw new UnexpectedBehaviourException(ite.getCause());
		}
	}


}
