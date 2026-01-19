package org.bouncycastle.cert.dane;

public class DANEEntryStoreBuilder {
  private final DANEEntryFetcherFactory daneEntryFetcher;
  
  public DANEEntryStoreBuilder(DANEEntryFetcherFactory paramDANEEntryFetcherFactory) {
    this.daneEntryFetcher = paramDANEEntryFetcherFactory;
  }
  
  public DANEEntryStore build(String paramString) throws DANEException {
    return new DANEEntryStore(this.daneEntryFetcher.build(paramString).getEntries());
  }
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\org\bouncycastle\cert\dane\DANEEntryStoreBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */