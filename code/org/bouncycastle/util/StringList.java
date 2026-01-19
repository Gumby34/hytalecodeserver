package org.bouncycastle.util;

public interface StringList extends Iterable<String> {
  boolean add(String paramString);
  
  String get(int paramInt);
  
  int size();
  
  String[] toStringArray();
  
  String[] toStringArray(int paramInt1, int paramInt2);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastl\\util\StringList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */