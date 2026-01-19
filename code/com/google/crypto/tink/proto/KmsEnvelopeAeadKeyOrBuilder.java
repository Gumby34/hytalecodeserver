package com.google.crypto.tink.proto;

import com.google.protobuf.MessageOrBuilder;

public interface KmsEnvelopeAeadKeyOrBuilder extends MessageOrBuilder {
  int getVersion();
  
  boolean hasParams();
  
  KmsEnvelopeAeadKeyFormat getParams();
  
  KmsEnvelopeAeadKeyFormatOrBuilder getParamsOrBuilder();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\proto\KmsEnvelopeAeadKeyOrBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */