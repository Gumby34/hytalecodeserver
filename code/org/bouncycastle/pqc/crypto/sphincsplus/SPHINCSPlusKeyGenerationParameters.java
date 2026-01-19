package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class SPHINCSPlusKeyGenerationParameters extends KeyGenerationParameters {
  private final SPHINCSPlusParameters parameters;
  
  public SPHINCSPlusKeyGenerationParameters(SecureRandom paramSecureRandom, SPHINCSPlusParameters paramSPHINCSPlusParameters) {
    super(paramSecureRandom, -1);
    this.parameters = paramSPHINCSPlusParameters;
  }
  
  SPHINCSPlusParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */