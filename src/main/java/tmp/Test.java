package tmp;

/**
 * Created by zsh on 2017/8/21.
 */
public class Test {
    public static void main(String[] args){
        ClassLoader loader = Test.class.getClassLoader();
        System.out.println(loader.toString());
        System.out.println(loader.getParent().toString());
        System.out.println(loader.getParent().getParent());
        System.out.println(new Test());
        System.out.println(new Test());
    }
}
