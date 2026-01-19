package com.hypixel.hytale.codec;

public interface WrappedCodec<T> {
  Codec<T> getChildCodec();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\codec\WrappedCodec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */