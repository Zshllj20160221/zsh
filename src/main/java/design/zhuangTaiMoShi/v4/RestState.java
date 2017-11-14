package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class RestState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("this current time can go home.");
    }
}
