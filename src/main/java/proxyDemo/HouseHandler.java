package proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class HouseHandler implements InvocationHandler{

    private Object obj;//可以是房东 <==委托类

    public HouseHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(obj,args);
        System.out.println("after");
        return result;
    }
}
