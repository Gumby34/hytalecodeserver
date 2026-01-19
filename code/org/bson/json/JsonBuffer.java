package org.bson.json;

interface JsonBuffer {
  int getPosition();
  
  int read();
  
  void unread(int paramInt);
  
  int mark();
  
  void reset(int paramInt);
  
  void discard(int paramInt);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bson\json\JsonBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */