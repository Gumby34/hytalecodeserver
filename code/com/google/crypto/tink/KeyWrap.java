package com.google.crypto.tink;

import java.security.GeneralSecurityException;

public interface KeyWrap {
  byte[] wrap(byte[] paramArrayOfbyte) throws GeneralSecurityException;
  
  byte[] unwrap(byte[] paramArrayOfbyte) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\KeyWrap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */