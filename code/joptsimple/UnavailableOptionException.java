/*    */ package joptsimple;
/*    */ 
/*    */ import java.util.List;
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
/*    */ class UnavailableOptionException
/*    */   extends OptionException
/*    */ {
/*    */   private static final long serialVersionUID = -1L;
/*    */   
/*    */   UnavailableOptionException(List<? extends OptionSpec<?>> forbiddenOptions) {
/* 38 */     super(forbiddenOptions);
/*    */   }
/*    */ 
/*    */   
/*    */   Object[] messageArguments() {
/* 43 */     return new Object[] { multipleOptionString() };
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\joptsimple\UnavailableOptionException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */