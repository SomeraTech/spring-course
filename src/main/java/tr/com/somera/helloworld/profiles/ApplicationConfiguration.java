package tr.com.somera.helloworld.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import tr.com.somera.helloworld.common.GenericMessageProvider;
import tr.com.somera.helloworld.common.MessageProvider;

@Configuration
public class ApplicationConfiguration {

    @Configuration
    @PropertySource("classpath:kinderGarden.properties")
    @Profile(value = {"kinderGarden"})
    public static class KinderGardenConfiguration {
        @Bean
        MessageProvider provider(@Value("${welcomeMessage}") String message) {
            return new GenericMessageProvider(message);
        }
    }

    @Configuration
    @PropertySource("classpath:highSchool.properties")
    @Profile(value = {"highSchool"})
    public static class HighSchoolConfiguration {
        @Bean
        MessageProvider provider(@Value("${welcomeMessage}") String message) {
            return new GenericMessageProvider(message);
        }
    }
}
