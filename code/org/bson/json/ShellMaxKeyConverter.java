/*    */ package org.bson.json;
/*    */ 
/*    */ import org.bson.BsonMaxKey;
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
/*    */ class ShellMaxKeyConverter
/*    */   implements Converter<BsonMaxKey>
/*    */ {
/*    */   public void convert(BsonMaxKey value, StrictJsonWriter writer) {
/* 24 */     writer.writeRaw("MaxKey");
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\json\ShellMaxKeyConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */