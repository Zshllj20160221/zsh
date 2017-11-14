package design.mingLingMoshi.v1;

/**
 * Created by zsh on 2017/9/30.
 * 具体的命令类
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Mutton mutton) {
        super(mutton);
    }

    @Override
    public void excuteCommand() {
        mutton.bakeMutton();
    }
}
