package tr.com.somera.helloworld.awareness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

import javax.annotation.PostConstruct;

@Component
@DependsOn("awareProvider")
public class AwareMessageRenderer implements MessageRenderer {
    MessageProvider provider;

    @PostConstruct
    public void init() {
        System.out.println("AwareMessageRenderer");
    }

    @Override
    @Autowired
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getProvider() {
        return provider;
    }

    @Override
    public void render() {
        System.out.println("Aware: " + provider.getMessage());
    }
}
