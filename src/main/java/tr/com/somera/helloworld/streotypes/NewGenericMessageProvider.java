package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

@Component("genericProvider")
@Lazy
public class NewGenericMessageProvider implements MessageProvider, InitializingBean {
    final String message;

    @Autowired
    public NewGenericMessageProvider(@Qualifier("message") String message) {
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
