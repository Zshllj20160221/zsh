package quiz.overrideOverload;

/**
 * Created by zsh on 2017/10/23.
 */
public class ADemo {
    @Override
    public String toString() {
        return super.toString();
    }

    protected void test(){
        System.out.println("hello this is parent.......");
    }
}
