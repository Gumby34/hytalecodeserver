package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Unmarshaller;

public interface UnmarshallerProvider {
  Unmarshaller getUnmarshaller(ChannelHandlerContext paramChannelHandlerContext) throws Exception;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\marshalling\UnmarshallerProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */