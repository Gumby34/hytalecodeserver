package com.google.gson;

import java.lang.reflect.Type;

public interface JsonSerializer<T> {
  JsonElement serialize(T paramT, Type paramType, JsonSerializationContext paramJsonSerializationContext);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\gson\JsonSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */