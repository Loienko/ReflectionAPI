package net.ukr.dreamsicle.ExampleReflectionAPI.Interface;

import java.io.File;

/**
 * Created by Yura on 02.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MessageSupportFactory msf = new MessageSupportFactory(new
                File("config.txt"));
        MessageProvider mprov = msf.getMespro();
        RenderMessage renMes = msf.getRenmes();
        renMes.setMessageProvider(mprov);
        renMes.renderMessage();
    }
}
