package io.netty.channel;

import java.io.Serializable;

public interface ChannelId extends Serializable, Comparable<ChannelId> {
  String asShortText();
  
  String asLongText();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\ChannelId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */