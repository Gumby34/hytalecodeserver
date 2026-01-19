package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ECPrivateKeyParameters extends ECKeyParameters {
  private final BigInteger d;
  
  public ECPrivateKeyParameters(BigInteger paramBigInteger, ECDomainParameters paramECDomainParameters) {
    super(true, paramECDomainParameters);
    this.d = paramECDomainParameters.validatePrivateScalar(paramBigInteger);
  }
  
  public BigInteger getD() {
    return this.d;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\crypto\params\ECPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */