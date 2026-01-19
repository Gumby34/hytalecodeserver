package org.bson.internal;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;

interface CycleDetectingCodecRegistry extends CodecRegistry {
  <T> Codec<T> get(ChildCodecRegistry<T> paramChildCodecRegistry);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\internal\CycleDetectingCodecRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */