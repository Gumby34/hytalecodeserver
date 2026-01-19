package io.netty.handler.codec.http.websocketx.extensions;

public interface WebSocketClientExtensionHandshaker {
  WebSocketExtensionData newRequestData();
  
  WebSocketClientExtension handshakeExtension(WebSocketExtensionData paramWebSocketExtensionData);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\http\websocketx\extensions\WebSocketClientExtensionHandshaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */