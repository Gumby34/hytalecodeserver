/*    */ package com.google.crypto.tink;
/*    */ 
/*    */ import com.google.errorprone.annotations.CheckReturnValue;
/*    */ import com.google.errorprone.annotations.Immutable;
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
/*    */ @CheckReturnValue
/*    */ @Immutable
/*    */ public final class InsecureSecretKeyAccess
/*    */ {
/*    */   public static SecretKeyAccess get() {
/* 36 */     return SecretKeyAccess.instance();
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\InsecureSecretKeyAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */