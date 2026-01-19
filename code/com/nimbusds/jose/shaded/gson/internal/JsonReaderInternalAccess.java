package com.nimbusds.jose.shaded.gson.internal;

import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import java.io.IOException;

public abstract class JsonReaderInternalAccess {
  public static volatile JsonReaderInternalAccess INSTANCE;
  
  public abstract void promoteNameToValue(JsonReader paramJsonReader) throws IOException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\shaded\gson\internal\JsonReaderInternalAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */