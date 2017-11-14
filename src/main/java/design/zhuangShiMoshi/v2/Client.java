package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 * 装饰模式
 */
public class Client {
    public static void main(String [] args){
        Human person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
