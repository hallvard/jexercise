package no.hal.javafx.fxmlapp.lib;

public abstract class MessageSupport {

	protected CallbackSupport callbackSupport;
	
	protected MessageSupport(CallbackSupport callbackSupport) {
		setCallbackSupport(callbackSupport);
	}
	
	protected MessageSupport(Object callbackObject, String... callbackMethodNames) {
		this(new CallbackSupport(callbackObject, callbackMethodNames));
	}
	
	public void setCallbackSupport(CallbackSupport callbackSupport) {
		this.callbackSupport = callbackSupport;
	}

	protected void send(String separator, Object... args) {
		StringBuilder builder = new StringBuilder();
		for (Object arg : args) {
			if (builder.length() > 0) {
				builder.append(separator);
			}
			builder.append(arg);
		}
		send(builder);
	}

	protected abstract void send(StringBuilder builder);

	protected String toString(byte[] bytes) {
		return new String(bytes);
	}

	protected <T> T toValue(byte[] bytes, Class<T> valueClass) {
		return (T) callbackSupport.toValue(toString(bytes), valueClass);
	}

	protected byte[] toBytes(CharSequence chars) {
		return chars.toString().getBytes();
	}
}
