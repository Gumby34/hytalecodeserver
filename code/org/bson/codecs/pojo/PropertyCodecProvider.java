package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

public interface PropertyCodecProvider {
  <T> Codec<T> get(TypeWithTypeParameters<T> paramTypeWithTypeParameters, PropertyCodecRegistry paramPropertyCodecRegistry);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\codecs\pojo\PropertyCodecProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */