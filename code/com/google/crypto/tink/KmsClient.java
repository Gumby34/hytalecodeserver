package com.google.crypto.tink;

import java.security.GeneralSecurityException;

public interface KmsClient {
  boolean doesSupport(String paramString);
  
  KmsClient withCredentials(String paramString) throws GeneralSecurityException;
  
  KmsClient withDefaultCredentials() throws GeneralSecurityException;
  
  Aead getAead(String paramString) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\KmsClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */