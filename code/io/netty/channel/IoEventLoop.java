/*    */ package io.netty.channel;
/*    */ 
/*    */ import io.netty.util.concurrent.EventExecutor;
/*    */ import io.netty.util.concurrent.Future;
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
/*    */ public interface IoEventLoop
/*    */   extends EventLoop, IoEventLoopGroup
/*    */ {
/*    */   boolean isIoType(Class<? extends IoHandler> paramClass);
/*    */   
/*    */   boolean isCompatible(Class<? extends IoHandle> paramClass);
/*    */   
/*    */   Future<IoRegistration> register(IoHandle paramIoHandle);
/*    */   
/*    */   default IoEventLoop next() {
/* 28 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\channel\IoEventLoop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */