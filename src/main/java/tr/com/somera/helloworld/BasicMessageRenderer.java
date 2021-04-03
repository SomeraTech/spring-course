package tr.com.somera.helloworld;

public class BasicMessageRenderer implements MessageRenderer {
    MessageProvider provider;

    @Override
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getProvider() {
        return provider;
    }

    @Override
    public void render() {
        if (provider == null) {
            throw new IllegalArgumentException("Provider should be set");
        }
        System.out.println(provider.getMessage());
    }
}
