/*    */ package io.netty.handler.codec.quic;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public interface QuicResetTokenGenerator
/*    */ {
/*    */   ByteBuffer newResetToken(ByteBuffer paramByteBuffer);
/*    */   
/*    */   static QuicResetTokenGenerator signGenerator() {
/* 40 */     return HmacSignQuicResetTokenGenerator.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\quic\QuicResetTokenGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */