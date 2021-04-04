package tr.com.somera.helloworld.streotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

public class Main {
    @Configuration
    @ComponentScan(basePackages = {"tr.com.somera.helloworld.streotypes"})
    @PropertySource(value = {"classpath:application.properties"})
    public static class StereotypeConfiguration {
        @Bean
        String message() {
            return "My message";
        }

        @Bean(initMethod = "init", destroyMethod = "destroy")
        AnotherMessageProvider anotherProvider() {
            return new AnotherMessageProvider();
        }
    }

    public static void main(String[] args) {
        System.out.println("CONTEXT CREATION STARTED");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StereotypeConfiguration.class);
        MessageRenderer renderer = context.getBean("newMessageRenderer", MessageRenderer.class);

        System.out.println("RENDER METHOD CALLED");
        renderer.render();

//        System.out.println("GENERIC PROVIDER PULLED");
//        MessageProvider provider = context.getBean("genericProvider", MessageProvider.class);
//        System.out.println(provider.getMessage());

//        int number = context.getBean("number", Integer.class);
//        System.out.println(number);

        MessageProvider provider = context.getBean("provider", MessageProvider.class);

        context.close();

    }
}
