package tr.com.somera.helloworld.awareness;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = {"tr.com.somera.helloworld.awareness"})
@PropertySource(value = {"classpath:application.properties"})
public class AwarenessConfiguration {
    @PostConstruct
    public void init() {
        System.out.println("AwarenessConfiguration");
    }

    @Bean
    String message(@Value("${message}") String message) {
        return message;
    }
}
