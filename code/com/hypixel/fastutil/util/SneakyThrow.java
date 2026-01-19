/*    */ package com.hypixel.fastutil.util;
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
/*    */ public class SneakyThrow
/*    */ {
/*    */   public static RuntimeException sneakyThrow(Throwable t) {
/* 51 */     if (t == null) throw new NullPointerException("t"); 
/* 52 */     return sneakyThrow0(t);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T extends Throwable> T sneakyThrow0(Throwable t) throws T {
/* 57 */     throw (T)t;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\fastuti\\util\SneakyThrow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */