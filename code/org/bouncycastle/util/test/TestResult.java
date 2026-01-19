package org.bouncycastle.util.test;

public interface TestResult {
  boolean isSuccessful();
  
  Throwable getException();
  
  String toString();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastl\\util\test\TestResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */