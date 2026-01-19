package org.bouncycastle.tsp.ers;

class IndexedHash {
  final int order;
  
  final byte[] digest;
  
  IndexedHash(int paramInt, byte[] paramArrayOfbyte) {
    this.order = paramInt;
    this.digest = paramArrayOfbyte;
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\tsp\ers\IndexedHash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */