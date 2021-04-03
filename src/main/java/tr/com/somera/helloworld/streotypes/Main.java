package tr.com.somera.helloworld.streotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

public class Main {
    @Configuration
    @ComponentScan(basePackages = {"tr.com.somera.helloworld.streotypes"})
    public static class StereotypeConfiguration {
        @Bean
        String message1() {
            return "My message";
        }
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(StereotypeConfiguration.class);
        MessageRenderer renderer = context.getBean("newMessageRenderer", MessageRenderer.class);
        renderer.render();

//        MessageProvider provider = context.getBean("genericProvider", MessageProvider.class);
//        System.out.println(provider.getMessage());
    }
}
