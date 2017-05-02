package net.ukr.dreamsicle.Lesson1Reflection.ExampleReflectionAPI.Worker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Yura on 01.05.2017.
 */
public class FileWorker {

    public String fileName;
    protected long size;
    private boolean isByteFile = true;
    private File file;

    public FileWorker(String fileName) {
        super();
        this.fileName = fileName;
        this.size = getFileSize(fileName);
    }

    private long getFileSize(String fileName) {
        this.file = new File(fileName);
        return file.length();
    }

    public void setByteFile(boolean byteFile) {
        isByteFile = byteFile;
    }

    public byte[] isByteFile() {
        if (!isByteFile){
            throw new IllegalArgumentException("The symbolic file");
        }
        byte[] byteArray = new byte[(int) this.file.length()];
        try (FileInputStream inputStream = new FileInputStream(this.file)){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return byteArray;
    }


}
