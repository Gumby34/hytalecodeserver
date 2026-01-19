package io.netty.channel.unix;

import io.netty.channel.Channel;

public interface UnixChannel extends Channel {
  FileDescriptor fd();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channe\\unix\UnixChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */