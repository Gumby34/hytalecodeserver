/*    */ package com.google.crypto.tink.signature;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public final class PublicKeySignConfig
/*    */ {
/*    */   @Deprecated
/*    */   public static void registerStandardKeyTypes() throws GeneralSecurityException {
/* 50 */     SignatureConfig.register();
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\signature\PublicKeySignConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */