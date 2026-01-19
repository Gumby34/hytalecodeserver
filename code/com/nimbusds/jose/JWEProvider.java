package com.nimbusds.jose;

import com.nimbusds.jose.jca.JCAAware;
import com.nimbusds.jose.jca.JWEJCAContext;
import java.util.Set;

public interface JWEProvider extends JOSEProvider, JCAAware<JWEJCAContext> {
  Set<JWEAlgorithm> supportedJWEAlgorithms();
  
  Set<EncryptionMethod> supportedEncryptionMethods();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\JWEProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */