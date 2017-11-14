package design.zhuangShiMoshi;

/**
 * Created by zsh on 2017/9/12.
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addMethod();
        System.out.println("具体装饰对象B的操作");
    }

    private void addMethod(){

    }
}
