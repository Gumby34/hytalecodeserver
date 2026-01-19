package javax.annotation.meta;

import javax.annotation.Nonnull;

public interface TypeQualifierValidator<A extends java.lang.annotation.Annotation> {
  @Nonnull
  When forConstantValue(@Nonnull A paramA, Object paramObject);
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\javax\annotation\meta\TypeQualifierValidator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */