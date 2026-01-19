package com.nimbusds.jose;

public interface JWEEncrypter extends JWEProvider {
  JWECryptoParts encrypt(JWEHeader paramJWEHeader, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws JOSEException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\JWEEncrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */