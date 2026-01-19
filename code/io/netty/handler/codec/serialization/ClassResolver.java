package io.netty.handler.codec.serialization;

@Deprecated
public interface ClassResolver {
  Class<?> resolve(String paramString) throws ClassNotFoundException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\codec\serialization\ClassResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */