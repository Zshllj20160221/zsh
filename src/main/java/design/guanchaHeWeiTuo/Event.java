package design.guanchaHeWeiTuo;

import java.lang.reflect.Method;

/**
 *
 * java中的委托说到底还是通过反射来实现。当观察者(observer)需要订阅某一主题(subject)时，之前是仅需要传递观察者对象本身，而此时要使用委托，就额外需要传递观察者接到通知后需要调用的方法名称以及方法需要的实际参数。形如
 *
 *notifier.addListener(doa, "doaUpdate", 123,"spring");
 *第一个参数是观察者自己，第二个参数字符串就是需要传递的方法名，第三个就是需要传递的实际参数组成的数组。反射正是通过这样的订阅获得了需要的类名，方法名和参数类型，从而实现了反射，实现了不需要接口统一方法名称就可以动态实现通知。
 *
 *作者：夏广成
 *链接：http://www.jianshu.com/p/c067410d95ca
 *著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
//  事件类 主要是通过获取到的类名，方法名，参数类型完成反射调用
public class Event {
    private Object object;
    private String methodName;
    private Object [] params;
    private Class [] paramTypes;

    public Event(Object object,String methodName,Object...objects){
        this.object = object;
        this.methodName = methodName;
        this.params = objects;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object [] params){
        if (params==null){
            return;
        }
        paramTypes = new Class[params.length];
        for(int i = 0;i<params.length;i++){
            paramTypes[i] = params[i].getClass();
        }
    }

    // EventHandler通过handler()调用该方法，
    //该方法通拿到每一个具体的传入的对象和传入的方法名，经过反射调用对应的方法
    public void invoke() throws Exception{
        Method method = object.getClass().getMethod(methodName,paramTypes);
        if (method==null){

        }else{
            method.invoke(object,params);
        }
    }
}
