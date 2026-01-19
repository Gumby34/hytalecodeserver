package org.bson.codecs;

import org.bson.BsonType;

public interface RepresentationConfigurable<T> {
  BsonType getRepresentation();
  
  Codec<T> withRepresentation(BsonType paramBsonType);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\codecs\RepresentationConfigurable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */