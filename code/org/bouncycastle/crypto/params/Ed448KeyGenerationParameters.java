package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class Ed448KeyGenerationParameters extends KeyGenerationParameters {
  public Ed448KeyGenerationParameters(SecureRandom paramSecureRandom) {
    super(paramSecureRandom, 448);
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\params\Ed448KeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */