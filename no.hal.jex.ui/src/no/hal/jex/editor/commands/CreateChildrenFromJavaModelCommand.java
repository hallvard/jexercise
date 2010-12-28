package no.hal.jex.editor.commands;

import java.util.Iterator;
import java.util.List;

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
import no.hal.jex.impl.JavaClassImpl;
import no.hal.jex.impl.MemberImpl;
import no.hal.jex.resource.JexResource;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
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
			return MemberImpl.hasModifiers(member.getFlags(), modifiers);
		} catch (JavaModelException e) {
		}
		return false;
	}

	public final static String ALL_TESTS_TEST_SUITE_NAME = "AllTests";
	
	private void createChildrenFromJavaModel(JavaElement parent, IJavaElement javaElement, int depth) throws Exception {
		if (parent instanceof JavaPack && javaElement instanceof IPackageFragment) {
			JavaPack pack = (JavaPack)parent;
			List<IMember> classes = JavaClassImpl.findJavaMembers((IPackageFragment)javaElement, null, IJavaElement.TYPE, IType.class);
			createJavaClasses(classes, depth, pack.getClasses());
			createNamedClass(pack.getName() + "." + ALL_TESTS_TEST_SUITE_NAME, JexPackage.eINSTANCE.getTestSuite(), null, depth, pack.getClasses());
		} else if (parent instanceof JavaClass && javaElement instanceof IType) {
			JavaClass javaClass = (JavaClass)parent;
			IType type = (IType)javaElement;
			List<IMember> fields = JavaClassImpl.findJavaMembers(type, null, IJavaElement.FIELD, IField.class);
			for (Iterator it = fields.iterator(); it.hasNext();) {
				IField field = (IField)it.next();
				if (matchesModifiers(field)) {
					if (parent instanceof TestRunnable) {
						continue;
					}
					JavaField newField = (JavaField)ensureMember(JexPackage.eINSTANCE.getJavaField(), field, javaClass.getMembers());
				}
			}
			List<IMember> methods = JavaClassImpl.findJavaMembers(type, null, IJavaElement.METHOD, IMethod.class);
			for (Iterator it = methods.iterator(); it.hasNext();) {
				IMethod method = (IMethod)it.next();
				if (matchesModifiers(method)) {
					EClass methodClass = JexPackage.eINSTANCE.getJavaMethod();
					if (parent instanceof TestRunnable) {
						if (! isMethodTester(method)) {
							continue;
						}
						methodClass = JexPackage.eINSTANCE.getJavaMethodTester();
					}
					JavaMethod newMethod = (JavaMethod)ensureMember(methodClass, method, javaClass.getMembers());
					// clear type if method is a constructor
					if (newMethod.getSimpleName().equals(javaClass.getSimpleName())) {
						newMethod.setReturnType(null);
					}
					if (newMethod instanceof JavaMethodTester && parent instanceof JavaClassTester) {
						Member testedMethod = findTestedMethod(newMethod.getSimpleName(), ((JavaClass)((JavaClassTester)parent).getTestedElement()).getMembers());
						((JavaMethodTester)newMethod).setTestedElement(testedMethod);
					}
				}
			}
			List classes = JavaClassImpl.findJavaMembers(type, null, IJavaElement.TYPE, IType.class);
			createJavaClasses(classes, depth, javaClass.getMembers());
		}
	}

	private Member findTestedMethod(String methodName, List members) {
		String testMethodNamePrefix = "test";
		if (methodName.startsWith(testMethodNamePrefix)) {
			methodName = methodName.substring(testMethodNamePrefix.length());
		}
		for (Iterator it = members.iterator(); it.hasNext();) {
			Member member = (Member)it.next();
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

	private List createJavaClasses(List classes, int depth, List results) throws JavaModelException, Exception {
		for (Iterator it = classes.iterator(); it.hasNext();) {
			IType type = (IType) it.next();
			if (matchesModifiers(type)) {
				JavaClass newClass = (JavaClass)ensureMember(JexPackage.eINSTANCE.getJavaClass(), type, results);
				if (depth != 0) {
					createChildrenFromJavaModel(newClass, type, depth - 1);
				}
				JavaClassTester testClass = (JavaClassTester)createNamedClass(newClass.getFullName() + TEST_CLASS_NAME_SUFFIX, JexPackage.eINSTANCE.getJavaClassTester(), newClass, depth, results);
			}
		}
		return results;
	}

	private JavaClass createNamedClass(String name, EClass eClass, Member testedElement, int depth, List results) throws JavaModelException, Exception {
		IType type = JavaClassImpl.findJavaClassCoreElement(JexResource.getJavaProject(parent.eResource()), name);
		if (type != null && matchesModifiers(type)) {
			JavaClass newClass = (JavaClass)ensureMember(eClass, type, results);
			if (newClass instanceof TestRunnable) {
				((TestRunnable)newClass).setTestedElement(testedElement);
			}
			if (depth != 0) {
				createChildrenFromJavaModel(newClass, type, depth - 1);
			}
			return newClass;
		}
		return null;
	}

	private Member ensureMember(EClass eClass, IMember member, List otherMembers) throws JavaModelException {
		Member newMember = (Member)eClass.getEPackage().getEFactoryInstance().create(eClass);
		newMember.initFrom(member);
		// reuse existing element, if it exists
		if (otherMembers != null) {
			for (int i = 0; i < otherMembers.size(); i++) {
				Member otherMember = (Member)otherMembers.get(i);
				if (newMember.overrides(otherMember)) {
					otherMember.initFrom(member);
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
			IJavaProject javaProject = JexResource.getJavaProject(parent.eResource());
			javaElement = parent.findJavaCoreElement(javaProject);
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
