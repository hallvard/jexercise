package no.hal.javafx.fxmlapp.lib;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;

public class CallbackSupport {

	private final Object callbackObject;
	private List<String> callbackMethodNames = new ArrayList<>();
	private boolean runLater;
	
	public CallbackSupport(Object callbackObject, String... callbackMethodNames) {
		this.callbackObject = callbackObject;
		for (int i = 0; i < callbackMethodNames.length; i++) {
			String callbackMethodName = callbackMethodNames[i];
			if (callbackMethodName.startsWith("#")) {
				callbackMethodName = callbackMethodName.substring(1);
			}
			this.callbackMethodNames.add(callbackMethodName);
		}
		this.runLater = Platform.isFxApplicationThread();
	}

	public Object callback(String... args) {
		for (Method method : callbackObject.getClass().getMethods()) {
			if (callbackMethodNames.contains(method.getName())) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				if (args.length == parameterTypes.length) {
					Object[] values = toValues(args, parameterTypes);
					if (values != null) {
						try {
							return callback(method, values);
						} catch (Exception e) {
							throw new RuntimeException(e);
						}
					}
				}
			}
		}
		return null;
	}

	protected Object callback(Method method, Object[] values) throws IllegalAccessException, InvocationTargetException {
		if (runLater) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					try {
						method.invoke(callbackObject, values);
					} catch (Exception e) {
					}
				}
			});
			return null;
		} else {
			return method.invoke(callbackObject, values);
		}
	}

	public Object[] toValues(String[] args, Class<?>[] types) {
		Object[] values = new Object[args.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = toValue(args[i], types[i]);
		}
		return values;
	}
	
	private List<Object> valueHandlers = new ArrayList<Object>();

	protected void registerValueHandler(Class<?> valueClass, Object handler) {
		valueHandlers.add(0, handler);
		valueHandlers.add(0, valueClass);
	}
	{
		registerValueHandler(boolean.class,	Boolean.class);
		registerValueHandler(int.class, 	Integer.class);
		registerValueHandler(double.class, 	Double.class);
		registerValueHandler(char.class,	Character.class);
		registerValueHandler(byte.class, 	Byte.class);
		registerValueHandler(short.class, 	Short.class);
		registerValueHandler(long.class, 	Long.class);
		registerValueHandler(float.class, 	Float.class);
	}
	
	private final static Class<?>[] STRING_PARAMAMETER_TYPES = { String.class }; 
	
	public Object toValue(String arg, Class<?> valueClass) {
		Object handler = valueClass;
		for (int i = 0; i < valueHandlers.size(); i += 2) {
			if (handler == valueHandlers.get(i)) {
				handler = valueHandlers.get(i + 1);
			}
		}
		Class<?> handlerClass = (handler instanceof Class<?> ? (Class<?>) handler : handler.getClass());
		try {
			Method valueOfMethod = handlerClass.getMethod("valueOf", STRING_PARAMAMETER_TYPES);
			return valueOfMethod.invoke((handler == handlerClass ? null : handler), new Object[]{arg});
		} catch (Exception e) {
		}
		try {
			Constructor<?> cons = handlerClass.getConstructor(STRING_PARAMAMETER_TYPES);
			return cons.newInstance(new Object[]{arg});
		} catch (Exception e) {
		}
		return null;
	}
	
	private static void assertEquals(String expected, Object actual) {
		if (expected == actual || (expected != null && expected.equals(String.valueOf(actual)))) {
			return;
		}
		throw new AssertionError("Expected " + expected + ", was " + actual);
	}
	
	public static void main(String[] args) {
		Object handler = new Object() {
			public String receive1(String s) 					{ return s; }
			public String receive1(String s, int i) 			{ return s + ": " + i; }
			public String receive2(boolean b, long l, double d) { return b + ": " + (l + d); }
		};
		CallbackSupport messageSupport = new CallbackSupport(handler, "receive1", "receive2");
		assertEquals("hei", messageSupport.callback("hei"));
		assertEquals("svaret: 42", messageSupport.callback("svaret", "42"));
		assertEquals("true: 43.5", messageSupport.callback("true", "42", "1.5"));
	}
}
