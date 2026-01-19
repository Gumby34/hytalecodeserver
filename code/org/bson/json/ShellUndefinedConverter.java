/*    */ package org.bson.json;
/*    */ 
/*    */ import org.bson.BsonUndefined;
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
/*    */ class ShellUndefinedConverter
/*    */   implements Converter<BsonUndefined>
/*    */ {
/*    */   public void convert(BsonUndefined value, StrictJsonWriter writer) {
/* 24 */     writer.writeRaw("undefined");
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\json\ShellUndefinedConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */