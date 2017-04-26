package net.ukr.dreamsicle.Lesson1Reflection.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Yura on 04.04.2017.
 */

@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Test {
    int a();
    int b();
}
