package design.zhuangTaiMoShi.v_v1;

/**
 * Created by zsh on 2017/9/26.
 */
public class Client {
    public static void main(String [] args){
        Context context = new Context();
        context.setState(new Rain());

        System.out.println(context.stateMessage());
        context.setState(new Sunshine());
        System.out.println(context.stateMessage());
    }
}
