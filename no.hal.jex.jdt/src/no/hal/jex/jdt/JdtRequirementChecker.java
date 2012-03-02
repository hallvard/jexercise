package no.hal.jex.jdt;

import java.util.List;
import java.util.Map;

import no.hal.jex.ClassKind;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.Member;
import no.hal.jex.eval.AbstractRequirementChecker;
import no.hal.jex.impl.MemberImpl;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class JdtRequirementChecker extends AbstractRequirementChecker {

	protected Object getRealJavaElement(JavaElement jexElement) {
		return JdtHelper.getJdtElement(jexElement);
	}

	//

	private static boolean testTypeString(String s1, String s2) {
		if (s1 == null) {
			return true;
		}
		if (s1.equals(s2)) {
			return true;
		}
		if (Signature.createTypeSignature(s1, false).equals(s2) ||
			Signature.createTypeSignature(s1, true).equals(s2)) {
			return true;
		}
		if (s1.indexOf('.') >= 0 && s2.indexOf('.') < 0) {
			s1 = MemberImpl.getSimpleName(s1);
			if (Signature.createTypeSignature(s1, false).equals(s2) ||
				Signature.createTypeSignature(s1, true).equals(s2)) {
				return true;
			}
		}
		return false;
	}

	//
	
	private static boolean isClassKind(ClassKind kind, IType jdtElement) {
		try {
			switch (kind) {
			case CLASS_KIND: return jdtElement.isClass();
			case INTERFACE_KIND: return jdtElement.isInterface();
			case ENUM_KIND: return jdtElement.isEnum();
			}
		} catch (JavaModelException e) {
		}
		return false;
	}

	private Boolean validateSuperclasses(JavaClass jexClass, IType jdtType) {
		outer: for (String superClass: jexClass.getSuperclasses()) {
			try {
				if (superClass.equals(jdtType.getSuperclassName())) {
					continue;
				}
				String[] interfaceNames = jdtType.getSuperInterfaceNames();
				for (int j = 0; j < interfaceNames.length; j++) {
					if (superClass.equals(interfaceNames[j])) {
						continue outer;
					}
				}
				return Boolean.FALSE;
			} catch (JavaModelException e) {
				return null;
			}
		}
		return Boolean.TRUE;
	}

	private static Boolean validateTypes(List<String> types, String[] types2, boolean isOrdered) {
		if (types == null) {
			return Boolean.TRUE;
		}
		if (isOrdered && types2.length != types.size()) {
			return Boolean.FALSE;
		}
		for (int i = 0; i < types.size(); i++) {
			String type = (String)types.get(i);
			if (isOrdered) {
				if (! testTypeString(type, types2[i])) {
					return Boolean.FALSE;
				}
			} else {
				for (int j = 0; j < types2.length; j++) {
					if (! testTypeString(type, types2[j])) {
						return Boolean.FALSE;
					}
				}
			}
		}
		return Boolean.TRUE;
	}

	public static Boolean validateTypes(String returnType, List<String> parameterTypes, IMethod jdtMethod) {
		if (returnType != null) {
			try {
				if (! testTypeString(returnType, jdtMethod.getReturnType())) {
					return Boolean.FALSE;
				}
			} catch (JavaModelException e) {
				return null;
			}
		}
		return validateTypes(parameterTypes, jdtMethod.getParameterTypes(), true);
	}

	protected Boolean correctTypes(Member jexMember) {
		IJavaElement jdtElement = JdtHelper.getJdtElement(jexMember);
		Boolean typesResult = Boolean.TRUE;
		if (jexMember instanceof JavaClass && jdtElement instanceof IType) {
			if (! isClassKind(((JavaClass) jexMember).getClassKind(), (IType) jdtElement)) {
				typesResult = Boolean.FALSE;
			}
			typesResult = satisfiedAnd(typesResult, validateSuperclasses(((JavaClass) jexMember), ((IType) jdtElement)));
		} else if (jexMember instanceof JavaMethod && jdtElement instanceof IMethod) {
			JavaMethod jexMethod = (JavaMethod) jexMember;
			IMethod jdtMethod = (IMethod) jdtElement;
			Boolean result = validateTypes(jexMethod.getReturnType(), jexMethod.getParameters(), jdtMethod);
			if (result != Boolean.TRUE) {
				typesResult = result;
			} else {
				try {
					typesResult = validateTypes(jexMethod.getThrowables(), jdtMethod.getExceptionTypes(), false);
				} catch (JavaModelException e) {
					typesResult = null;
				}
			}
		} else if (jexMember instanceof JavaField && jdtElement instanceof IField) {
			try {
				typesResult = Boolean.valueOf(testTypeString(((JavaField) jexMember).getType(), ((IField) jdtElement).getTypeSignature()));
			} catch (JavaModelException e) {
				typesResult = null;
			}
		}
		return typesResult;
	}

	//

	protected int getRealModifiers(Member jexMember) {
		Object jdtElement = getRealJavaElement(jexMember);
		if (jdtElement instanceof IMember) {
			try {
				return ((IMember) jdtElement).getFlags();
			} catch (JavaModelException e) {
			}
		}
		return -1;
	}

	protected Map<String, Integer> getRealModifiersMap() {
		return null;
	}
}
