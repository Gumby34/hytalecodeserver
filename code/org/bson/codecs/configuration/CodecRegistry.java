package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

public interface CodecRegistry extends CodecProvider {
  <T> Codec<T> get(Class<T> paramClass);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\codecs\configuration\CodecRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */