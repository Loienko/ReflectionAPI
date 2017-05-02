package net.ukr.dreamsicle.ExampleReflectionAPI.GenericExample;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * Created by Yura on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        GenericClass<String> someClass = new GenericClass<String>("Hello world");

        Class<?> genericClass = someClass.getClass();

        TypeVariable<?>[] typeArray = genericClass.getTypeParameters();

        for (TypeVariable<?> typeVariable : typeArray) {
            System.out.println(typeVariable);
        }

        try {
            Method classMethod = genericClass.getMethod("plus", Number.class, Number.class);

            TypeVariable<?>[] methodTypeArray = classMethod.getTypeParameters();

            for (TypeVariable<?> typeVariable : methodTypeArray) {
                System.out.println(typeVariable + " - " + typeVariable.getBounds()[0]);
            }
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
