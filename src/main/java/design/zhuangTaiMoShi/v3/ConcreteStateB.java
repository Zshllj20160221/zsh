package design.zhuangTaiMoShi.v3;

/**
 * Created by zsh on 2017/9/26.
 */
public class ConcreteStateB extends State{

    @Override
    public void handle(Context context) {
        //设置ConcreteStateB的下一状态ConcreteStateA
        System.out.println(".................ConcreteStateB的下一状态ConcreteStateA");
        context.state = new ConcreteStateA();
    }
}
