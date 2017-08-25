import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zsh on 2017/8/21.
 */
public class MainThreadTest {
    public static void main(String [] args){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer thread is running...");
            }
        },500,500);
        System.out.println("main thread ends");
    }
}
