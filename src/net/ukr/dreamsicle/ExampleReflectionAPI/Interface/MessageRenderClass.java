package net.ukr.dreamsicle.ExampleReflectionAPI.Interface;

/**
 * Created by Yura on 02.05.2017.
 */
public class MessageRenderClass implements RenderMessage{

    private MessageProvider mesprov = null;

    @Override
    public void renderMessage() {
        if (mesprov == null) {
            throw new IllegalArgumentException("Set message provider");
        }
        System.out.println(mesprov.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider mesprov) {
        this.mesprov = mesprov;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.mesprov;
    }
}
