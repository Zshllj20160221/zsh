package JMIUse;

import java.rmi.RemoteException;

/**
 * Created by zsh on 2017/8/14.
 */
public class ServiceImpl implements IService {

    private String name;

    public ServiceImpl(String name) throws RemoteException{
        this.name = name;
    }

    @Override
    public String service(String content) throws RemoteException{
        return "server>>"+content;
    }

}
