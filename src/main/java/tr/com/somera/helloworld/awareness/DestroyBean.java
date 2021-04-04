package tr.com.somera.helloworld.awareness;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DestroyBean implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        System.out.println("DestroyBean");
    }

    public void getBeans() {
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext instanceof AnnotationConfigApplicationContext) {
//            ((AnnotationConfigApplicationContext) applicationContext).close();
            System.out.println("I can destroy you context!");
        }
        this.applicationContext = applicationContext;
    }
}
