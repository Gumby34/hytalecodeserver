package org.bouncycastle.util;

public class StreamParsingException extends Exception {
  Throwable _e;
  
  public StreamParsingException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this._e = paramThrowable;
  }
  
  public Throwable getCause() {
    return this._e;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastl\\util\StreamParsingException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */