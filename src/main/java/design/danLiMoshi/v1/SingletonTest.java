package design.danLiMoshi.v1;

/**
 * Created by zsh on 2017/9/12.
 * 单例模式
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());
    }

}

//饿汉式单例
class Singleton {

    private Singleton() {
    }

    private static final Singleton single = new Singleton();

    public static Singleton getInstance(){
        return single;
    }
}

//懒汉式
class Singleton1{
    private Singleton1(){

    }

    private static Singleton1 singleton1 = null;

    public static Singleton1 getInstance(){
        if (singleton1==null){
            synchronized (Singleton1.class){
                if (singleton1==null) singleton1 = new Singleton1();
            }
        }
        return singleton1;
    }
}
