package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 */
public class Decorator_two extends Decorator {
    public Decorator_two(Human human){
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goWarter();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        goHouYuan();
    }

    public void goWarter(){
        System.out.println("去游泳池........");
    }

    public void goHouYuan(){
        System.out.println("去后院..........");
    }
}
