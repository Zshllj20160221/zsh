package JMIUse;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by zsh on 2017/8/14.
 */
public class Server {

    public static void main(String[] args){
        try {
            IService service = new ServiceImpl("service01");
            Context context = new InitialContext();
            context.rebind("rmi://localhost/service01",service);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("服务器向命名表注册了1个远程服务对象！");
    }
}
