package org.bouncycastle.crypto.ec;

import org.bouncycastle.crypto.CipherParameters;

public interface ECPairTransform {
  void init(CipherParameters paramCipherParameters);
  
  ECPair transform(ECPair paramECPair);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\ec\ECPairTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */