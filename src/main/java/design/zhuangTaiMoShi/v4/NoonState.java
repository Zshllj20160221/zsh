package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<13){
            System.out.println("this current time <13 :"+ work.getHour());
        }else{
            work.setCurrentState(new After());
            work.writeProgram();
        }
    }
}
