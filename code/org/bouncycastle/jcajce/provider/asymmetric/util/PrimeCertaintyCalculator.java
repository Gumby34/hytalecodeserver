package org.bouncycastle.jcajce.provider.asymmetric.util;

public class PrimeCertaintyCalculator {
  public static int getDefaultCertainty(int paramInt) {
    return (paramInt <= 1024) ? 80 : (96 + 16 * (paramInt - 1) / 1024);
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\jcajce\provider\asymmetri\\util\PrimeCertaintyCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */