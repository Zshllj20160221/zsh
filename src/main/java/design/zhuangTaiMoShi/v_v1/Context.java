package design.zhuangTaiMoShi.v_v1;

/**
 * Created by zsh on 2017/9/26.
 * 定义当前的状态
 */
public class Context {

    private State state;
    public State getState(){
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
    public String stateMessage(){
         return state.getState();
    }
}
