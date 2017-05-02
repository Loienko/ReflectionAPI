package net.ukr.dreamsicle.ExampleReflectionAPI.Worker;

import java.lang.reflect.Field;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainWorker {
    public static void main(String[] args) {
        FileWorker fileWorker = new FileWorker("a.txt");

        Class<?> fileClass = fileWorker.getClass();

        Field [] fields = fileClass.getDeclaredFields();

        System.out.println("All fields on class: " + fileClass.getName() + "\n");

        for (Field field : fields) {
            Class<?> aClass = field.getType();
            System.out.println(field.getName() + " - " + aClass.getName());
        }

        System.out.println("One field in class - " + fileClass.getName() + "\n");
        Field fieldOne;

        try {
            fieldOne = fileClass.getDeclaredField("isByteFile");
            System.out.println(fieldOne.getType() + " - " + fieldOne.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
