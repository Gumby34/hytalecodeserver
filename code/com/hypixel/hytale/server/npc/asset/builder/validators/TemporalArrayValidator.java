package com.hypixel.hytale.server.npc.asset.builder.validators;

import java.time.temporal.TemporalAmount;

public abstract class TemporalArrayValidator extends Validator {
  public abstract boolean test(TemporalAmount[] paramArrayOfTemporalAmount);
  
  public abstract String errorMessage(String paramString, TemporalAmount[] paramArrayOfTemporalAmount);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\server\npc\asset\builder\validators\TemporalArrayValidator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */