package org.bouncycastle.pqc.crypto.xwing;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class XWingKeyGenerationParameters extends KeyGenerationParameters {
  public XWingKeyGenerationParameters(SecureRandom paramSecureRandom) {
    super(paramSecureRandom, 128);
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\pqc\crypto\xwing\XWingKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */