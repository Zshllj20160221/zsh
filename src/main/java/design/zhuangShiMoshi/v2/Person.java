package design.zhuangShiMoshi.v2;

/**
 * Created by zsh on 2017/9/12.
 */
public class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么呢....");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里.......");
    }
}
