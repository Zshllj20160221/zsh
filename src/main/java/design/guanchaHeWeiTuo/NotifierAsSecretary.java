package design.guanchaHeWeiTuo;

/**
 * 秘书（真正的委托者）也就是委托观察者
 */
public class NotifierAsSecretary extends Notifier{

    @Override
    public void notifyx() {
        System.out.println("boss coming ............");
        try{
            getEventHandler().handler();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
