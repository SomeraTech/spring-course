package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

@Component("genericProvider")
public class NewGenericMessageProvider implements MessageProvider {
    final String message;

    @Autowired
    public NewGenericMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
