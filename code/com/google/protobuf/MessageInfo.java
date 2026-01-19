package com.google.protobuf;

@CheckReturnValue
interface MessageInfo {
  ProtoSyntax getSyntax();
  
  boolean isMessageSetWireFormat();
  
  MessageLite getDefaultInstance();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\protobuf\MessageInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */