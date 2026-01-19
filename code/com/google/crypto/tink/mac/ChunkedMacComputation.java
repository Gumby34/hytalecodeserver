package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public interface ChunkedMacComputation {
  void update(ByteBuffer paramByteBuffer) throws GeneralSecurityException;
  
  byte[] computeMac() throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\mac\ChunkedMacComputation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */