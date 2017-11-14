package design.mingLingMoshi.v1;

/**
 * Created by zsh on 2017/9/30.
 */
public class Client {

    public static void main(String [] args){
        //开店前准备
        Mutton mutton = new Mutton();
        BakeMuttonCommand bakeMuttonCommand1 = new BakeMuttonCommand(mutton);//订单1
        BakeMuttonCommand bakeMuttonCommand2 = new BakeMuttonCommand(mutton);//订单1
        BakeMuttonCommand bakeMuttonCommand3 = new BakeMuttonCommand(mutton);//订单1
        BakeMuttonCommand bakeMuttonCommand4 = new BakeMuttonCommand(mutton);//订单1

        Waiter waiter = new Waiter();
        //记录订单
        waiter.setOrder(bakeMuttonCommand1);
        waiter.notifyx();

        waiter.setOrder(bakeMuttonCommand2);
        waiter.notifyx();

        waiter.setOrder(bakeMuttonCommand3);
        waiter.notifyx();

        waiter.setOrder(bakeMuttonCommand4);
        waiter.notifyx();


    }
}
