package io.sentry;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;

@Internal
public interface SpanFinishedCallback {
  void execute(@NotNull Span paramSpan);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\sentry\SpanFinishedCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */