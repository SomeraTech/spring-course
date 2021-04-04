package tr.com.somera.helloworld.common;

public class ConstructMessageRenderer implements MessageRenderer {
    MessageProvider provider;

    public ConstructMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    @Deprecated
    public void setProvider(MessageProvider provider) {
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
