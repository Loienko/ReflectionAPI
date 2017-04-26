package net.ukr.dreamsicle.Lesson1Reflection.task2;

import net.ukr.dreamsicle.Lesson1Reflection.task2.TextContainer.SaveTo;
import net.ukr.dreamsicle.Lesson1Reflection.task2.TextContainer.Saver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static net.ukr.dreamsicle.Lesson1Reflection.task2.TextContainer.*;


/**
 * Created by Yura on 06.04.2017..
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 который сохранит поле класса TextContainer в указанный файл.

 @SaveTo(path=“c:\\file.txt”)
 class TextContainer {
 String text = “…”;
 @Saver
 public void save(..) {…}
 }
 */
public class MainTask2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Container container = new Container();
        Class<?> clss = container.getClass();

        if (!clss.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Error");
            return;
        }

        SaveTo saveTo = clss.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] method = clss.getDeclaredMethods();

        for (Method method1 : method) {
            if (method1.isAnnotationPresent(Saver.class))
                method1.invoke(container, path);
            break;
        }

        System.out.println("Done");

    }
}
