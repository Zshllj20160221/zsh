package quiz.overrideOverload;

/**
 * Created by zsh on 2017/10/23.
 */
public class BDemo extends ADemo{
    @Override
    public void test() {
        super.test();
    }

    public static void main(String [] args){
        BDemo bDemo = new BDemo();
        bDemo.test();
    }

}
