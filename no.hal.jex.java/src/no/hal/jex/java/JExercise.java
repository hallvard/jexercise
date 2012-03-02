package no.hal.jex.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})

public @interface JExercise {
	String tests();
	String description();
	int points() 			default 0;
	String[] topics()		default {};
}
