package design.zhuangTaiMoShi.v3;

/**
 * Created by zsh on 2017/9/26.
 * context类 维护一个具体状态的实例
 */
public class Context {
    public State state;
    //定义Context的初始状态
    public Context(State state){
        this.state = state;
    }
    public void setState(State state){
        this.state = state;
        System.out.println("当前状态："+state);
    }
    public State getState(){
        return state;
    }

    //对请求做处理，并设置下一个状态
    public void request(){
        state.handle(this);
    }
}
