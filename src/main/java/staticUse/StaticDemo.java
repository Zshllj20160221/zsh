package staticUse;

/**
 * Created by zsh on 2017/8/9.
 * 静态代码块！-->非静态代码块！-->默认构造方法！
 *
 * 　静态代码块只在第一次new执行一次，之后不再执行，而非静态代码块在每new一次就执行一次。非静态代码块可在普通方法中定义(不过作用不大)；而静态代码块不行
 */
public class StaticDemo {

    public StaticDemo(){
        System.out.println("This is constructed function. ");
    }
    public static void main(String [] args){
        new StaticDemo();
        System.out.println("This is main method.");
    }

    static {
        System.out.println("This is static bloc.");
        int var = 0;//这是局部变量 只有本块有效

    }

    {
        System.out.println("This is normal method block.");//每次创建对象都会执行
    }
}
