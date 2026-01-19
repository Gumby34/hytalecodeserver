/*    */ package com.google.protobuf;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class NewInstanceSchemaFull
/*    */   implements NewInstanceSchema
/*    */ {
/*    */   public Object newInstance(Object defaultInstance) {
/* 13 */     return ((Message)defaultInstance).toBuilder().buildPartial();
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\protobuf\NewInstanceSchemaFull.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */