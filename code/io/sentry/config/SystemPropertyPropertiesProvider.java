/*    */ package io.sentry.config;
/*    */ 
/*    */ 
/*    */ final class SystemPropertyPropertiesProvider
/*    */   extends AbstractPropertiesProvider
/*    */ {
/*    */   private static final String PREFIX = "sentry.";
/*    */   
/*    */   public SystemPropertyPropertiesProvider() {
/* 10 */     super("sentry.", System.getProperties());
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\sentry\config\SystemPropertyPropertiesProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */