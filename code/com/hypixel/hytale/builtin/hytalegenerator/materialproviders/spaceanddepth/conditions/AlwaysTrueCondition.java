/*    */ package com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.conditions;
/*    */ 
/*    */ import com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.SpaceAndDepthMaterialProvider;
/*    */ 
/*    */ public class AlwaysTrueCondition implements SpaceAndDepthMaterialProvider.Condition {
/*  6 */   public static final AlwaysTrueCondition INSTANCE = new AlwaysTrueCondition();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean qualifies(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling) {
/* 17 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\materialproviders\spaceanddepth\conditions\AlwaysTrueCondition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */