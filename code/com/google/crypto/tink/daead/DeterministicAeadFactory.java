/*    */ package com.google.crypto.tink.daead;
/*    */ 
/*    */ import com.google.crypto.tink.DeterministicAead;
/*    */ import com.google.crypto.tink.KeysetHandle;
/*    */ import com.google.crypto.tink.RegistryConfiguration;
/*    */ import java.security.GeneralSecurityException;
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
/*    */ @Deprecated
/*    */ public final class DeterministicAeadFactory
/*    */ {
/*    */   @Deprecated
/*    */   public static DeterministicAead getPrimitive(KeysetHandle keysetHandle) throws GeneralSecurityException {
/* 50 */     DeterministicAeadWrapper.register();
/* 51 */     return (DeterministicAead)keysetHandle.getPrimitive(RegistryConfiguration.get(), DeterministicAead.class);
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\daead\DeterministicAeadFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */