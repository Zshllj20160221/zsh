package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 */
public class Decorator_zero extends Decorator{

    public Decorator_zero(Human human){
        super(human);
    }

    public void goHome(){
        System.out.println("进房子...........");
    }

    public void findMap(){
        System.out.println("书房找找map.......");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
