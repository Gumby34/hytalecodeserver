package io.netty.util;

@Deprecated
public interface ResourceLeak {
  void record();
  
  void record(Object paramObject);
  
  boolean close();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\nett\\util\ResourceLeak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */