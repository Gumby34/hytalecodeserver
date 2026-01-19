package io.netty.buffer;

public interface PoolChunkMetric {
  int usage();
  
  int chunkSize();
  
  int freeBytes();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\buffer\PoolChunkMetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */