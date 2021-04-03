package tr.com.somera.helloworld.common;


public class GenericMessageProvider implements MessageProvider {
    final String message;

    public GenericMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
