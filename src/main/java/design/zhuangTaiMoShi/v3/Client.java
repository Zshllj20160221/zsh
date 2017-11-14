package design.zhuangTaiMoShi.v3;

/**
 * Created by zsh on 2017/9/26.
 * 来源于大话设计模式
 */
public class Client {
    public static void main(String [] args){
        //设置context的初始状态为ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        //不断的请求，同时更改状态
        context.request();
        context.request();
    }
}
