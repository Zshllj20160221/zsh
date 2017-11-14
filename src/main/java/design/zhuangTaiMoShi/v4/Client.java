package design.zhuangTaiMoShi.v4;

/**
 * Created by zsh on 2017/9/29.
 */
public class Client {
    public static void main(String [] args){
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
    }
}
