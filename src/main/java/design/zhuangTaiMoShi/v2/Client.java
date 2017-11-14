package design.zhuangTaiMoShi.v2;

/**
 * Created by zsh on 2017/9/25.
 *
 */
public class Client {
    public static void main(String [] args){
        Work work = new Work();
        work.setHour(18);
        work.setFinish(true);
        work.writeProgram();
    }
}
