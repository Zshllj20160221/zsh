package design.chouXiangGongChangMoShi.v1.user;

import design.chouXiangGongChangMoShi.v1.User;

/**
 * Created by zsh on 2017/10/4.
 */
public class SqlServerUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("insert  user .........");
    }
}
