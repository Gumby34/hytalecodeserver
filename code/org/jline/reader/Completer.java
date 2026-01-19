package org.jline.reader;

import java.util.List;

public interface Completer {
  void complete(LineReader paramLineReader, ParsedLine paramParsedLine, List<Candidate> paramList);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\jline\reader\Completer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */