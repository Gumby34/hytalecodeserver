/*    */ package it.unimi.dsi.fastutil.booleans;
/*    */ 
/*    */ import java.util.function.BinaryOperator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface BooleanBinaryOperator
/*    */   extends BinaryOperator<Boolean>
/*    */ {
/*    */   @Deprecated
/*    */   default Boolean apply(Boolean x, Boolean y) {
/* 60 */     return Boolean.valueOf(apply(x.booleanValue(), y.booleanValue()));
/*    */   }
/*    */   
/*    */   boolean apply(boolean paramBoolean1, boolean paramBoolean2);
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\i\\unimi\dsi\fastutil\booleans\BooleanBinaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */