package io.netty.handler.codec.spdy;

public interface SpdySynReplyFrame extends SpdyHeadersFrame {
  SpdySynReplyFrame setStreamId(int paramInt);
  
  SpdySynReplyFrame setLast(boolean paramBoolean);
  
  SpdySynReplyFrame setInvalid();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\spdy\SpdySynReplyFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */