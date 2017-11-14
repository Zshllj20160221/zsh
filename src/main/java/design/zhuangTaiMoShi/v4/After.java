package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class After implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<17){
            System.out.println("this current time <17 :" + work.getHour());
        }else{
            work.setCurrentState(new SleepState());
            work.writeProgram();
        }
    }
}
