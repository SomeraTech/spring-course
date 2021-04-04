package tr.com.somera.helloworld.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ApplicationConfiguration.class,
                        ApplicationConfiguration.KinderGardenConfiguration.class,
                        ApplicationConfiguration.HighSchoolConfiguration.class
                );
//
//        MessageProvider provider = context.getBean("provider", MessageProvider.class);
//        System.out.println(provider.getMessage());

        final String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
