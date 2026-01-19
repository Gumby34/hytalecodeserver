package com.hypixel.hytale.server.worldgen.cache;

import com.hypixel.hytale.server.worldgen.container.UniquePrefabContainer;

@FunctionalInterface
public interface UniquePrefabFunction {
  UniquePrefabContainer.UniquePrefabEntry[] get(int paramInt);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\worldgen\cache\UniquePrefabCache$UniquePrefabFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */