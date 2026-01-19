package io.netty.handler.ipfilter;

import java.net.InetSocketAddress;

public interface IpFilterRule {
  boolean matches(InetSocketAddress paramInetSocketAddress);
  
  IpFilterRuleType ruleType();
}


/* Location:              C:\Users\asier\Desktop\hytale-server\HytaleServer.jar!\io\netty\handler\ipfilter\IpFilterRule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */