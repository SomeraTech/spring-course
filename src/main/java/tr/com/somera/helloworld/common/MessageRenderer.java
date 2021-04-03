package tr.com.somera.helloworld.common;

public interface MessageRenderer {
    void setProvider(MessageProvider provider);
    MessageProvider getProvider();
    void render();
}
