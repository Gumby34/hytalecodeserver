/*    */ package com.nimbusds.jose.util;
/*    */ 
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
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
/*    */ public class CollectionUtils
/*    */ {
/*    */   public static <T> boolean containsNull(Set<T> set) {
/* 41 */     HashSet<T> defensiveCopy = new HashSet<>(set);
/* 42 */     return defensiveCopy.contains(null);
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jos\\util\CollectionUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */