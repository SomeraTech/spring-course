package tr.com.somera.helloworld;

import tr.com.somera.helloworld.common.*;

public class HelloWorldApplication {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new BasicMessageRenderer();

        MessageProvider scannerProvider = new ScannerProvider();

        renderer.setProvider(provider);
        renderer.render();

        renderer.setProvider(scannerProvider);
        renderer.render();
    }
}
