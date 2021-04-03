package tr.com.somera.helloworld.common;

import tr.com.somera.helloworld.common.MessageProvider;

public class GenericMessageProvider implements MessageProvider {
    final String message;

    GenericMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
