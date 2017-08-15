package jvmDemo.stackUse;

/**
 * Created by zsh on 2017/8/15.
 */
public class StackInstance {

    public void init(int a) {
        System.out.println(a++);
        init(a);
    }
}
