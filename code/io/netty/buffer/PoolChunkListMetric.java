package io.netty.buffer;

public interface PoolChunkListMetric extends Iterable<PoolChunkMetric> {
  int minUsage();
  
  int maxUsage();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\buffer\PoolChunkListMetric.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */