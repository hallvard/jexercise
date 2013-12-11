package no.hal.jex.runtime;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})

public @interface JExercise {
	String tests()		default "";
	String markupLanguage() default "";
	String description();
	String comment()	default "";
	int points() 		default 0;
	String[] tags()		default {};
}
