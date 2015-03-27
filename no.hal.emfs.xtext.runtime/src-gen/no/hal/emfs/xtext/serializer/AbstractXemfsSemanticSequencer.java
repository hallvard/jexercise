package no.hal.emfs.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import no.hal.emfs.ClasspathEntry;
import no.hal.emfs.DotClasspathFileContentProvider;
import no.hal.emfs.DotProjectFileContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResourcesRef;
import no.hal.emfs.GitContentProvider;
import no.hal.emfs.GitContentRef;
import no.hal.emfs.GitURLContentProvider;
import no.hal.emfs.Property;
import no.hal.emfs.PropertyValueString;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.URLContentProvider;
import no.hal.emfs.VerbatimStringContents;
import no.hal.emfs.WrappingStringContentProvider;
import no.hal.emfs.xtext.services.XemfsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractXemfsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XemfsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EmfsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EmfsPackage.CLASSPATH_ENTRY:
				if(context == grammarAccess.getAbstractClasspathEntryRule() ||
				   context == grammarAccess.getClasspathEntryRule()) {
					sequence_ClasspathEntry(context, (ClasspathEntry) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER:
				if(context == grammarAccess.getDotClasspathFileContentProviderRule()) {
					sequence_DotClasspathFileContentProvider(context, (DotClasspathFileContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER:
				if(context == grammarAccess.getDotProjectFileContentProviderRule()) {
					sequence_DotProjectFileContentProvider(context, (DotProjectFileContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.EMFS_CONTAINER:
				if(context == grammarAccess.getEmfsContainerRule() ||
				   context == grammarAccess.getEmfsResourceRule()) {
					sequence_EmfsContainer(context, (EmfsContainer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEmfsRootRule()) {
					sequence_EmfsRoot(context, (EmfsContainer) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.EMFS_FILE:
				if(context == grammarAccess.getEmfsFileRule() ||
				   context == grammarAccess.getEmfsResourceRule()) {
					sequence_EmfsFile(context, (EmfsFile) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.EMFS_RESOURCES_REF:
				if(context == grammarAccess.getEmfsResourcesRefRule()) {
					sequence_EmfsResourcesRef(context, (EmfsResourcesRef) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.GIT_CONTENT_PROVIDER:
				if(context == grammarAccess.getGitContentProviderRule()) {
					sequence_GitContentProvider(context, (GitContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.GIT_CONTENT_REF:
				if(context == grammarAccess.getGitContentRefRule()) {
					sequence_GitContentRef(context, (GitContentRef) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER:
				if(context == grammarAccess.getGitURLContentProviderRule()) {
					sequence_GitURLContentProvider(context, (GitURLContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.PROPERTY_VALUE_STRING:
				if(context == grammarAccess.getAbstractStringContentsRule() ||
				   context == grammarAccess.getPropertyValueStringRule()) {
					sequence_PropertyValueString(context, (PropertyValueString) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.STRING_CONTENT_PROVIDER:
				if(context == grammarAccess.getStringContentProviderRule()) {
					sequence_StringContentProvider(context, (StringContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.URL_CONTENT_PROVIDER:
				if(context == grammarAccess.getURLContentProviderRule()) {
					sequence_URLContentProvider(context, (URLContentProvider) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.VERBATIM_STRING_CONTENTS:
				if(context == grammarAccess.getAbstractStringContentsRule() ||
				   context == grammarAccess.getVerbatimStringContentsRule()) {
					sequence_VerbatimStringContents(context, (VerbatimStringContents) semanticObject); 
					return; 
				}
				else break;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER:
				if(context == grammarAccess.getWrappingStringContentProviderRule()) {
					sequence_WrappingStringContentProvider(context, (WrappingStringContentProvider) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (explicitKind=ClasspathEntryKind absolute?='/'? explicitPath=CLASSPATH_ENTRY_PATH (major=VERSION minor=VERSION?)?)
	 */
	protected void sequence_ClasspathEntry(EObject context, ClasspathEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entries+=AbstractClasspathEntry+
	 */
	protected void sequence_DotClasspathFileContentProvider(EObject context, DotClasspathFileContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keys+=STRING | keys+=FileName)+ (linkedResources+=[EmfsResource|EmfsName] linkedResources+=[EmfsResource|EmfsName]*)*)
	 */
	protected void sequence_DotProjectFileContentProvider(EObject context, DotProjectFileContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=FolderName 
	 *         tags+=EmfsName* 
	 *         properties+=Property* 
	 *         (contentProvider=GitContentProvider | contentProvider=EmfsResourcesRef)? 
	 *         resources+=EmfsResource*
	 *     )
	 */
	protected void sequence_EmfsContainer(EObject context, EmfsContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=FileName 
	 *         writeable?='*'? 
	 *         tags+=ID* 
	 *         properties+=Property* 
	 *         (
	 *             contentProvider=URLContentProvider | 
	 *             contentProvider=GitURLContentProvider | 
	 *             contentProvider=StringContentProvider | 
	 *             contentProvider=WrappingStringContentProvider | 
	 *             contentProvider=DotClasspathFileContentProvider | 
	 *             contentProvider=DotProjectFileContentProvider
	 *         )?
	 *     )
	 */
	protected void sequence_EmfsFile(EObject context, EmfsFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=[EmfsResource|EmfsName] resources+=[EmfsResource|EmfsName]*)
	 */
	protected void sequence_EmfsResourcesRef(EObject context, EmfsResourcesRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EmfsName? tags+=ID* properties+=Property* (contentProvider=GitContentProvider | contentProvider=EmfsResourcesRef)? resources+=EmfsResource*)
	 */
	protected void sequence_EmfsRoot(EObject context, EmfsContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     gitRef=GitContentRef
	 */
	protected void sequence_GitContentProvider(EObject context, GitContentProvider semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EmfsPackage.Literals.GIT_CONTENT_PROVIDER__GIT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EmfsPackage.Literals.GIT_CONTENT_PROVIDER__GIT_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGitContentProviderAccess().getGitRefGitContentRefParserRuleCall_0(), semanticObject.getGitRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((((host=URL_HOST_NAME | host=PROPERTY_REF) (owner=ID | owner=PROPERTY_REF)?) | owner=ID | owner=PROPERTY_REF) repo=ID path=URL_PATH?)
	 */
	protected void sequence_GitContentRef(EObject context, GitContentRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     gitRef=GitContentRef
	 */
	protected void sequence_GitURLContentProvider(EObject context, GitURLContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (writeable?='*'? (propertyName=ID | propertyName=EmfsName) (defaultValue=STRING | defaultValue=EmfsName)?)
	 */
	protected void sequence_PropertyValueString(EObject context, PropertyValueString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EmfsName (value=STRING | value=EmfsName))
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stringContents+=AbstractStringContents+
	 */
	protected void sequence_StringContentProvider(EObject context, StringContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (urlString=STRING | urlString=URL)
	 */
	protected void sequence_URLContentProvider(EObject context, URLContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((writeable?='*'? tags+=ID* properties+=Property*)? (stringContent=STRING | stringContent=STRING_CONTENT))
	 */
	protected void sequence_VerbatimStringContents(EObject context, VerbatimStringContents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=AbstractStringContents (contentProvider=URLContentProvider | contentProvider=GitURLContentProvider) suffix=AbstractStringContents)
	 */
	protected void sequence_WrappingStringContentProvider(EObject context, WrappingStringContentProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
