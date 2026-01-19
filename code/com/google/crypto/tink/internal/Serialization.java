package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;

@Immutable
public interface Serialization {
  Bytes getObjectIdentifier();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\internal\Serialization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */