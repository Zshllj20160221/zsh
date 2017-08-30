package design.guanchaHeWeiTuo;

/**
 * 订阅的抽象主题，主题持有EventHandler,用来传递参数给Event，以及提供了何时调用通知的抽象方法。
 */
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();
    public EventHandler getEventHandler(){
        return eventHandler;
    }

    public void addListener(Object object,String methodName,Object...args){
        //让传递进来的参数交由EventHandler,EventHandler交由event处理。
        eventHandler.addEvent(object,methodName,args);
    }
    //具体的实现类规定了何时开始通知观察者。
    public abstract void notifyx();
}
