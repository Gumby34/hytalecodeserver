package com.google.protobuf;

public interface RpcChannel {
  void callMethod(Descriptors.MethodDescriptor paramMethodDescriptor, RpcController paramRpcController, Message paramMessage1, Message paramMessage2, RpcCallback<Message> paramRpcCallback);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\protobuf\RpcChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */