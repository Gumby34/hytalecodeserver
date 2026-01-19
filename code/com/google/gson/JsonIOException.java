/*    */ package com.google.gson;
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
/*    */ public final class JsonIOException
/*    */   extends JsonParseException
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public JsonIOException(String msg) {
/* 29 */     super(msg);
/*    */   }
/*    */   
/*    */   public JsonIOException(String msg, Throwable cause) {
/* 33 */     super(msg, cause);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public JsonIOException(Throwable cause) {
/* 43 */     super(cause);
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\gson\JsonIOException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */