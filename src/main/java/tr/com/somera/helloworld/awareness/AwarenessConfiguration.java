package tr.com.somera.helloworld.awareness;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"tr.com.somera.helloworld.awareness"})
@PropertySource(value = {"classpath:application.properties"})
public class AwarenessConfiguration {
}
