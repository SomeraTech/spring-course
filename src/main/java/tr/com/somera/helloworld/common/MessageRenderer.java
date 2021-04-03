package tr.com.somera.helloworld.common;

import tr.com.somera.helloworld.common.MessageProvider;

public interface MessageRenderer {
    void setProvider(MessageProvider provider);
    MessageProvider getProvider();
    void render();
}
