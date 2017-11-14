package design.muBanMoShi.v3;

/**
 * Created by zsh on 2017/9/13.
 */
public class Cilent {
    public static void main(String[] args){
        AbstractClass abstractClass  = new ConcreteClassA();
        abstractClass.templateMethod();
    }
}
