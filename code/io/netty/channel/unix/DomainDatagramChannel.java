package io.netty.channel.unix;

import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import java.net.SocketAddress;

public interface DomainDatagramChannel extends UnixChannel, Channel {
  DomainDatagramChannelConfig config();
  
  boolean isConnected();
  
  DomainSocketAddress localAddress();
  
  DomainSocketAddress remoteAddress();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channe\\unix\DomainDatagramChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */