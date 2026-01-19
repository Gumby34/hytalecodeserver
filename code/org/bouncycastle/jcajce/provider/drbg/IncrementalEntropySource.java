package org.bouncycastle.jcajce.provider.drbg;

import org.bouncycastle.crypto.prng.EntropySource;

interface IncrementalEntropySource extends EntropySource {
  byte[] getEntropy(long paramLong) throws InterruptedException;
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\jcajce\provider\drbg\IncrementalEntropySource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */