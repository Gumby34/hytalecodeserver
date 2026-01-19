package com.hypixel.hytale.server.worldgen.cache;

import com.hypixel.hytale.server.worldgen.chunk.ZoneBiomeResult;

@FunctionalInterface
public interface ZoneBiomeResultFunction {
  ZoneBiomeResult compute(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\worldgen\cache\ChunkGeneratorCache$ZoneBiomeResultFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */