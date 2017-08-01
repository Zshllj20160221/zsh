package proxyDemo;

import org.junit.Test;
import proxyDemo.HouseProxy;

/**
 * 测试静态代理
 */
public class TestProxy {

    @Test
    public void test(){
        System.out.println("租客a");
        HouseProxy proxy = new HouseProxy();
        System.out.println("代理：proxy");
        proxy.sellPrice();
    }
}
