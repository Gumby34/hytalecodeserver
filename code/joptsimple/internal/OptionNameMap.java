package joptsimple.internal;

import java.util.Map;

public interface OptionNameMap<V> {
  boolean contains(String paramString);
  
  V get(String paramString);
  
  void put(String paramString, V paramV);
  
  void putAll(Iterable<String> paramIterable, V paramV);
  
  void remove(String paramString);
  
  Map<String, V> toJavaUtilMap();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\joptsimple\internal\OptionNameMap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */