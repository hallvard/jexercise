/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.jex.JexFactory
 * @model kind="package"
 * @generated
 */
public interface JexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jex";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.jex/model/jex.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JexPackage eINSTANCE = no.hal.jex.impl.JexPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaElementImpl <em>Java Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaElementImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaElement()
	 * @generated
	 */
	int JAVA_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT__PRESENT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT__TIME = 1;

	/**
	 * The number of structural features of the '<em>Java Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaPackImpl <em>Java Pack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaPackImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaPack()
	 * @generated
	 */
	int JAVA_PACK = 0;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK__PRESENT = JAVA_ELEMENT__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK__TIME = JAVA_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK__NAME = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK__CLASSES = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK__SOURCE_LOCATION = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Pack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PACK_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.MemberImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 4;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__PRESENT = JAVA_ELEMENT__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TIME = JAVA_ELEMENT__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = JAVA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MODIFIERS = JAVA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__OWNER = JAVA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REQUIRED = JAVA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = JAVA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaClassImpl <em>Java Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaClassImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaClass()
	 * @generated
	 */
	int JAVA_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__PRESENT = MEMBER__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__TIME = MEMBER__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__OWNER = MEMBER__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__REQUIRED = MEMBER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__CLASS_KIND = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__MEMBERS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pack</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__PACK = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__SUPERCLASSES = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Java Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaFieldImpl <em>Java Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaFieldImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaField()
	 * @generated
	 */
	int JAVA_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__PRESENT = MEMBER__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__TIME = MEMBER__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__OWNER = MEMBER__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__REQUIRED = MEMBER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD__TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaMethodImpl <em>Java Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaMethodImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaMethod()
	 * @generated
	 */
	int JAVA_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__PRESENT = MEMBER__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__TIME = MEMBER__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__OWNER = MEMBER__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__REQUIRED = MEMBER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__RETURN_TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Throwables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD__THROWABLES = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.AbstractRequirementImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__JAVA_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__REQUIREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED = 6;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.RequirementImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = ABSTRACT_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMMENT = ABSTRACT_REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__JAVA_ELEMENTS = ABSTRACT_REQUIREMENT__JAVA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENTS = ABSTRACT_REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT = ABSTRACT_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN_SATISFIED = ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TIME = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MESSAGES = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaRequirementImpl <em>Java Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaRequirementImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaRequirement()
	 * @generated
	 */
	int JAVA_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__TEXT = REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__COMMENT = REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__JAVA_ELEMENTS = REQUIREMENT__JAVA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__REQUIREMENTS = REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__PARENT = REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__CHILDREN_SATISFIED = REQUIREMENT__CHILDREN_SATISFIED;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__SATISFIED = REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__TIME = REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__MESSAGES = REQUIREMENT__MESSAGES;

	/**
	 * The feature id for the '<em><b>Java Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__JAVA_ELEMENT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT__REQUIRED_FEATURES = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JUnitTestImpl <em>JUnit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JUnitTestImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJUnitTest()
	 * @generated
	 */
	int JUNIT_TEST = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__TEXT = JAVA_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__DESCRIPTION = JAVA_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__COMMENT = JAVA_REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__JAVA_ELEMENTS = JAVA_REQUIREMENT__JAVA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__REQUIREMENTS = JAVA_REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__PARENT = JAVA_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__CHILDREN_SATISFIED = JAVA_REQUIREMENT__CHILDREN_SATISFIED;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__SATISFIED = JAVA_REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__TIME = JAVA_REQUIREMENT__TIME;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__MESSAGES = JAVA_REQUIREMENT__MESSAGES;

	/**
	 * The feature id for the '<em><b>Java Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__JAVA_ELEMENT = JAVA_REQUIREMENT__JAVA_ELEMENT;

	/**
	 * The feature id for the '<em><b>Required Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__REQUIRED_FEATURES = JAVA_REQUIREMENT__REQUIRED_FEATURES;

	/**
	 * The feature id for the '<em><b>Test Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__TEST_RUNNABLE = JAVA_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__POINTS = JAVA_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST__TEST_STATUS = JAVA_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JUnit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_FEATURE_COUNT = JAVA_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.ExerciseImpl <em>Exercise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.ExerciseImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getExercise()
	 * @generated
	 */
	int EXERCISE = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__TEXT = ABSTRACT_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__COMMENT = ABSTRACT_REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__JAVA_ELEMENTS = ABSTRACT_REQUIREMENT__JAVA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__REQUIREMENTS = ABSTRACT_REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__PARENT = ABSTRACT_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__CHILDREN_SATISFIED = ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED;

	/**
	 * The number of structural features of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.ExercisePartImpl <em>Exercise Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.ExercisePartImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getExercisePart()
	 * @generated
	 */
	int EXERCISE_PART = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__TEXT = ABSTRACT_REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__COMMENT = ABSTRACT_REQUIREMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Java Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__JAVA_ELEMENTS = ABSTRACT_REQUIREMENT__JAVA_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__REQUIREMENTS = ABSTRACT_REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__PARENT = ABSTRACT_REQUIREMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART__CHILDREN_SATISFIED = ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED;

	/**
	 * The number of structural features of the '<em>Exercise Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_PART_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.jex.TestRunnable <em>Test Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.TestRunnable
	 * @see no.hal.jex.impl.JexPackageImpl#getTestRunnable()
	 * @generated
	 */
	int TEST_RUNNABLE = 12;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__PRESENT = MEMBER__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__TIME = MEMBER__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__OWNER = MEMBER__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__REQUIRED = MEMBER__REQUIRED;

	/**
	 * The feature id for the '<em><b>Tested Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE__TESTED_ELEMENTS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RUNNABLE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaClassTesterImpl <em>Java Class Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaClassTesterImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaClassTester()
	 * @generated
	 */
	int JAVA_CLASS_TESTER = 13;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__PRESENT = JAVA_CLASS__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__TIME = JAVA_CLASS__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__NAME = JAVA_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__MODIFIERS = JAVA_CLASS__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__OWNER = JAVA_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__REQUIRED = JAVA_CLASS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__CLASS_KIND = JAVA_CLASS__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__MEMBERS = JAVA_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Pack</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__PACK = JAVA_CLASS__PACK;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__SUPERCLASSES = JAVA_CLASS__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Tested Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER__TESTED_ELEMENTS = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Class Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_TESTER_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.JavaMethodTesterImpl <em>Java Method Tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JavaMethodTesterImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getJavaMethodTester()
	 * @generated
	 */
	int JAVA_METHOD_TESTER = 14;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__PRESENT = JAVA_METHOD__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__TIME = JAVA_METHOD__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__NAME = JAVA_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__MODIFIERS = JAVA_METHOD__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__OWNER = JAVA_METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__REQUIRED = JAVA_METHOD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__RETURN_TYPE = JAVA_METHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__PARAMETERS = JAVA_METHOD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Throwables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__THROWABLES = JAVA_METHOD__THROWABLES;

	/**
	 * The feature id for the '<em><b>Tested Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER__TESTED_ELEMENTS = JAVA_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Method Tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_TESTER_FEATURE_COUNT = JAVA_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.jex.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.TestSuiteImpl
	 * @see no.hal.jex.impl.JexPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 15;

	/**
	 * The feature id for the '<em><b>Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__PRESENT = JAVA_CLASS__PRESENT;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TIME = JAVA_CLASS__TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = JAVA_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__MODIFIERS = JAVA_CLASS__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__OWNER = JAVA_CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__REQUIRED = JAVA_CLASS__REQUIRED;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__CLASS_KIND = JAVA_CLASS__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__MEMBERS = JAVA_CLASS__MEMBERS;

	/**
	 * The feature id for the '<em><b>Pack</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__PACK = JAVA_CLASS__PACK;

	/**
	 * The feature id for the '<em><b>Superclasses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__SUPERCLASSES = JAVA_CLASS__SUPERCLASSES;

	/**
	 * The feature id for the '<em><b>Tested Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TESTED_ELEMENTS = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Runs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_RUNS = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.jex.ClassKind <em>Class Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.ClassKind
	 * @see no.hal.jex.impl.JexPackageImpl#getClassKind()
	 * @generated
	 */
	int CLASS_KIND = 16;

	/**
	 * The meta object id for the '{@link no.hal.jex.JUnitTestStatus <em>JUnit Test Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.JUnitTestStatus
	 * @see no.hal.jex.impl.JexPackageImpl#getJUnitTestStatus()
	 * @generated
	 */
	int JUNIT_TEST_STATUS = 17;

	/**
	 * The meta object id for the '<em>Declaration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see no.hal.jex.impl.JexPackageImpl#getDeclarationType()
	 * @generated
	 */
	int DECLARATION_TYPE = 18;

	/**
	 * The meta object id for the '<em>Modifiers</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.jex.impl.JexPackageImpl#getModifiers()
	 * @generated
	 */
	int MODIFIERS = 19;

	/**
	 * The meta object id for the '<em>Class Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see no.hal.jex.impl.JexPackageImpl#getClassName()
	 * @generated
	 */
	int CLASS_NAME = 20;

	/**
	 * The meta object id for the '<em>Features</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see no.hal.jex.impl.JexPackageImpl#getFeatures()
	 * @generated
	 */
	int FEATURES = 21;


	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaPack <em>Java Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Pack</em>'.
	 * @see no.hal.jex.JavaPack
	 * @generated
	 */
	EClass getJavaPack();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaPack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.jex.JavaPack#getName()
	 * @see #getJavaPack()
	 * @generated
	 */
	EAttribute getJavaPack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.jex.JavaPack#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see no.hal.jex.JavaPack#getClasses()
	 * @see #getJavaPack()
	 * @generated
	 */
	EReference getJavaPack_Classes();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaPack#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Location</em>'.
	 * @see no.hal.jex.JavaPack#getSourceLocation()
	 * @see #getJavaPack()
	 * @generated
	 */
	EAttribute getJavaPack_SourceLocation();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class</em>'.
	 * @see no.hal.jex.JavaClass
	 * @generated
	 */
	EClass getJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaClass#getClassKind <em>Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Kind</em>'.
	 * @see no.hal.jex.JavaClass#getClassKind()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_ClassKind();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.jex.JavaClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see no.hal.jex.JavaClass#getMembers()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Members();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.jex.JavaClass#getPack <em>Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pack</em>'.
	 * @see no.hal.jex.JavaClass#getPack()
	 * @see #getJavaClass()
	 * @generated
	 */
	EReference getJavaClass_Pack();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.jex.JavaClass#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Superclasses</em>'.
	 * @see no.hal.jex.JavaClass#getSuperclasses()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_Superclasses();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaField <em>Java Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Field</em>'.
	 * @see no.hal.jex.JavaField
	 * @generated
	 */
	EClass getJavaField();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.hal.jex.JavaField#getType()
	 * @see #getJavaField()
	 * @generated
	 */
	EAttribute getJavaField_Type();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Method</em>'.
	 * @see no.hal.jex.JavaMethod
	 * @generated
	 */
	EClass getJavaMethod();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see no.hal.jex.JavaMethod#getReturnType()
	 * @see #getJavaMethod()
	 * @generated
	 */
	EAttribute getJavaMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.jex.JavaMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see no.hal.jex.JavaMethod#getParameters()
	 * @see #getJavaMethod()
	 * @generated
	 */
	EAttribute getJavaMethod_Parameters();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.jex.JavaMethod#getThrowables <em>Throwables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Throwables</em>'.
	 * @see no.hal.jex.JavaMethod#getThrowables()
	 * @see #getJavaMethod()
	 * @generated
	 */
	EAttribute getJavaMethod_Throwables();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see no.hal.jex.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.Member#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.jex.Member#getName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.Member#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifiers</em>'.
	 * @see no.hal.jex.Member#getModifiers()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Modifiers();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.jex.Member#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see no.hal.jex.Member#getOwner()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Owner();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.Member#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see no.hal.jex.Member#getRequired()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Required();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Element</em>'.
	 * @see no.hal.jex.JavaElement
	 * @generated
	 */
	EClass getJavaElement();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaElement#getPresent <em>Present</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Present</em>'.
	 * @see no.hal.jex.JavaElement#getPresent()
	 * @see #getJavaElement()
	 * @generated
	 */
	EAttribute getJavaElement_Present();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaElement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see no.hal.jex.JavaElement#getTime()
	 * @see #getJavaElement()
	 * @generated
	 */
	EAttribute getJavaElement_Time();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaRequirement <em>Java Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Requirement</em>'.
	 * @see no.hal.jex.JavaRequirement
	 * @generated
	 */
	EClass getJavaRequirement();

	/**
	 * Returns the meta object for the reference '{@link no.hal.jex.JavaRequirement#getJavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Element</em>'.
	 * @see no.hal.jex.JavaRequirement#getJavaElement()
	 * @see #getJavaRequirement()
	 * @generated
	 */
	EReference getJavaRequirement_JavaElement();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JavaRequirement#getRequiredFeatures <em>Required Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Features</em>'.
	 * @see no.hal.jex.JavaRequirement#getRequiredFeatures()
	 * @see #getJavaRequirement()
	 * @generated
	 */
	EAttribute getJavaRequirement_RequiredFeatures();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JUnitTest <em>JUnit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUnit Test</em>'.
	 * @see no.hal.jex.JUnitTest
	 * @generated
	 */
	EClass getJUnitTest();

	/**
	 * Returns the meta object for the reference '{@link no.hal.jex.JUnitTest#getTestRunnable <em>Test Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Runnable</em>'.
	 * @see no.hal.jex.JUnitTest#getTestRunnable()
	 * @see #getJUnitTest()
	 * @generated
	 */
	EReference getJUnitTest_TestRunnable();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JUnitTest#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see no.hal.jex.JUnitTest#getPoints()
	 * @see #getJUnitTest()
	 * @generated
	 */
	EAttribute getJUnitTest_Points();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.JUnitTest#getTestStatus <em>Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Status</em>'.
	 * @see no.hal.jex.JUnitTest#getTestStatus()
	 * @see #getJUnitTest()
	 * @generated
	 */
	EAttribute getJUnitTest_TestStatus();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see no.hal.jex.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.Requirement#getSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfied</em>'.
	 * @see no.hal.jex.Requirement#getSatisfied()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Satisfied();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.Requirement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see no.hal.jex.Requirement#getTime()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Time();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.jex.Requirement#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messages</em>'.
	 * @see no.hal.jex.Requirement#getMessages()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Messages();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise</em>'.
	 * @see no.hal.jex.Exercise
	 * @generated
	 */
	EClass getExercise();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.ExercisePart <em>Exercise Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise Part</em>'.
	 * @see no.hal.jex.ExercisePart
	 * @generated
	 */
	EClass getExercisePart();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see no.hal.jex.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.AbstractRequirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see no.hal.jex.AbstractRequirement#getText()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Text();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.AbstractRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.jex.AbstractRequirement#getDescription()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.AbstractRequirement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see no.hal.jex.AbstractRequirement#getComment()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.jex.AbstractRequirement#getJavaElements <em>Java Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Elements</em>'.
	 * @see no.hal.jex.AbstractRequirement#getJavaElements()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_JavaElements();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.jex.AbstractRequirement#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see no.hal.jex.AbstractRequirement#getRequirements()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Requirements();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.jex.AbstractRequirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see no.hal.jex.AbstractRequirement#getParent()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.jex.AbstractRequirement#getChildrenSatisfied <em>Children Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children Satisfied</em>'.
	 * @see no.hal.jex.AbstractRequirement#getChildrenSatisfied()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_ChildrenSatisfied();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.TestRunnable <em>Test Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Runnable</em>'.
	 * @see no.hal.jex.TestRunnable
	 * @generated
	 */
	EClass getTestRunnable();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.jex.TestRunnable#getTestedElements <em>Tested Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tested Elements</em>'.
	 * @see no.hal.jex.TestRunnable#getTestedElements()
	 * @see #getTestRunnable()
	 * @generated
	 */
	EReference getTestRunnable_TestedElements();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaClassTester <em>Java Class Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class Tester</em>'.
	 * @see no.hal.jex.JavaClassTester
	 * @generated
	 */
	EClass getJavaClassTester();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.JavaMethodTester <em>Java Method Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Method Tester</em>'.
	 * @see no.hal.jex.JavaMethodTester
	 * @generated
	 */
	EClass getJavaMethodTester();

	/**
	 * Returns the meta object for class '{@link no.hal.jex.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see no.hal.jex.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.jex.TestSuite#getTestRuns <em>Test Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Runs</em>'.
	 * @see no.hal.jex.TestSuite#getTestRuns()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_TestRuns();

	/**
	 * Returns the meta object for enum '{@link no.hal.jex.ClassKind <em>Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Kind</em>'.
	 * @see no.hal.jex.ClassKind
	 * @generated
	 */
	EEnum getClassKind();

	/**
	 * Returns the meta object for enum '{@link no.hal.jex.JUnitTestStatus <em>JUnit Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JUnit Test Status</em>'.
	 * @see no.hal.jex.JUnitTestStatus
	 * @generated
	 */
	EEnum getJUnitTestStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Declaration Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDeclarationType();

	/**
	 * Returns the meta object for data type '<em>Modifiers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Modifiers</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getModifiers();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getClassName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Features</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getFeatures();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JexFactory getJexFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaPackImpl <em>Java Pack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaPackImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaPack()
		 * @generated
		 */
		EClass JAVA_PACK = eINSTANCE.getJavaPack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACK__NAME = eINSTANCE.getJavaPack_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PACK__CLASSES = eINSTANCE.getJavaPack_Classes();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_PACK__SOURCE_LOCATION = eINSTANCE.getJavaPack_SourceLocation();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaClassImpl <em>Java Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaClassImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaClass()
		 * @generated
		 */
		EClass JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
		 * The meta object literal for the '<em><b>Class Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__CLASS_KIND = eINSTANCE.getJavaClass_ClassKind();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__MEMBERS = eINSTANCE.getJavaClass_Members();

		/**
		 * The meta object literal for the '<em><b>Pack</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_CLASS__PACK = eINSTANCE.getJavaClass_Pack();

		/**
		 * The meta object literal for the '<em><b>Superclasses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__SUPERCLASSES = eINSTANCE.getJavaClass_Superclasses();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaFieldImpl <em>Java Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaFieldImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaField()
		 * @generated
		 */
		EClass JAVA_FIELD = eINSTANCE.getJavaField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FIELD__TYPE = eINSTANCE.getJavaField_Type();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaMethodImpl <em>Java Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaMethodImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaMethod()
		 * @generated
		 */
		EClass JAVA_METHOD = eINSTANCE.getJavaMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD__RETURN_TYPE = eINSTANCE.getJavaMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD__PARAMETERS = eINSTANCE.getJavaMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Throwables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD__THROWABLES = eINSTANCE.getJavaMethod_Throwables();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.MemberImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__MODIFIERS = eINSTANCE.getMember_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__OWNER = eINSTANCE.getMember_Owner();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__REQUIRED = eINSTANCE.getMember_Required();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaElementImpl <em>Java Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaElementImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaElement()
		 * @generated
		 */
		EClass JAVA_ELEMENT = eINSTANCE.getJavaElement();

		/**
		 * The meta object literal for the '<em><b>Present</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ELEMENT__PRESENT = eINSTANCE.getJavaElement_Present();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ELEMENT__TIME = eINSTANCE.getJavaElement_Time();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaRequirementImpl <em>Java Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaRequirementImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaRequirement()
		 * @generated
		 */
		EClass JAVA_REQUIREMENT = eINSTANCE.getJavaRequirement();

		/**
		 * The meta object literal for the '<em><b>Java Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REQUIREMENT__JAVA_ELEMENT = eINSTANCE.getJavaRequirement_JavaElement();

		/**
		 * The meta object literal for the '<em><b>Required Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_REQUIREMENT__REQUIRED_FEATURES = eINSTANCE.getJavaRequirement_RequiredFeatures();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JUnitTestImpl <em>JUnit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JUnitTestImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJUnitTest()
		 * @generated
		 */
		EClass JUNIT_TEST = eINSTANCE.getJUnitTest();

		/**
		 * The meta object literal for the '<em><b>Test Runnable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNIT_TEST__TEST_RUNNABLE = eINSTANCE.getJUnitTest_TestRunnable();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST__POINTS = eINSTANCE.getJUnitTest_Points();

		/**
		 * The meta object literal for the '<em><b>Test Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST__TEST_STATUS = eINSTANCE.getJUnitTest_TestStatus();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.RequirementImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFIED = eINSTANCE.getRequirement_Satisfied();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TIME = eINSTANCE.getRequirement_Time();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MESSAGES = eINSTANCE.getRequirement_Messages();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.ExerciseImpl <em>Exercise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.ExerciseImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getExercise()
		 * @generated
		 */
		EClass EXERCISE = eINSTANCE.getExercise();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.ExercisePartImpl <em>Exercise Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.ExercisePartImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getExercisePart()
		 * @generated
		 */
		EClass EXERCISE_PART = eINSTANCE.getExercisePart();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.AbstractRequirementImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__TEXT = eINSTANCE.getAbstractRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__DESCRIPTION = eINSTANCE.getAbstractRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__COMMENT = eINSTANCE.getAbstractRequirement_Comment();

		/**
		 * The meta object literal for the '<em><b>Java Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__JAVA_ELEMENTS = eINSTANCE.getAbstractRequirement_JavaElements();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__REQUIREMENTS = eINSTANCE.getAbstractRequirement_Requirements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__PARENT = eINSTANCE.getAbstractRequirement_Parent();

		/**
		 * The meta object literal for the '<em><b>Children Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED = eINSTANCE.getAbstractRequirement_ChildrenSatisfied();

		/**
		 * The meta object literal for the '{@link no.hal.jex.TestRunnable <em>Test Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.TestRunnable
		 * @see no.hal.jex.impl.JexPackageImpl#getTestRunnable()
		 * @generated
		 */
		EClass TEST_RUNNABLE = eINSTANCE.getTestRunnable();

		/**
		 * The meta object literal for the '<em><b>Tested Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RUNNABLE__TESTED_ELEMENTS = eINSTANCE.getTestRunnable_TestedElements();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaClassTesterImpl <em>Java Class Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaClassTesterImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaClassTester()
		 * @generated
		 */
		EClass JAVA_CLASS_TESTER = eINSTANCE.getJavaClassTester();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.JavaMethodTesterImpl <em>Java Method Tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JavaMethodTesterImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getJavaMethodTester()
		 * @generated
		 */
		EClass JAVA_METHOD_TESTER = eINSTANCE.getJavaMethodTester();

		/**
		 * The meta object literal for the '{@link no.hal.jex.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.TestSuiteImpl
		 * @see no.hal.jex.impl.JexPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Test Runs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TEST_RUNS = eINSTANCE.getTestSuite_TestRuns();

		/**
		 * The meta object literal for the '{@link no.hal.jex.ClassKind <em>Class Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.ClassKind
		 * @see no.hal.jex.impl.JexPackageImpl#getClassKind()
		 * @generated
		 */
		EEnum CLASS_KIND = eINSTANCE.getClassKind();

		/**
		 * The meta object literal for the '{@link no.hal.jex.JUnitTestStatus <em>JUnit Test Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.JUnitTestStatus
		 * @see no.hal.jex.impl.JexPackageImpl#getJUnitTestStatus()
		 * @generated
		 */
		EEnum JUNIT_TEST_STATUS = eINSTANCE.getJUnitTestStatus();

		/**
		 * The meta object literal for the '<em>Declaration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see no.hal.jex.impl.JexPackageImpl#getDeclarationType()
		 * @generated
		 */
		EDataType DECLARATION_TYPE = eINSTANCE.getDeclarationType();

		/**
		 * The meta object literal for the '<em>Modifiers</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.jex.impl.JexPackageImpl#getModifiers()
		 * @generated
		 */
		EDataType MODIFIERS = eINSTANCE.getModifiers();

		/**
		 * The meta object literal for the '<em>Class Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see no.hal.jex.impl.JexPackageImpl#getClassName()
		 * @generated
		 */
		EDataType CLASS_NAME = eINSTANCE.getClassName();

		/**
		 * The meta object literal for the '<em>Features</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see no.hal.jex.impl.JexPackageImpl#getFeatures()
		 * @generated
		 */
		EDataType FEATURES = eINSTANCE.getFeatures();

	}

} //JexPackage
