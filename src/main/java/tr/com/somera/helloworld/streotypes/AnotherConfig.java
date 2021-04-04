package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class AnotherConfig {
    @Bean
    String anotherMessage(@Value("${message}") String message) {
        return message;
    }

    @Bean
    int number() {
        return 1;
    }
}
