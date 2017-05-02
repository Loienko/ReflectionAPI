package net.ukr.dreamsicle.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Yura on 04.04.2017.
 * Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод
 * помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.
 * @Test(a=2, b=5)
 * public void test(int a, int b) {...}
 */
public class MainTask1 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //System.out.println(Testing.test(SomeClass.class, OtherClass.class));
        Testing testing = new Testing();
        Class clss = testing.getClass();
        System.out.println("Name class: " + clss.getName());

       // Constructor [] constructors = clss.getConstructors();

        Method [] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods in the class Testing: " + method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            System.out.println(" ");
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                int res = (Integer)method.invoke(clss, test.a(),test.b());
                System.out.println( "Sum: a + b - " + res);
            }
        }

    }

}
