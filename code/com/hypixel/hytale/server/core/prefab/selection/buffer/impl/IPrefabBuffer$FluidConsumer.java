package com.hypixel.hytale.server.core.prefab.selection.buffer.impl;

@FunctionalInterface
public interface FluidConsumer<T> {
  void accept(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte, T paramT);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\prefab\selection\buffer\impl\IPrefabBuffer$FluidConsumer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */