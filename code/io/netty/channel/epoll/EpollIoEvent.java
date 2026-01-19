package io.netty.channel.epoll;

import io.netty.channel.IoEvent;

public interface EpollIoEvent extends IoEvent {
  EpollIoOps ops();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\epoll\EpollIoEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */