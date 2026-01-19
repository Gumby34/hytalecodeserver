/*    */ package io.netty.handler.codec.http.websocketx.extensions;
/*    */ 
/*    */ import io.netty.handler.codec.MessageToMessageEncoder;
/*    */ import io.netty.handler.codec.http.websocketx.WebSocketFrame;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class WebSocketExtensionEncoder
/*    */   extends MessageToMessageEncoder<WebSocketFrame>
/*    */ {
/*    */   public WebSocketExtensionEncoder() {
/* 26 */     super(WebSocketFrame.class);
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\http\websocketx\extensions\WebSocketExtensionEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */