package no.hal.jex.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})

public @interface JExercise {
	public String tests() 			default "";
	public String description() 	default "";
	public String comment() 		default "";
	public String markupLanguage() 	default "";
	String[] tags() 				default {};
}
