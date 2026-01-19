package org.bouncycastle.crypto;

public interface CharToByteConverter {
  String getType();
  
  byte[] convert(char[] paramArrayOfchar);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\CharToByteConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */