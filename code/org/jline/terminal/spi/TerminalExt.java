package org.jline.terminal.spi;

import org.jline.terminal.Terminal;

public interface TerminalExt extends Terminal {
  TerminalProvider getProvider();
  
  SystemStream getSystemStream();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\jline\terminal\spi\TerminalExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */