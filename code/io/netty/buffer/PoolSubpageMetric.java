package io.netty.buffer;

public interface PoolSubpageMetric {
  int maxNumElements();
  
  int numAvailable();
  
  int elementSize();
  
  int pageSize();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\buffer\PoolSubpageMetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */