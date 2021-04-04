package tr.com.somera.helloworld.awareness;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tr.com.somera.helloworld.common.MessageProvider;

public class AwarenessApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwarenessConfiguration.class);
        MessageProvider awareProvider = context.getBean("awareProvider", MessageProvider.class);
        System.out.println(awareProvider.getMessage());
    }
}
