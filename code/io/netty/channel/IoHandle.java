package io.netty.channel;

public interface IoHandle extends AutoCloseable {
  void handle(IoRegistration paramIoRegistration, IoEvent paramIoEvent);
  
  default void registered() {}
  
  default void unregistered() {}
  
  void close() throws Exception;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\IoHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */