package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
public interface JwtPublicKeyVerify {
  VerifiedJwt verifyAndDecode(String paramString, JwtValidator paramJwtValidator) throws GeneralSecurityException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\jwt\JwtPublicKeyVerify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */