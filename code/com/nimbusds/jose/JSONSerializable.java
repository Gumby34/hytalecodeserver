package com.nimbusds.jose;

import java.util.Map;

public interface JSONSerializable {
  Map<String, Object> toGeneralJSONObject();
  
  Map<String, Object> toFlattenedJSONObject();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\JSONSerializable.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */