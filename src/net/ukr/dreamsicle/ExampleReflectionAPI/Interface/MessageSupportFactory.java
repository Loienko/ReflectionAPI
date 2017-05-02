package net.ukr.dreamsicle.ExampleReflectionAPI.Interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Yura on 02.05.2017.
 */
public class MessageSupportFactory  {
    private MessageProvider mespro = null;
    private RenderMessage renmes = null;
    public MessageSupportFactory(File file) {
        super();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            mespro = (MessageProvider) Class.forName(br.readLine()).newInstance();
            renmes = (RenderMessage) Class.forName(br.readLine()).newInstance();
        } catch (IOException | InstantiationException | IllegalAccessException |
                ClassNotFoundException e) {
            System.out.println(e);
        }}
    public MessageProvider getMespro() {
        return mespro;
    } public RenderMessage getRenmes() {
        return renmes;
    }
}
