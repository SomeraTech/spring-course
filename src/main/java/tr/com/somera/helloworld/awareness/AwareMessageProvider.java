package tr.com.somera.helloworld.awareness;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

@Component("awareProvider")
public class AwareMessageProvider implements MessageProvider, BeanNameAware {
    String beanName;

    @Override
    public String getMessage() {
        return this.beanName + " says hello to you!";
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
