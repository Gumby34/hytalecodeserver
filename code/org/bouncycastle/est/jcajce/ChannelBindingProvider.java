package org.bouncycastle.est.jcajce;

import java.net.Socket;

public interface ChannelBindingProvider {
  boolean canAccessChannelBinding(Socket paramSocket);
  
  byte[] getChannelBinding(Socket paramSocket, String paramString);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\est\jcajce\ChannelBindingProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */