package io.sentry.hints;

public interface Retryable {
  boolean isRetry();
  
  void setRetry(boolean paramBoolean);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\sentry\hints\Retryable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */