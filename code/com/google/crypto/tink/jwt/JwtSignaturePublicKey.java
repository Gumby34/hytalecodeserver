package com.google.crypto.tink.jwt;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import java.util.Optional;

public abstract class JwtSignaturePublicKey extends Key {
  public abstract Optional<String> getKid();
  
  public abstract JwtSignatureParameters getParameters();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\jwt\JwtSignaturePublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */