package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

public interface XDHPrivateKey extends XDHKey, PrivateKey {
  XDHPublicKey getPublicKey();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\jcajce\interfaces\XDHPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */