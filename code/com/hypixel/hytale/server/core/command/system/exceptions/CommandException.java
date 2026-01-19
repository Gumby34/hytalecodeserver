package com.hypixel.hytale.server.core.command.system.exceptions;

import com.hypixel.hytale.server.core.command.system.CommandSender;
import javax.annotation.Nonnull;

public abstract class CommandException extends RuntimeException {
  public abstract void sendTranslatedMessage(@Nonnull CommandSender paramCommandSender);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\command\system\exceptions\CommandException.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */