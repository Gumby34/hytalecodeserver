package com.hypixel.hytale.server.core.permissions;

import javax.annotation.Nonnull;

public interface PermissionHolder {
  boolean hasPermission(@Nonnull String paramString);
  
  boolean hasPermission(@Nonnull String paramString, boolean paramBoolean);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\core\permissions\PermissionHolder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */