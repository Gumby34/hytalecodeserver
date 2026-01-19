/*    */ package io.netty.handler.codec.http3;
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
/*    */ 
/*    */ 
/*    */ public interface Http3HeadersFrame
/*    */   extends Http3RequestStreamFrame, Http3PushStreamFrame
/*    */ {
/*    */   default long type() {
/* 25 */     return 1L;
/*    */   }
/*    */   
/*    */   Http3Headers headers();
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\http3\Http3HeadersFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */