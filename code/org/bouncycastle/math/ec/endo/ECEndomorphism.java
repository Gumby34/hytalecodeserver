package org.bouncycastle.math.ec.endo;

import org.bouncycastle.math.ec.ECPointMap;

public interface ECEndomorphism {
  ECPointMap getPointMap();
  
  boolean hasEfficientPointMap();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\math\ec\endo\ECEndomorphism.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */