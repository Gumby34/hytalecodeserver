package com.hypixel.hytale.server.npc.util;

public interface IComponentExecutionControl {
  boolean processDelay(float paramFloat);
  
  void clearOnce();
  
  void setOnce();
  
  boolean isTriggered();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\np\\util\IComponentExecutionControl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */