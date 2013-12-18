package no.hal.jex.editor.commands;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import no.hal.jex.ClassKind;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaClassTester;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaMethodTester;
import no.hal.jex.JavaPack;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;
import no.hal.jex.impl.MemberImpl;
import no.hal.jex.jdt.JdtRequirementChecker;
import no.hal.jex.jdt.JdtHelper;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class CreateChildrenFromJavaModelCommand extends AbstractCommand
	implements CommandActionDelegate {

	private JavaElement parent;
	private boolean recursive;
	private int modifiers;

	public CreateChildrenFromJavaModelCommand(no.hal.jex.JavaElement parent, int modifiers, boolean recursive) {
		this.parent = parent;
		this.recursive = recursive;
		this.modifiers = modifiers;
	}
	
	private IJavaElement javaElement;
	
	public void execute() {
		try {
			createChildrenFromJavaModel(parent, javaElement, recursive ? -1 : 1);
		} catch (Exception e) {
		}
	}

	private boolean matchesModifiers(IMember member) {
		try {
			return JdtRequirementChecker.hasModifiers(member.getFlags(), modifiers);
		} catch (JavaModelException e) {
		}
		return false;
	}

	public final static String ALL_TESTS_TEST_SUITE_NAME = "AllTests";
	
	private void createChildrenFromJavaModel(JavaElement parent, IJavaElement javaElement, int depth) throws Exception {
		if (parent instanceof JavaPack && javaElement instanceof IPackageFragment) {
			JavaPack pack = (JavaPack)parent;
			List<IMember> classes = JdtHelper.findJavaMembers((IPackageFragment) javaElement, null, IJavaElement.TYPE, IType.class);
			createJexClasses(classes, depth, pack.getClasses());
			createNamedClass(pack.getName() + "." + ALL_TESTS_TEST_SUITE_NAME, JexPackage.eINSTANCE.getTestSuite(), null, depth, pack.getClasses());
		} else if (parent instanceof JavaClass && javaElement instanceof IType) {
			JavaClass javaClass = (JavaClass)parent;
			IType type = (IType)javaElement;
			List<IMember> fields = JdtHelper.findJavaMembers(type, null, IJavaElement.FIELD, IField.class);
			for (Iterator<IMember> it = fields.iterator(); it.hasNext();) {
				IField field = (IField) it.next();
				if (matchesModifiers(field)) {
					if (parent instanceof TestRunnable) {
						continue;
					}
					ensureJexMember(JexPackage.eINSTANCE.getJavaField(), field, javaClass.getMembers());
				}
			}
			List<IMember> methods = JdtHelper.findJavaMembers(type, null, IJavaElement.METHOD, IMethod.class);
			for (Iterator<IMember> it = methods.iterator(); it.hasNext();) {
				IMethod method = (IMethod)it.next();
				if (matchesModifiers(method)) {
					EClass methodClass = JexPackage.eINSTANCE.getJavaMethod();
					if (parent instanceof TestRunnable) {
						if (! isMethodTester(method)) {
							continue;
						}
						methodClass = JexPackage.eINSTANCE.getJavaMethodTester();
					}
					JavaMethod newMethod = (JavaMethod)ensureJexMember(methodClass, method, javaClass.getMembers());
					// clear type if method is a constructor
					if (newMethod.getSimpleName().equals(javaClass.getSimpleName())) {
						newMethod.setReturnType(null);
					}
					if (newMethod instanceof JavaMethodTester && parent instanceof JavaClassTester) {
						for (Member member : ((JavaClassTester) parent).getTestedElements()) {
							Member testedMethod = findTestedMethod(newMethod.getSimpleName(), ((JavaClass) member).getMembers());
							if (testedMethod != null) {
								((JavaMethodTester) newMethod).getTestedElements().add(testedMethod);
							}
						}
					}
				}
			}
			List<IMember> classes = JdtHelper.findJavaMembers(type, null, IJavaElement.TYPE, IType.class);
			createJexClasses(classes, depth, javaClass.getMembers());
		}
	}

	private Member findTestedMethod(String methodName, List<? extends Member> members) {
		String testMethodNamePrefix = "test";
		if (methodName.startsWith(testMethodNamePrefix)) {
			methodName = methodName.substring(testMethodNamePrefix.length());
		}
		for (Member member : members) {
			if (methodName.equals(member.getSimpleName())) {
				return member;
			}
		}
		return null;
	}
	
	public final static String TEST_METHOD_NAME_PREFIX = "test";

	public static boolean isMethodTester(IMethod method) {
		try {
			return method.getElementName().startsWith(TEST_METHOD_NAME_PREFIX) &&
				Signature.SIG_VOID.equals(method.getReturnType()) &&
				method.getParameterTypes().length == 0 &&
				Flags.isPublic(method.getFlags());
		} catch (JavaModelException e) {
		}
		return false;
	}

	public final static String TEST_CLASS_NAME_SUFFIX = "Test";

	private List<? extends Member> createJexClasses(List<IMember> classes, int depth, List<? extends Member> results) throws JavaModelException, Exception {
		for (Iterator<IMember> it = classes.iterator(); it.hasNext();) {
			IType type = (IType) it.next();
			if (matchesModifiers(type)) {
				JavaClass newClass = (JavaClass) ensureJexMember(JexPackage.eINSTANCE.getJavaClass(), type, results);
				if (depth != 0) {
					createChildrenFromJavaModel(newClass, type, depth - 1);
				}
				createNamedClass(newClass.getFullName() + TEST_CLASS_NAME_SUFFIX, JexPackage.eINSTANCE.getJavaClassTester(), newClass, depth, results);
			}
		}
		return results;
	}

	private JavaClass createNamedClass(String name, EClass eClass, Member testedElement, int depth, List<? extends Member> results) throws JavaModelException, Exception {
		IType type = JdtHelper.findJdtClass(name, JdtHelper.getJavaProject(testedElement.eResource().getURI()));
		if (type != null && matchesModifiers(type)) {
			JavaClass newClass = (JavaClass) ensureJexMember(eClass, type, results);
			if (newClass instanceof TestRunnable) {
				((TestRunnable) newClass).getTestedElements().add(testedElement);
			}
			if (depth != 0) {
				createChildrenFromJavaModel(newClass, type, depth - 1);
			}
			return newClass;
		}
		return null;
	}

	public static void initFrom(Member jexMember, IMember jdtMember) throws JavaModelException {
		jexMember.setName(jdtMember.getElementName());
		jexMember.setModifiers(jdtMember.getFlags());
		if (jexMember instanceof JavaClass) {
			if (! (jdtMember instanceof IType)) {
				throw new IllegalArgumentException("Cannot init JavaClass from " + jdtMember);
			}
			JavaClass jexClass = (JavaClass) jexMember;
			IType jdtType = (IType) jdtMember;
			ClassKind kind = ClassKind.CLASS_KIND;
			if (jdtType.isInterface()) {
				kind = ClassKind.INTERFACE_KIND;
			} else if (jdtType.isEnum()) {
				kind = ClassKind.ENUM_KIND;
			}
			jexClass.setClassKind(kind);
			String superclassName = jdtType.getSuperclassName();
			if (superclassName != null && (! "Object".equals(superclassName))) {
				jexClass.getSuperclasses().add(superclassName);
			}
			jexClass.getSuperclasses().addAll(Arrays.asList(jdtType.getSuperInterfaceNames()));
		} else if (jexMember instanceof JavaMethod) {
			if (! (jdtMember instanceof IMethod)) {
				throw new IllegalArgumentException("Cannot init JavaMethod from " + jdtMember);
			}
			JavaMethod javaMethod = (JavaMethod) jexMember;
			javaMethod.getParameters().clear();
			IMethod method = (IMethod)jdtMember;
			String[] types = method.getParameterTypes();
			for (int i = 0; i < types.length; i++) {
				javaMethod.getParameters().add(Signature.toString(types[i]));
			}
			javaMethod.setReturnType(Signature.toString(method.getReturnType()));
			javaMethod.getThrowables().addAll(Arrays.asList(method.getExceptionTypes()));
		} else if (jexMember instanceof JavaField) {
			if (! (jdtMember instanceof IField)) {
				throw new IllegalArgumentException("Cannot init JavaField from " + jdtMember);
			}
			JavaField javaField = (JavaField) jexMember;
			javaField.setType(Signature.toString(((IField) jdtMember).getTypeSignature()));
		}
	}
	
	private <T extends Member> Member ensureJexMember(EClass eClass, IMember member, List<T> otherMembers) throws JavaModelException {
		T newMember = (T) eClass.getEPackage().getEFactoryInstance().create(eClass);
		initFrom(newMember, member);
		// reuse existing element, if it exists
		if (otherMembers != null) {
			for (int i = 0; i < otherMembers.size(); i++) {
				Member otherMember = (Member)otherMembers.get(i);
				if (newMember.overrides(otherMember)) {
					initFrom(otherMember, member);
					return otherMember;
				}
			}
			otherMembers.add(newMember);
		}
		return newMember;
	}

	public void redo() {
	}

	@Override
	protected boolean prepare() {
		javaElement = null;
		try {
			javaElement = JdtHelper.getJdtElement(parent);
		} catch (RuntimeException e) {
		}
		if (javaElement instanceof IPackageFragment) {
			return true;
		} else if (javaElement instanceof IType) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		return ("Create " + MemberImpl.getModifierString(modifiers)).trim() + " children, based on Java model" + (recursive ? ", recursively" : "");
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return getDescription();
	}

	public String getToolTipText() {
		return getDescription();
	}
}
