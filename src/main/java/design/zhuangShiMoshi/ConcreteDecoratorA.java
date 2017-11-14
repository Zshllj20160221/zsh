package design.zhuangShiMoshi;

/**
 * Created by zsh on 2017/9/12.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addXX;

    @Override
    public void operation() {
        super.operation();
        addXX = "XX";
        System.out.println("具体装饰对象A的操作");
    }
}
