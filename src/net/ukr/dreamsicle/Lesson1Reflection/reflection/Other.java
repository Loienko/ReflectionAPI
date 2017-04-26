package net.ukr.dreamsicle.Lesson1Reflection.reflection;

/**
 * Created by Yura on 12.04.2017.
 */
public class Other {}

class Main {

    class My{}

    public static void main(String[] args) {
        final Integer i = 777;

        Class<?>cls1 = Integer.class;
        Class<?>cls2 = i.getClass();
        //Class<?>cls3 = i.class; ошибка
        Class<?>cls3 = My.class;
        Class<?>cls4 = Other.class;

        System.out.println("Integer.class: " + cls1 + ", i.getClass(): " + cls2 + ", My.class: " + cls3 + ", Other.class: " + cls4);
    }
}
