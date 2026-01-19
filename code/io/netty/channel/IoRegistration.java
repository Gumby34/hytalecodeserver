package io.netty.channel;

public interface IoRegistration {
  <T> T attachment();
  
  long submit(IoOps paramIoOps);
  
  boolean isValid();
  
  boolean cancel();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\IoRegistration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */