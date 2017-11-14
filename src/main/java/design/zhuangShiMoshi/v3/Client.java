package design.zhuangShiMoshi.v3;

/**
 * Created by zsh on 2017/10/13.
 * http://www.jianshu.com/p/b4c371128e6f
 */
public class Client {

    public static void main(String [] args){
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}
