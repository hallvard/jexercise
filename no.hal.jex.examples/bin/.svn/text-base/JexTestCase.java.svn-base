package jexutil;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import junit.framework.TestCase;

public class JexTestCase extends TestCase {

    protected static Object getVariable(Object object, String variableName) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (variableName.equals(field.getName())) {
                field.setAccessible(true);
                try {
                    Object value = field.get(object);
                    return value;
                } catch (Exception e) {
                }
            }
        }
        return null;
    }
    
	protected void testPrintingMethod(Class clazz, String methodName, Class[] methodParams, Object[] args, String expectedResult) {
		CapturingSystemOutStream capturingOut = new CapturingSystemOutStream(true);
		String result = null;
		try {
			Method m = findMethod(clazz, methodName, methodParams);
			m.invoke(null, (Object[])args);
		} catch (RuntimeException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			result = capturingOut.stopCapturing();
		}
		assertTrue(result + " didn't match " + expectedResult, result.matches(expectedResult));
	}

	private Method findMethod(Class clazz, String methodName, Class[] methodParams) throws Exception {
		Method m = null;
		Exception ex = null;
		try {
			m = clazz.getDeclaredMethod(methodName, (Class[])methodParams);
		} catch (Exception e) {
			ex = e;
		}
		if (m == null) {
			throw (ex != null ? ex : new NoSuchMethodException(clazz.getName() + "." + methodName));
		}
		return m;
	}

	protected void testMain(Class<? extends Object> mainClass, String[] args, String expectedResult) {
		testPrintingMethod(mainClass, "main", new Class[]{String[].class}, new Object[]{args}, expectedResult);
	}
}
