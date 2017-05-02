package net.ukr.dreamsicle.ExampleReflectionAPI.SendCloseType;


import net.ukr.dreamsicle.ExampleReflectionAPI.Worker.FileWorker;

import java.lang.reflect.Field;

/**
 * Created by Yura on 01.05.2017.
 */
public class MainCloseType {
    public static void main(String[] args) {
        FileWorker fw = new FileWorker("a.txt");
        Class <?> cl = fw.getClass();
        Field fieldOne = null;
        boolean isByteFile = false;
        try {
            fieldOne = cl.getDeclaredField("isByteFile");
            fieldOne.setAccessible(true);
            isByteFile = fieldOne.getBoolean(fw);
        } catch (NoSuchFieldException | SecurityException
                | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(isByteFile);
    }
}
