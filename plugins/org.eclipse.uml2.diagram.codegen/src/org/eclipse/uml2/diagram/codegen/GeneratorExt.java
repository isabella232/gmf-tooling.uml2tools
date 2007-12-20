package org.eclipse.uml2.diagram.codegen;

import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.codegen.util.Generator;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.internal.common.codegen.TextMerger;
import org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes;

public class GeneratorExt extends Generator {

	private final GenDiagram myDiagram;
	private final CodegenEmittersExt myEmitters;

	public GeneratorExt(GenEditorGenerator genModel, CodegenEmittersExt emitters) {
		super(genModel, emitters);
		myDiagram = genModel.getDiagram();
		myEmitters = emitters;
	}
	@Override
	protected TextMerger createMergeService() {
		//see #181484, temporary workaround
		final TextMerger defaultMerger = super.createMergeService();
		return new TextMerger(){
			@Override
			public String process(String fileNameExt, String oldText, String newText) {
				if ("properties".equals(fileNameExt) && newText != null && newText.contains("#seeBugzilla=181484")){
					return newText;
				}
				return defaultMerger.process(fileNameExt, oldText, newText);
			}
			
			@Override
			public String mergeJava(String oldText, String newText) {
				return defaultMerger.mergeJava(oldText, newText);
			}
			
			@Override
			public String mergeProperties(String oldText, String newText) {
				return defaultMerger.mergeProperties(oldText, newText);
			}
			
			@Override
			public String mergeXML(String oldText, String newText) {
				return defaultMerger.mergeXML(oldText, newText);
			}
		};
	}

	@Override
	protected void customRun() throws InterruptedException, UnexpectedBehaviourException {
		super.customRun();
		for (GenTopLevelNode node : myDiagram.getTopLevelNodes()) {
			generateChangeNotationAction(node);
		}
	}

	private void generateChangeNotationAction(GenTopLevelNode node) throws InterruptedException, UnexpectedBehaviourException {
		for (org.eclipse.gmf.codegen.gmfgen.Attributes attr : node.getViewmap().getAttributes()) {
			if (false == attr instanceof SubstitutableByAttributes) {
				continue;
			}
			SubstitutableByAttributes sba = (SubstitutableByAttributes) attr;
			if (sba.isRequiresAll()) {
				return;
			}
			doGenerateJavaClass(myEmitters.getChangeNotationContributionItemProviderEmitter(), myEmitters.getChangeNotationContributionItemProviderName(new Object[] { node }), node);
			for (Object substitutableByNode : sba.getSubstitutableByNodes()) {
				doGenerateJavaClass(myEmitters.getChangeNotationActionEmitter(), myEmitters.getChangeNotationActionName(new Object[] { node, substitutableByNode }), node, substitutableByNode);
			}
			// we process only the first attribute
			return;
		}
	}
}
