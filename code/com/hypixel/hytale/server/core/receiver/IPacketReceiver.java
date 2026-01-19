package com.hypixel.hytale.server.core.receiver;

import com.hypixel.hytale.protocol.Packet;
import javax.annotation.Nonnull;

public interface IPacketReceiver {
  void write(@Nonnull Packet paramPacket);
  
  void writeNoCache(@Nonnull Packet paramPacket);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\receiver\IPacketReceiver.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */