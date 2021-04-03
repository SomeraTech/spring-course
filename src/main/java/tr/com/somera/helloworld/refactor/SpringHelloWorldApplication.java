package tr.com.somera.helloworld.refactor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tr.com.somera.helloworld.common.BasicMessageRenderer;
import tr.com.somera.helloworld.common.GenericMessageProvider;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;
import tr.com.somera.helloworld.javaConfig.HelloWorldConfiguration;

public class SpringHelloWorldApplication {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring/hello-world.xml");
//
//        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
//
//        GenericMessageProvider provider = context.getBean("genericProvider", GenericMessageProvider.class);
//
//        renderer.render();
//
//        System.out.println(provider.getMessage());
//
//        MessageRenderer scRenderer = context.getBean("scRenderer", BasicMessageRenderer.class);
//        scRenderer.render();
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();

//        MessageProvider gProvider = context.getBean("genericProvider", MessageProvider.class);
//        System.out.println(gProvider.getMessage());

        MessageRenderer r = context.getBean("scRenderer", MessageRenderer.class);
        r.render();

        MessageProvider provider = context.getBean("primitiveProvider", MessageProvider.class);
    }
}
