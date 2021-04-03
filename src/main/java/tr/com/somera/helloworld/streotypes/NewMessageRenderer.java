package tr.com.somera.helloworld.streotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.somera.helloworld.common.MessageProvider;
import tr.com.somera.helloworld.common.MessageRenderer;

@Service
public class NewMessageRenderer implements MessageRenderer {
    MessageProvider provider;

    @Override
    @Autowired
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getProvider() {
        return provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
