package org.bouncycastle.crypto;

public interface AsymmetricCipherKeyPairGenerator {
  void init(KeyGenerationParameters paramKeyGenerationParameters);
  
  AsymmetricCipherKeyPair generateKeyPair();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\AsymmetricCipherKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */