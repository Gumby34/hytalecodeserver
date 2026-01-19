package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Marshaller;

public interface MarshallerProvider {
  Marshaller getMarshaller(ChannelHandlerContext paramChannelHandlerContext) throws Exception;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\marshalling\MarshallerProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */