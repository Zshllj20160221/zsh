package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 */
public class Decorator_first extends Decorator{
    public Decorator_first(Human human){
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        goClothes();
    }

    public void goClothes(){
        System.out.println("去衣柜找找............");
    }

    public void goGarden(){
        System.out.println("去花园................");
    }
}
