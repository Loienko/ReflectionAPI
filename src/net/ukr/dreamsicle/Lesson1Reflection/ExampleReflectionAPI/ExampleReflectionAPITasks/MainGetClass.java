package net.ukr.dreamsicle.Lesson1Reflection.ExampleReflectionAPI.ExampleReflectionAPITasks;

import java.util.Scanner;

/**
 * Created by Yura on 30.04.2017.
 */
public class MainGetClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Class<?> classTwo = Scanner.class; // вызов для класса

        Class<?> classOne = sc.getClass(); // вызов для обьекта

        Class<?> classThree = null;
        try {
            classThree = Class.forName("java.util.Scanner"); // получаю по имени
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(classOne);

        System.out.println(classTwo);

        System.out.println(classThree);

        sc.close();
    }
}
