package design.guanchaHeWeiTuo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh on 2017/8/30.
 */
public class EventHandler {
    private List<Event> objects;
    public EventHandler(){
        objects = new ArrayList<Event>();
    }
    public void addEvent(Object object,String methodName,Object...args){
        Event event = new Event(object,methodName,args);
        objects.add(event);
    }

    //
    public void handler() throws Exception{
        for (Event e:objects){
            //通过反射调用对应的方法
            e.invoke();
        }
    }
}
