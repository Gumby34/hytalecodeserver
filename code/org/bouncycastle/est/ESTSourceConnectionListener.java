package org.bouncycastle.est;

import java.io.IOException;

public interface ESTSourceConnectionListener<T, I> {
  ESTRequest onConnection(Source<T> paramSource, ESTRequest paramESTRequest) throws IOException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\est\ESTSourceConnectionListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */