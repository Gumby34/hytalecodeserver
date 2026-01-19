package io.netty.channel;

import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.concurrent.OrderedEventExecutor;

public interface EventLoop extends OrderedEventExecutor, EventLoopGroup {
  EventLoopGroup parent();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\EventLoop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */