package org.bouncycastle.cms;

import org.bouncycastle.operator.OperatorCreationException;

public interface SignerInformationVerifierProvider {
  SignerInformationVerifier get(SignerId paramSignerId) throws OperatorCreationException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\cms\SignerInformationVerifierProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */