package com.nimbusds.jose.shaded.gson;

import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import java.io.IOException;

public interface ToNumberStrategy {
  Number readNumber(JsonReader paramJsonReader) throws IOException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\shaded\gson\ToNumberStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */