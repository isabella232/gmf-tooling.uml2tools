package org.eclipse.uml2.diagram.deploy.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.parser.imports.ElementImportParser;
import org.eclipse.uml2.diagram.common.parser.property.PropertyParser;
import org.eclipse.uml2.diagram.common.parser.property.PropertyToString;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.deploy.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.deploy.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.lookup.DefaultOclLookups;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuiteImpl;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @NOT-GENERATED
	 */
	public static final OCLLookup<Type> TYPE_LOOKUP = new OCLLookup<Type>(//
			UMLOCLFactory.getOCLLookupExpression(//
					DefaultOclLookups.DEFAULT_TYPE_LOOKUP, //
					UMLPackage.eINSTANCE.getNamedElement()), // 
			new IElementType[] {});

	/**
	 * @generated
	 */
	private IParser packageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5001Parser() {
		if (packageName_5001Parser == null) {
			packageName_5001Parser = createPackageName_5001Parser();
		}
		return packageName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5001Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5002Parser() {
		if (deviceName_5002Parser == null) {
			deviceName_5002Parser = createDeviceName_5002Parser();
		}
		return deviceName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceName_5002Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5003Parser() {
		if (nodeName_5003Parser == null) {
			nodeName_5003Parser = createNodeName_5003Parser();
		}
		return nodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNodeName_5003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser executionEnvironmentName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getExecutionEnvironmentName_5004Parser() {
		if (executionEnvironmentName_5004Parser == null) {
			executionEnvironmentName_5004Parser = createExecutionEnvironmentName_5004Parser();
		}
		return executionEnvironmentName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createExecutionEnvironmentName_5004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactFileName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactFileName_5005Parser() {
		if (artifactFileName_5005Parser == null) {
			artifactFileName_5005Parser = createArtifactFileName_5005Parser();
		}
		return artifactFileName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactFileName_5005Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getArtifact_FileName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deploymentSpecificationName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDeploymentSpecificationName_5006Parser() {
		if (deploymentSpecificationName_5006Parser == null) {
			deploymentSpecificationName_5006Parser = createDeploymentSpecificationName_5006Parser();
		}
		return deploymentSpecificationName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeploymentSpecificationName_5006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser elementImport_3001Parser;

	/**
	 * @generated
	 */
	private IParser getElementImport_3001Parser() {
		if (elementImport_3001Parser == null) {
			elementImport_3001Parser = createElementImport_3001Parser();
		}
		return elementImport_3001Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createElementImport_3001Parser() {
		return new ElementImportParser();
	}

	/**
	 * @generated
	 */
	private IParser deviceName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5010Parser() {
		if (deviceName_5010Parser == null) {
			deviceName_5010Parser = createDeviceName_5010Parser();
		}
		return deviceName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceName_5010Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactFileName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactFileName_5007Parser() {
		if (artifactFileName_5007Parser == null) {
			artifactFileName_5007Parser = createArtifactFileName_5007Parser();
		}
		return artifactFileName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactFileName_5007Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getArtifact_FileName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifactFileName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactFileName_5011Parser() {
		if (artifactFileName_5011Parser == null) {
			artifactFileName_5011Parser = createArtifactFileName_5011Parser();
		}
		return artifactFileName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifactFileName_5011Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getArtifact_FileName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deploymentSpecificationName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDeploymentSpecificationName_5012Parser() {
		if (deploymentSpecificationName_5012Parser == null) {
			deploymentSpecificationName_5012Parser = createDeploymentSpecificationName_5012Parser();
		}
		return deploymentSpecificationName_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeploymentSpecificationName_5012Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser executionEnvironmentName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getExecutionEnvironmentName_5008Parser() {
		if (executionEnvironmentName_5008Parser == null) {
			executionEnvironmentName_5008Parser = createExecutionEnvironmentName_5008Parser();
		}
		return executionEnvironmentName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createExecutionEnvironmentName_5008Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser artifact_3006Parser;

	/**
	 * @generated
	 */
	private IParser getArtifact_3006Parser() {
		if (artifact_3006Parser == null) {
			artifact_3006Parser = createArtifact_3006Parser();
		}
		return artifact_3006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createArtifact_3006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getArtifact_FileName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5009Parser() {
		if (nodeName_5009Parser == null) {
			nodeName_5009Parser = createNodeName_5009Parser();
		}
		return nodeName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createNodeName_5009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser property_3003Parser;

	/**
	 * @generated
	 */
	private IParser getProperty_3003Parser() {
		if (property_3003Parser == null) {
			property_3003Parser = createProperty_3003Parser();
		}
		return property_3003Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createProperty_3003Parser() {
		return createPropertyParser();
	}

	/**
	 * @NOT-GENERATED
	 */
	private IParser createPropertyParser() {
		LookupSuiteImpl lookupSuite = new LookupSuiteImpl();
		lookupSuite.addLookup(Type.class, TYPE_LOOKUP);
		return new SemanticParserAdapter(new PropertyParser(lookupSuite), new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
	}

	/**
	 * @generated
	 */
	private IParser deploymentName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getDeploymentName_6001Parser() {
		if (deploymentName_6001Parser == null) {
			deploymentName_6001Parser = createDeploymentName_6001Parser();
		}
		return deploymentName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeploymentName_6001Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		parser.setViewPattern("\u00ABdeploy\u00BB"); //$NON-NLS-1$
		parser.setEditorPattern("\u00ABdeploy\u00BB"); //$NON-NLS-1$
		parser.setEditPattern("\u00ABdeploy\u00BB"); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser manifestationName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getManifestationName_6002Parser() {
		if (manifestationName_6002Parser == null) {
			manifestationName_6002Parser = createManifestationName_6002Parser();
		}
		return manifestationName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createManifestationName_6002Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		parser.setViewPattern("\u00ABmanifest\u00BB"); //$NON-NLS-1$
		parser.setEditorPattern("\u00ABmanifest\u00BB"); //$NON-NLS-1$
		parser.setEditPattern("\u00ABmanifest\u00BB"); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser communicationPathName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getCommunicationPathName_6003Parser() {
		if (communicationPathName_6003Parser == null) {
			communicationPathName_6003Parser = createCommunicationPathName_6003Parser();
		}
		return communicationPathName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCommunicationPathName_6003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_6004Parser() {
		if (dependencyName_6004Parser == null) {
			dependencyName_6004Parser = createDependencyName_6004Parser();
		}
		return dependencyName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyName_6004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5001Parser();
		case DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5002Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5003Parser();
		case ExecutionEnvironmentNameEditPart.VISUAL_ID:
			return getExecutionEnvironmentName_5004Parser();
		case ArtifactFileNameEditPart.VISUAL_ID:
			return getArtifactFileName_5005Parser();
		case DeploymentSpecificationNameEditPart.VISUAL_ID:
			return getDeploymentSpecificationName_5006Parser();
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3001Parser();
		case DeviceName2EditPart.VISUAL_ID:
			return getDeviceName_5010Parser();
		case ArtifactFileName2EditPart.VISUAL_ID:
			return getArtifactFileName_5007Parser();
		case ArtifactFileName3EditPart.VISUAL_ID:
			return getArtifactFileName_5011Parser();
		case DeploymentSpecificationName2EditPart.VISUAL_ID:
			return getDeploymentSpecificationName_5012Parser();
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3003Parser();
		case ExecutionEnvironmentName2EditPart.VISUAL_ID:
			return getExecutionEnvironmentName_5008Parser();
		case Artifact3EditPart.VISUAL_ID:
			return getArtifact_3006Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5009Parser();
		case DeploymentNameEditPart.VISUAL_ID:
			return getDeploymentName_6001Parser();
		case ManifestationNameEditPart.VISUAL_ID:
			return getManifestationName_6002Parser();
		case CommunicationPathNameEditPart.VISUAL_ID:
			return getCommunicationPathName_6003Parser();
		case DependencyNameEditPart.VISUAL_ID:
			return getDependencyName_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
