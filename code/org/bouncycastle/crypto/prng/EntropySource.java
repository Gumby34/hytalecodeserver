package org.bouncycastle.crypto.prng;

public interface EntropySource {
  boolean isPredictionResistant();
  
  byte[] getEntropy();
  
  int entropySize();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\prng\EntropySource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */