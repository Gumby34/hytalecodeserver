package com.google.crypto.tink;

import java.security.GeneralSecurityException;

public interface DeterministicAead {
  byte[] encryptDeterministically(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws GeneralSecurityException;
  
  byte[] decryptDeterministically(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\DeterministicAead.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */