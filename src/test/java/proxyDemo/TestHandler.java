package proxyDemo;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class TestHandler {

    @Test
    public void test(){
        IHouse house = new HouseImpl();//房东

        HouseHandler houseHandler = new HouseHandler(house);//房东找到代理类

        //实例化代理类赋值给顶级接口          委托类的类加载器  委托类的接口 代理类
        IHouse proxy = (IHouse) Proxy.newProxyInstance(house.getClass().getClassLoader(),house.getClass().getInterfaces(),houseHandler);
        proxy.sellPrice();

    }
}
