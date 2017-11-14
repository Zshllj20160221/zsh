package design.zhuangShiMoshi;

/**
 * Created by zsh on 2017/9/12.
 * http://blog.csdn.net/jason0539/article/details/22713711
 * 装饰模式
 */
public class Client {
    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a1 = new ConcreteDecoratorA();
        ConcreteDecoratorB b1 = new ConcreteDecoratorB();
        a1.setComponent(c);
        b1.setComponent(a1);
        b1.operation();
        System.out.println("执行完毕....................");
    }
}
