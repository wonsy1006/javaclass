package javaClass;

// p.269

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RUNTIME)
public @interface PrintAnnotation { 
	String value() default "#";	// 값을 전달받지 않으면 #을 찍어줌
	int number() default 20;	// 값을 전달받지 않으면 20을 찍어줌
}
