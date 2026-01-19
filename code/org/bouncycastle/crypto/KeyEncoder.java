package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface KeyEncoder {
  byte[] getEncoded(AsymmetricKeyParameter paramAsymmetricKeyParameter);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\KeyEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */