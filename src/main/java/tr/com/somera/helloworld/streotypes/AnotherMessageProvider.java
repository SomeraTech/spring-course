package tr.com.somera.helloworld.streotypes;

import tr.com.somera.helloworld.common.MessageProvider;

public class AnotherMessageProvider implements MessageProvider {

    public void init() {
        System.out.println("Initialized anotherMessageProvider");
    }

    public void destroy() {
        System.out.println("Destroyed anotherMessageProvider");
    }

    @Override
    public String getMessage() {
        return "Another message from another message provider";
    }
}
