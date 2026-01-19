package com.hypixel.hytale.function.function;

@FunctionalInterface
public interface TriBoolFunction<T, U, V, R> {
  R apply(T paramT, U paramU, V paramV, boolean paramBoolean);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\function\function\TriBoolFunction.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */