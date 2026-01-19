/*    */ package com.github.luben.zstd;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ 
/*    */ public class NoPool
/*    */   implements BufferPool
/*    */ {
/*  9 */   public static final BufferPool INSTANCE = new NoPool();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ByteBuffer get(int paramInt) {
/* 16 */     return ByteBuffer.allocate(paramInt);
/*    */   }
/*    */   
/*    */   public void release(ByteBuffer paramByteBuffer) {}
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\github\luben\zstd\NoPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */