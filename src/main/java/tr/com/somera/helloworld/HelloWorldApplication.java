package tr.com.somera.helloworld;

public class HelloWorldApplication {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new BasicMessageRenderer();

        renderer.setProvider(provider);
        renderer.render();
    }
}
