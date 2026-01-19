package org.bouncycastle.operator.bc;

import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.params.KeyParameter;

public class BcAESSymmetricKeyWrapper extends BcSymmetricKeyWrapper {
  public BcAESSymmetricKeyWrapper(KeyParameter paramKeyParameter) {
    super(AESUtil.determineKeyEncAlg(paramKeyParameter), (Wrapper)new AESWrapEngine(), paramKeyParameter);
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\operator\bc\BcAESSymmetricKeyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */