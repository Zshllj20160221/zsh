package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class MorningState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<12){
            System.out.println("thit current time < 12 :"+ work.getHour());
        }else{
            work.setCurrentState(new NoonState());//中午
            work.writeProgram();
        }
    }
}
