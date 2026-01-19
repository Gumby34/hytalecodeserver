package com.nimbusds.jose.jca;

public interface JCAAware<T extends JCAContext> {
  T getJCAContext();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jose\jca\JCAAware.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */