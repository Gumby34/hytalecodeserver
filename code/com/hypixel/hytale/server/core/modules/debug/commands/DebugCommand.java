/*    */ package com.hypixel.hytale.server.core.modules.debug.commands;
/*    */ 
/*    */ import com.hypixel.hytale.server.core.command.system.AbstractCommand;
/*    */ import com.hypixel.hytale.server.core.command.system.basecommands.AbstractCommandCollection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DebugCommand
/*    */   extends AbstractCommandCollection
/*    */ {
/*    */   public DebugCommand() {
/* 14 */     super("debug", "server.commands.debug.desc");
/* 15 */     addSubCommand((AbstractCommand)new DebugShapeSubCommand());
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\modules\debug\commands\DebugCommand.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */