package net.ukr.dreamsicle.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Yura on 06.04.2017.
 */
public class TextContainer {

    @Retention(RetentionPolicy.RUNTIME)
    @interface SaveTo{
        String path();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Saver{}

    @SaveTo(path = "c:\\folder1\\1.txt")
    static class Container{
        String s = "Hello";

        @Saver
        public void save(String path) throws IOException {
            FileWriter w = new FileWriter(path);
            try {
                w.write(s);
            } finally {
                w.close();
            }

        }
    }
}
