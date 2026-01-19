package org.bouncycastle.crypto.prng;

public interface RandomGenerator {
  void addSeedMaterial(byte[] paramArrayOfbyte);
  
  void addSeedMaterial(long paramLong);
  
  void nextBytes(byte[] paramArrayOfbyte);
  
  void nextBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\prng\RandomGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */