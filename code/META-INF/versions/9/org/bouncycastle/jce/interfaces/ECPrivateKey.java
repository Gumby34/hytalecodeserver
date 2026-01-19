package META-INF.versions.9.org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import org.bouncycastle.jce.interfaces.ECKey;

public interface ECPrivateKey extends ECKey, PrivateKey {
  BigInteger getD();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\META-INF\versions\9\org\bouncycastle\jce\interfaces\ECPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */