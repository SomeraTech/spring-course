package tr.com.somera.helloworld.refactor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tr.com.somera.helloworld.common.BasicMessageRenderer;
import tr.com.somera.helloworld.common.GenericMessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

public class SpringHelloWorldApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/hello-world.xml");

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);

        GenericMessageProvider provider = context.getBean("genericProvider", GenericMessageProvider.class);

        renderer.render();

        System.out.println(provider.getMessage());

        MessageRenderer scRenderer = context.getBean("scRenderer", BasicMessageRenderer.class);
        scRenderer.render();
    }
}
