/*    */ package com.hypixel.hytale.server.npc.instructions;
/*    */ 
/*    */ import javax.annotation.Nullable;
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
/*    */ public interface BodyMotion
/*    */   extends Motion
/*    */ {
/*    */   @Nullable
/*    */   default BodyMotion getSteeringMotion() {
/* 20 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\npc\instructions\BodyMotion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */