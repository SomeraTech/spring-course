package tr.com.somera.helloworld.common;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }

    public void init() {
        System.out.println("HelloWorldMessageProvider - Initiated in java config");
    }
}
