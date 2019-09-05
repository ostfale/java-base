package de.ostfale.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Example annotation
 * Created :  05.09.2019
 *
 * @author : Uwe Sauerbrei
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Todo {

    public enum Priority {LOW, MEDIUM, HIGH}

    public enum Status {STARTED, NOT_STARTED}

    String author() default "Loki";

    Priority priority() default Priority.LOW;

    Status status() default Status.NOT_STARTED;
}
