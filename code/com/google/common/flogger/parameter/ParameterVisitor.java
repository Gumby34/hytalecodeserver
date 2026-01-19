package com.google.common.flogger.parameter;

import com.google.common.flogger.backend.FormatChar;
import com.google.common.flogger.backend.FormatOptions;

public interface ParameterVisitor {
  void visit(Object paramObject, FormatChar paramFormatChar, FormatOptions paramFormatOptions);
  
  void visitDateTime(Object paramObject, DateTimeFormat paramDateTimeFormat, FormatOptions paramFormatOptions);
  
  void visitPreformatted(Object paramObject, String paramString);
  
  void visitMissing();
  
  void visitNull();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\com\google\common\flogger\parameter\ParameterVisitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */