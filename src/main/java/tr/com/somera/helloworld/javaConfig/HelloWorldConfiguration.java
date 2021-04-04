package tr.com.somera.helloworld.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import tr.com.somera.helloworld.common.BasicMessageRenderer;
import tr.com.somera.helloworld.common.GenericMessageProvider;
import tr.com.somera.helloworld.common.HelloWorldMessageProvider;

@Configuration
//@ImportResource(locations = {"classpath:spring/hello-world.xml"})
@Import(value = {})
@PropertySource(value = {"classpath:application.properties"})
public class HelloWorldConfiguration {
    @Bean(initMethod = "init")
    @Scope("prototype")
    HelloWorldMessageProvider primitiveProvider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    BasicMessageRenderer renderer() {
        BasicMessageRenderer renderer = new BasicMessageRenderer();
        renderer.setProvider(primitiveProvider());
        return renderer;
    }

    @Bean
    GenericMessageProvider provider(@Value("${message}") String message) {
        return new GenericMessageProvider(message);
    }
}
