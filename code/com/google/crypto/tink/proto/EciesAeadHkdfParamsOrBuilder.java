package com.google.crypto.tink.proto;

import com.google.protobuf.MessageOrBuilder;

public interface EciesAeadHkdfParamsOrBuilder extends MessageOrBuilder {
  boolean hasKemParams();
  
  EciesHkdfKemParams getKemParams();
  
  EciesHkdfKemParamsOrBuilder getKemParamsOrBuilder();
  
  boolean hasDemParams();
  
  EciesAeadDemParams getDemParams();
  
  EciesAeadDemParamsOrBuilder getDemParamsOrBuilder();
  
  int getEcPointFormatValue();
  
  EcPointFormat getEcPointFormat();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\crypto\tink\proto\EciesAeadHkdfParamsOrBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */