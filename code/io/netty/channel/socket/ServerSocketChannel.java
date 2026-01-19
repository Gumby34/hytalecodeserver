package io.netty.channel.socket;

import io.netty.channel.ChannelConfig;
import io.netty.channel.ServerChannel;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public interface ServerSocketChannel extends ServerChannel {
  ServerSocketChannelConfig config();
  
  InetSocketAddress localAddress();
  
  InetSocketAddress remoteAddress();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\socket\ServerSocketChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */