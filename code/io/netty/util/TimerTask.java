package io.netty.util;

public interface TimerTask {
  void run(Timeout paramTimeout) throws Exception;
  
  default void cancelled(Timeout timeout) {}
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\nett\\util\TimerTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */