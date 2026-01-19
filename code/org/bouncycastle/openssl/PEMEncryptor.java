package org.bouncycastle.openssl;

public interface PEMEncryptor {
  String getAlgorithm();
  
  byte[] getIV();
  
  byte[] encrypt(byte[] paramArrayOfbyte) throws PEMException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\openssl\PEMEncryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */