package design.mingLingMoshi.v1;

/**
 * Created by zsh on 2017/9/30.
 * 抽象命令
 */
public abstract class Command {

    protected Mutton mutton;
    public Command(Mutton customer){
        this.mutton = mutton;
    }
    //执行命令
    public abstract void excuteCommand();

}
