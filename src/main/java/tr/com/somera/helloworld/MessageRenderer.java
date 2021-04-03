package tr.com.somera.helloworld;

public interface MessageRenderer {
    void setProvider(MessageProvider provider);
    MessageProvider getProvider();
    void render();
}
