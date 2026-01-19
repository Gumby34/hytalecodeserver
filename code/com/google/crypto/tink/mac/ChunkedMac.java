package com.google.crypto.tink.mac;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
public interface ChunkedMac {
  ChunkedMacComputation createComputation() throws GeneralSecurityException;
  
  ChunkedMacVerification createVerification(byte[] paramArrayOfbyte) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\mac\ChunkedMac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */