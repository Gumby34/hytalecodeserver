package org.bouncycastle.est;

public interface TLSUniqueProvider {
  boolean isTLSUniqueAvailable();
  
  byte[] getTLSUnique();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\est\TLSUniqueProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */