package org.bouncycastle.mime;

import java.io.IOException;

public interface MimeMultipartContext extends MimeContext {
  MimeContext createContext(int paramInt) throws IOException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\mime\MimeMultipartContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */