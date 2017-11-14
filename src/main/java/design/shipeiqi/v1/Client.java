package design.shipeiqi.v1;

/**
 * Created by zsh on 2017/9/29.
 */
public class Client {
    public static void main(String [] args){
        Target target = new Adapter();
        target.request();
    }
}
