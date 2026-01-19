package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class ECKeyGenerationParameters extends KeyGenerationParameters {
  private ECDomainParameters domainParams;
  
  public ECKeyGenerationParameters(ECDomainParameters paramECDomainParameters, SecureRandom paramSecureRandom) {
    super(paramSecureRandom, paramECDomainParameters.getN().bitLength());
    this.domainParams = paramECDomainParameters;
  }
  
  public ECDomainParameters getDomainParameters() {
    return this.domainParams;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\params\ECKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */