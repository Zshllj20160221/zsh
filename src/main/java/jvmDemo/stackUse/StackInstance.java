package jvmDemo.stackUse;

/**
 * Created by zsh on 2017/8/15.
 */
public class StackInstance {

    public void init(int a) {
//        if (a < 5000) {
//            try {
//                Thread.sleep(10);
                System.out.println(a++);
//            } catch (Exception e) {
//
//            }
//        }
        init(a);
    }
}
