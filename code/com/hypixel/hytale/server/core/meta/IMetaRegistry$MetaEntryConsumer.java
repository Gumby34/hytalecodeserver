package com.hypixel.hytale.server.core.meta;

@FunctionalInterface
public interface MetaEntryConsumer {
  <T> void accept(MetaKey<T> paramMetaKey, T paramT);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\meta\IMetaRegistry$MetaEntryConsumer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */