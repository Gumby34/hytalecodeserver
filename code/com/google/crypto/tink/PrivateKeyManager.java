package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.protobuf.ByteString;
import java.security.GeneralSecurityException;

public interface PrivateKeyManager<P> extends KeyManager<P> {
  KeyData getPublicKeyData(ByteString paramByteString) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\PrivateKeyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */