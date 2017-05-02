package net.ukr.dreamsicle.ExampleReflectionAPI.Interface;

/**
 * Created by Yura on 02.05.2017.
 */
public interface RenderMessage {
    public void renderMessage();
    public void setMessageProvider(MessageProvider mesprov);
    public MessageProvider getMessageProvider();

}
