package org.bouncycastle.crypto;

public interface Xof extends ExtendedDigest {
  int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  int doOutput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\Xof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */