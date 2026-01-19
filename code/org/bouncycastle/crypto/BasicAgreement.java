package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface BasicAgreement {
  void init(CipherParameters paramCipherParameters);
  
  int getFieldSize();
  
  BigInteger calculateAgreement(CipherParameters paramCipherParameters);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\BasicAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */