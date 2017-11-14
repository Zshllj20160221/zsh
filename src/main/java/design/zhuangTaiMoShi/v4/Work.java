package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class Work {

    public Work(){
        currentState = new MorningState();
    }

    private State currentState;//当前状态
    private double hour;//钟点
    private boolean finish = false;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        currentState.writeProgram(this);
    }
}
