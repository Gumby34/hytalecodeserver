package com.hypixel.hytale.server.core.prefab.selection.buffer;

import com.hypixel.hytale.server.core.prefab.selection.buffer.impl.PrefabBuffer;
import java.nio.file.Path;

public interface PrefabBufferDeserializer<T> {
  PrefabBuffer deserialize(Path paramPath, T paramT);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\prefab\selection\buffer\PrefabBufferDeserializer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */