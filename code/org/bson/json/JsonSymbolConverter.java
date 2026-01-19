/*    */ package org.bson.json;
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
/*    */ class JsonSymbolConverter
/*    */   implements Converter<String>
/*    */ {
/*    */   public void convert(String value, StrictJsonWriter writer) {
/* 22 */     writer.writeStartObject();
/* 23 */     writer.writeString("$symbol", value);
/* 24 */     writer.writeEndObject();
/*    */   }
/*    */ }


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\json\JsonSymbolConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */