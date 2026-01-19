package org.bouncycastle.est;

import java.io.IOException;

public interface ESTClient {
  ESTResponse doRequest(ESTRequest paramESTRequest) throws IOException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\est\ESTClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */