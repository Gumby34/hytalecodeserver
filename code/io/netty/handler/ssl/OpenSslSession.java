package io.netty.handler.ssl;

import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

public interface OpenSslSession extends SSLSession {
  boolean hasPeerCertificates();
  
  OpenSslSessionContext getSessionContext();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\ssl\OpenSslSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */