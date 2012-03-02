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
	
	private ClassLoader classLoader;
	
	private ClassLoader getClassLoader() {
		return (classLoader != null ? classLoader : this.getClass().getClassLoader());
	}
	
	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public Class<?> getClass(String superClass) throws ClassNotFoundException {
		return getClassLoader().loadClass(superClass);
	}

	public Object getReflectiveElement(JavaElement jexElement) {
		if (jexElement instanceof JavaClass) {
			String name = ((JavaClass) jexElement).getFullName();
			try {
				return Class.forName(name);
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
						if (ReflectiveRequirementChecker.validateTypes(null, jexMethod.getParameters(), null, cons.getParameterTypes()) == Boolean.TRUE) {
							return cons;
						}
					}
				} else {
					Method[] javaMethods = javaClass.getMethods();
					for (int i = 0; i < javaMethods.length; i++) {
						Method method = javaMethods[i];
						String jexMethodName = jexMethod.getSimpleName();
						if (method.getName().equals(jexMethodName)) {
							if (ReflectiveRequirementChecker.validateTypes(jexMethod.getReturnType(), jexMethod.getParameters(), method.getReturnType(), method.getParameterTypes()) == Boolean.TRUE) {
								return method;
							}
						}
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
}
