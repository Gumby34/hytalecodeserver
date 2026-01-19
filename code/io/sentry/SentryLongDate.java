/*    */ package io.sentry;
/*    */ 
/*    */ public final class SentryLongDate extends SentryDate {
/*    */   private final long nanos;
/*    */   
/*    */   public SentryLongDate(long nanos) {
/*  7 */     this.nanos = nanos;
/*    */   }
/*    */ 
/*    */   
/*    */   public long nanoTimestamp() {
/* 12 */     return this.nanos;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\sentry\SentryLongDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */