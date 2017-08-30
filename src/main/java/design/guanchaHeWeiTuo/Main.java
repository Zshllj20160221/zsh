package design.guanchaHeWeiTuo;

/**
 * Created by zsh on 2017/8/30.
 */
public class Main {
    public static void main(String[] args){
        //委托观察者
        Notifier notifier = new NotifierAsSecretary();
        //真正的观察者
        SeeA seeA = new SeeA();
        //真正的观察者
        SeeB seeB = new SeeB();
//        notifier.addListener(seeA,"closeZhibo","zsh",001);
//        notifier.addListener(seeB,"closeStock",002,"xiaoming");

        notifier.addListener(seeA,"closeZhibo",new Object[]{"zsh",001});
        notifier.addListener(seeB,"closeStock",new Object[]{002,"xiaoming"});

        notifier.notifyx();
    }
}
