package META-INF.versions.9.org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec;

public interface HQCKey extends Key {
  HQCParameterSpec getParameterSpec();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\interfaces\HQCKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */