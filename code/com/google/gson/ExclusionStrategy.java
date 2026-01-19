package com.google.gson;

public interface ExclusionStrategy {
  boolean shouldSkipField(FieldAttributes paramFieldAttributes);
  
  boolean shouldSkipClass(Class<?> paramClass);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\gson\ExclusionStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */