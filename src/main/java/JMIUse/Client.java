package JMIUse;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by zsh on 2017/8/14.
 */
public class Client {
    public static void main(String[] args){
        String url = "rmi://localhost/";

        try{
            Context context = new InitialContext();
            IService service = (IService)context.lookup(url+"service01");

            Class class1 = service.getClass();
            System.out.println(service + "is " + class1.getName()+"的实例");

            Class[] interfaces = class1.getInterfaces();
            for (Class c : interfaces){
                System.out.println(c.getName()+"接口！");
            }
            System.out.println(service.service("Helloworld!"));
        }catch(Exception e){

        }
    }
}
