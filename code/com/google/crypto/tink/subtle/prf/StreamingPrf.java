package com.google.crypto.tink.subtle.prf;

import com.google.errorprone.annotations.Immutable;
import java.io.InputStream;

@Immutable
public interface StreamingPrf {
  InputStream computePrf(byte[] paramArrayOfbyte);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\subtle\prf\StreamingPrf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */