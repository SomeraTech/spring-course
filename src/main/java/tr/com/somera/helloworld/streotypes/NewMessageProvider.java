package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

@Component("provider")
public class NewMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "New Message ";
    }
}
