package com.google.protobuf;

@CheckReturnValue
interface SchemaFactory {
  <T> Schema<T> createSchema(Class<T> paramClass);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\protobuf\SchemaFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */