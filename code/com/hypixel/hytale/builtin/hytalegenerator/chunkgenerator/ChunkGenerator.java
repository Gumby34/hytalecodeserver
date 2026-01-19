package com.hypixel.hytale.builtin.hytalegenerator.chunkgenerator;

import com.hypixel.hytale.server.core.universe.world.worldgen.GeneratedChunk;
import javax.annotation.Nonnull;

public interface ChunkGenerator {
  GeneratedChunk generate(@Nonnull ChunkRequest.Arguments paramArguments);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\chunkgenerator\ChunkGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */