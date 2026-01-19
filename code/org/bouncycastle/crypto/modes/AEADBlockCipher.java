package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;

public interface AEADBlockCipher extends AEADCipher {
  BlockCipher getUnderlyingCipher();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\modes\AEADBlockCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */