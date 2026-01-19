/*    */ package com.hypixel.hytale.sneakythrow;
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface ThrowableRunnable<E extends Throwable>
/*    */   extends Runnable
/*    */ {
/*    */   default void run() {
/*    */     try {
/*  9 */       runNow();
/* 10 */     } catch (Throwable e) {
/* 11 */       throw SneakyThrow.sneakyThrow(e);
/*    */     } 
/*    */   }
/*    */   
/*    */   void runNow() throws E;
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\sneakythrow\ThrowableRunnable.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */