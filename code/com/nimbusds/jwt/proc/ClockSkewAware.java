package com.nimbusds.jwt.proc;

public interface ClockSkewAware {
  int getMaxClockSkew();
  
  void setMaxClockSkew(int paramInt);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\nimbusds\jwt\proc\ClockSkewAware.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */