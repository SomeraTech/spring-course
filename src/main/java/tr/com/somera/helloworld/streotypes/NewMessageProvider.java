package tr.com.somera.helloworld.streotypes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("provider")
@Lazy
public class NewMessageProvider implements MessageProvider {

    @PostConstruct
    public void init() {
        System.out.println("NewMessageProvider - initialized in Spring container");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROYING - NewMessageProvider");
    }

    @Override
    public String getMessage() {
        return "New Message";
    }
}
