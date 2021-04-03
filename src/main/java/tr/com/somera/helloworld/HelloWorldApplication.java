package tr.com.somera.helloworld;

import tr.com.somera.helloworld.common.BasicMessageRenderer;
import tr.com.somera.helloworld.common.HelloWorldMessageProvider;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

public class HelloWorldApplication {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new BasicMessageRenderer();

        renderer.setProvider(provider);
        renderer.render();
    }
}
