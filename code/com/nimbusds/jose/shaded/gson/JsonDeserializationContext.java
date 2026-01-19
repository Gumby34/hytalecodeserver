package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Type;

public interface JsonDeserializationContext {
  <T> T deserialize(JsonElement paramJsonElement, Type paramType) throws JsonParseException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\shaded\gson\JsonDeserializationContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */