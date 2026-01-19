package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public interface ICurrentDateProvider {
  long getCurrentTimeMillis();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\sentry\transport\ICurrentDateProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */