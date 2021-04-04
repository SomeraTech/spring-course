package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

@Service
//@Profile("profile1")
public class NewMessageRenderer implements MessageRenderer, InitializingBean, DisposableBean {
    MessageProvider provider;

    @Override
    @Autowired
    public void setProvider(@Qualifier("genericProvider") MessageProvider provider) {
        this.provider = provider;
        System.out.println("DEPENDENCY PROVIDER INJECTED");
    }

    @Override
    public MessageProvider getProvider() {
        return provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NewMessageRenderer - initialized in Spring container");
    }

    @Override
    public void destroy() {
        System.out.println("DESTROYING - NewMessageRenderer");
    }
}
