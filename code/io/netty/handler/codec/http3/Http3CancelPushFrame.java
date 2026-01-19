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
/*    */ public interface Http3CancelPushFrame
/*    */   extends Http3ControlStreamFrame
/*    */ {
/*    */   default long type() {
/* 25 */     return 3L;
/*    */   }
/*    */   
/*    */   long id();
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\http3\Http3CancelPushFrame.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */