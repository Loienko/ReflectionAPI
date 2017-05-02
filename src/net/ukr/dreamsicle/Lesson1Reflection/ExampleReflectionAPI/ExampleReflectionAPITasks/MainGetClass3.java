package net.ukr.dreamsicle.Lesson1Reflection.ExampleReflectionAPI.ExampleReflectionAPITasks;

import java.io.File;
import java.lang.reflect.Modifier;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainGetClass3 {
    public static void main(String[] args) {
        File file = new File("a.txt");
        Class <?> fileClass = file.getClass();

        int mod = fileClass.getModifiers(); // получения модификаторов класса в виде int

        System.out.println(Integer.toBinaryString(mod));

        System.out.println("Public class" + Modifier.isPublic(mod));
        System.out.println("Private class" + Modifier.isPrivate(mod));
        System.out.println("Abstract class" + Modifier.isAbstract(mod));
    }
}
