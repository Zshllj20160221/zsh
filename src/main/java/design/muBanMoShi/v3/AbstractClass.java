package design.muBanMoShi.v3;

/**
 * Created by zsh on 2017/9/13.
 */
public abstract class AbstractClass {
    public abstract void operation1();
    public abstract void operation2();

    public void templateMethod(){
        operation1();
        operation2();
        System.out.println("template of operation ...........");
    }
}
