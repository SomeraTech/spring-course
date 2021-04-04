package tr.com.somera.helloworld.awareness;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import tr.com.somera.helloworld.common.MessageProvider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("awareProvider")
public class AwareMessageProvider implements MessageProvider, BeanNameAware {
    String beanName;

    @Override
    public String getMessage() {
        return this.beanName + " says hello to you!";
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name set for AwareMessageProvider");
        this.beanName = beanName;
    }

    @PostConstruct
    public void init() {
        System.out.println("AwareMessageProvider");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Aware Provider destroyed");
    }
}
