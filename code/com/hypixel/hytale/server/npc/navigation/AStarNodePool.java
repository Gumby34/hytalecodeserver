package com.hypixel.hytale.server.npc.navigation;

public interface AStarNodePool {
  AStarNode allocate();
  
  void deallocate(AStarNode paramAStarNode);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\npc\navigation\AStarNodePool.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */