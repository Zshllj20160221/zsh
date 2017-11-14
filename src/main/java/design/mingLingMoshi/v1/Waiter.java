package design.mingLingMoshi.v1;

/**
 * Created by zsh on 2017/9/30.
 * 服务员
 */
public class Waiter {
    private Command command;

    //设置订单
    public void setOrder(Command command){
        this.command = command;
    }

    //通知执行
    public void notifyx(){
        command.excuteCommand();
    }
}
