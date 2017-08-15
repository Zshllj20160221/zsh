package JMIUse;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zsh on 2017/8/14.
 */
public interface IService extends Remote{
    public String service(String content) throws RemoteException;
}
