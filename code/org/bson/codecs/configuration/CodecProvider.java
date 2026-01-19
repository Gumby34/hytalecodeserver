package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

public interface CodecProvider {
  <T> Codec<T> get(Class<T> paramClass, CodecRegistry paramCodecRegistry);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\codecs\configuration\CodecProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */