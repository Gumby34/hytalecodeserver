package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public interface ChunkedMacVerification {
  void update(ByteBuffer paramByteBuffer) throws GeneralSecurityException;
  
  void verifyMac() throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\mac\ChunkedMacVerification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */