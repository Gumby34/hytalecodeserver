package io.netty.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface Timer {
  Timeout newTimeout(TimerTask paramTimerTask, long paramLong, TimeUnit paramTimeUnit);
  
  Set<Timeout> stop();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\nett\\util\Timer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */