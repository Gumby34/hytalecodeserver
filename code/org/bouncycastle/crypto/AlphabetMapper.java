package org.bouncycastle.crypto;

public interface AlphabetMapper {
  int getRadix();
  
  byte[] convertToIndexes(char[] paramArrayOfchar);
  
  char[] convertToChars(byte[] paramArrayOfbyte);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\AlphabetMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */