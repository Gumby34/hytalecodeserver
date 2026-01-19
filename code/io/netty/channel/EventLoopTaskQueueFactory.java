package io.netty.channel;

import java.util.Queue;

@Deprecated
public interface EventLoopTaskQueueFactory {
  Queue<Runnable> newTaskQueue(int paramInt);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\EventLoopTaskQueueFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */