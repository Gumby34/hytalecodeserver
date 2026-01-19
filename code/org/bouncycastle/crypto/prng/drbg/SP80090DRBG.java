package org.bouncycastle.crypto.prng.drbg;

public interface SP80090DRBG {
  int getBlockSize();
  
  int generate(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean);
  
  void reseed(byte[] paramArrayOfbyte);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\prng\drbg\SP80090DRBG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */