package com.hypixel.hytale.server.core.prefab.selection.buffer.impl;

import com.hypixel.hytale.component.Holder;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import javax.annotation.Nullable;

@FunctionalInterface
public interface EntityConsumer<T> {
  void accept(int paramInt1, int paramInt2, @Nullable Holder<EntityStore>[] paramArrayOfHolder, T paramT);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\prefab\selection\buffer\impl\IPrefabBuffer$EntityConsumer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */