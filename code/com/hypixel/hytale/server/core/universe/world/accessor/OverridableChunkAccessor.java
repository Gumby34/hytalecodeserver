package com.hypixel.hytale.server.core.universe.world.accessor;

public interface OverridableChunkAccessor<X extends BlockAccessor> extends ChunkAccessor<X> {
  void overwrite(X paramX);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\cor\\universe\world\accessor\OverridableChunkAccessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */