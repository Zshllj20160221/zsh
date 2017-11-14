package design.beiWangLu.v1;

/**
 * Created by zsh on 2017/9/29.
 * 备忘录 负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 */
public class Memento {
    private String state = "";
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
}
