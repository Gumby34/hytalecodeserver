package io.netty.handler.codec.spdy;

public interface SpdyRstStreamFrame extends SpdyStreamFrame {
  SpdyStreamStatus status();
  
  SpdyRstStreamFrame setStatus(SpdyStreamStatus paramSpdyStreamStatus);
  
  SpdyRstStreamFrame setStreamId(int paramInt);
  
  SpdyRstStreamFrame setLast(boolean paramBoolean);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\spdy\SpdyRstStreamFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */