package quiz;

/**
 * Created by zsh on 2017/10/24.
 */
public class Hello {
    public static void main(String [] args){
//        A a = new A();
        A b = new B();
        b = new B();
    }
}

class A{
    static {
        System.out.print("1");
    }
    public A(){
        System.out.print("2");
    }
}

class B extends A{
    static {
        System.out.print("a");
    }
    public B(){
        System.out.print("b");
    }
}
