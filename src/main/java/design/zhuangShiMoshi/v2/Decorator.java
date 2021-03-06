package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 * 定义装饰者
 */
public abstract class Decorator implements Human{

    private Human human;

    public Decorator(Human human){
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
