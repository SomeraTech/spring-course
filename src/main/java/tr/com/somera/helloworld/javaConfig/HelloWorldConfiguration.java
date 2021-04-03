package tr.com.somera.helloworld.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import tr.com.somera.helloworld.common.BasicMessageRenderer;
import tr.com.somera.helloworld.common.GenericMessageProvider;
import tr.com.somera.helloworld.common.HelloWorldMessageProvider;

@Configuration
@ImportResource(locations = {"classpath:spring/hello-world.xml"})
public class HelloWorldConfiguration {
    @Bean
    @Scope("prototype")
    HelloWorldMessageProvider primitiveProvider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    BasicMessageRenderer renderer() {
        BasicMessageRenderer renderer = new BasicMessageRenderer();
        renderer.setProvider(provider("This message is new"));
        return renderer;
    }

    @Bean
    GenericMessageProvider provider(@Value("#{provider.message}") String message) {
        return new GenericMessageProvider(message);
    }
}
