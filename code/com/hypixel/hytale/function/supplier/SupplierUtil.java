/*    */ package com.hypixel.hytale.function.supplier;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import javax.annotation.Nonnull;
/*    */ 
/*    */ 
/*    */ public class SupplierUtil
/*    */ {
/*    */   @Nonnull
/*    */   public static <T> CachedSupplier<T> cache(Supplier<T> delegate) {
/* 11 */     return new CachedSupplier<>(delegate);
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\function\supplier\SupplierUtil.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */