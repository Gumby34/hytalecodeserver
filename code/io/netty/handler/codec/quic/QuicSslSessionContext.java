package io.netty.handler.codec.quic;

import javax.net.ssl.SSLSessionContext;

public interface QuicSslSessionContext extends SSLSessionContext {
  void setTicketKeys(SslSessionTicketKey... paramVarArgs);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\quic\QuicSslSessionContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */