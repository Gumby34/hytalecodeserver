package com.github.luben.zstd;

import java.nio.ByteBuffer;

public interface BufferPool {
  ByteBuffer get(int paramInt);
  
  void release(ByteBuffer paramByteBuffer);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\github\luben\zstd\BufferPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */