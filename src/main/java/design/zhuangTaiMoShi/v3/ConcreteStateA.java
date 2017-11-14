package design.zhuangTaiMoShi.v3;

/**
 * Created by zsh on 2017/9/26.
 */
public class ConcreteStateA extends State{

    @Override
    public void handle(Context context) {
        //设置ConcreteStateA的下一状态是ConcreteStateB
        System.out.println("..............ConcreteStateA的下一状态是ConcreteStateB");
        context.state = new ConcreteStateB();
    }
}
