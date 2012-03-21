/**
 * 
 */
package no.hal.jex.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaField;
import no.hal.jex.JavaMethod;
import no.hal.jex.JavaPack;

public class ReflectionHelper {
	
	private ClassLoader reflectiveClassLoader;
	
	private ClassLoader getReflectiveClassLoader() {
		return (reflectiveClassLoader != null ? reflectiveClassLoader : this.getClass().getClassLoader());
	}
	
	public void setClassLoader(ClassLoader classLoader) {
		this.reflectiveClassLoader = classLoader;
	}

	public Class<?> getReflectiveClass(String className) throws ClassNotFoundException {
		ClassLoader classLoader = getReflectiveClassLoader();
//		try {
			return classLoader.loadClass(className);
//		} catch (ClassNotFoundException e) {
//			System.err.println("ReflectionHelper: Couldn't load " + className + " with " + classLoader);
//			e.printStackTrace();
//			throw new ClassNotFoundException(className);
//		}
	}

	public Object getReflectiveElement(JavaElement jexElement) {
		if (jexElement instanceof JavaClass) {
			String name = ((JavaClass) jexElement).getFullName();
			try {
				return getReflectiveClass(name);
			} catch (ClassNotFoundException e) {
			}
		} else if (jexElement instanceof JavaPack) {
			return Package.getPackage(((JavaPack) jexElement).getName());
		} else if (jexElement instanceof JavaMethod) {
			JavaMethod jexMethod = (JavaMethod) jexElement;
			Class<?> javaClass = (Class<?>) getReflectiveElement(jexMethod.getOwner());
			if (javaClass != null) {
				if (javaClass.getSimpleName().equals(jexMethod.getSimpleName())) {
					Constructor<?>[] javaConstructors = javaClass.getConstructors();
					for (int i = 0; i < javaConstructors.length; i++) {
						Constructor<?> cons = javaConstructors[i];
						if (ReflectiveRequirementChecker.validateTypes(null, jexMethod.getParameters(), null, cons.getGenericParameterTypes()) == Boolean.TRUE) {
							return cons;
						}
					}
				} else {
					Method method = findMethod(javaClass, jexMethod);
					if (method != null) {
						return method;
					}
				}
			}
		} else if (jexElement instanceof JavaField) {
			JavaField jexField = (JavaField) jexElement;
			Class<?> javaClass = (Class<?>) getReflectiveElement(jexField.getOwner());
			if (javaClass != null) {
				try {
					Field javaField = javaClass.getField(jexField.getSimpleName());
					if (ReflectiveRequirementChecker.testTypeString(jexField.getType(), javaField.getType()) == Boolean.TRUE) {
						return javaField;
					}
				} catch (SecurityException e) {
				} catch (NoSuchFieldException e) {
				}
			}
		}
		return null;
	}

	public Method findMethod(Class<?> javaClass, JavaMethod jexMethod) {
		if (javaClass == null || javaClass == Object.class) {
			return null;
		}
		Method[] javaMethods = javaClass.getDeclaredMethods();
		for (int i = 0; i < javaMethods.length; i++) {
			Method method = javaMethods[i];
			String jexMethodName = jexMethod.getSimpleName();
			if (method.getName().equals(jexMethodName)) {
				if (ReflectiveRequirementChecker.validateTypes(jexMethod.getReturnType(), jexMethod.getParameters(), method.getGenericReturnType(), method.getGenericParameterTypes()) == Boolean.TRUE) {
					return method;
				}
			}
		}
		return findMethod(javaClass.getSuperclass(), jexMethod);
	}
}
