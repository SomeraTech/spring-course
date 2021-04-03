package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

@Component("genericProvider")
public class NewGenericMessageProvider implements MessageProvider, InitializingBean {
    final String message;

    @Autowired
    public NewGenericMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NewGenericMessageProvider initialized in Spring container.");
    }
}
