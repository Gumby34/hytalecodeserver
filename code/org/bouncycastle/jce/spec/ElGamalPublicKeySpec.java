package org.bouncycastle.jce.spec;

import java.math.BigInteger;

public class ElGamalPublicKeySpec extends ElGamalKeySpec {
  private BigInteger y;
  
  public ElGamalPublicKeySpec(BigInteger paramBigInteger, ElGamalParameterSpec paramElGamalParameterSpec) {
    super(paramElGamalParameterSpec);
    this.y = paramBigInteger;
  }
  
  public BigInteger getY() {
    return this.y;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\jce\spec\ElGamalPublicKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */