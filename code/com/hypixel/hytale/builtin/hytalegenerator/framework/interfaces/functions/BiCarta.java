package com.hypixel.hytale.builtin.hytalegenerator.framework.interfaces.functions;

import com.hypixel.hytale.builtin.hytalegenerator.threadindexer.WorkerIndexer;
import java.util.List;
import javax.annotation.Nonnull;

public abstract class BiCarta<R> {
  public abstract R apply(int paramInt1, int paramInt2, @Nonnull WorkerIndexer.Id paramId);
  
  public abstract List<R> allPossibleValues();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\hypixel\hytale\builtin\hytalegenerator\framework\interfaces\functions\BiCarta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */