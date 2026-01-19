/*    */ package com.google.protobuf;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ interface MutabilityOracle
/*    */ {
/* 12 */   public static final MutabilityOracle IMMUTABLE = new MutabilityOracle()
/*    */     {
/*    */       public void ensureMutable()
/*    */       {
/* 16 */         throw new UnsupportedOperationException();
/*    */       }
/*    */     };
/*    */   
/*    */   void ensureMutable();
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\protobuf\MutabilityOracle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */