package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Set;

interface AuthAttributesProvider {
  ASN1Set getAuthAttributes();
  
  boolean isAead();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\cms\AuthAttributesProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */