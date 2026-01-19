package META-INF.versions.9.org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine;

interface SPHINCSPlusEngineProvider {
  int getN();
  
  SPHINCSPlusEngine get();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusEngineProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */