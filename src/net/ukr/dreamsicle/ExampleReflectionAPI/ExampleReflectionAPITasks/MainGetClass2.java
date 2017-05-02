package net.ukr.dreamsicle.ExampleReflectionAPI.ExampleReflectionAPITasks;

import java.io.File;

/**
 * Created by Yura on 30.04.2017.
 */
public class MainGetClass2 {
    public static void main(String[] args) {
        File file = new File("a.txt");//создаем экземпляр класса

        Class<?> aClass = file.getClass(); // получения класс обьекта

        Class<?> superClass = aClass.getSuperclass();

        System.out.println(superClass.getName());

        Class<?> [] implementsInterface = aClass.getInterfaces();

        for (Class<?> aClass1 : implementsInterface) {
            System.out.println(aClass.toString());
        }
    }
}
