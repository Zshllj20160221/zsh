package design.chouXiangGongChangMoShi.v1;

import design.chouXiangGongChangMoShi.v1.department.Department;
import design.chouXiangGongChangMoShi.v1.department.IDepartment;
import design.chouXiangGongChangMoShi.v1.user.IUser;

/**
 * Created by zsh on 2017/10/4.
 */
public class Client {
    public static void main(String [] args){
        User user = new User();
        Department department = new Department();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insertDepartment(department);

        System.out.println("打印完毕。。。。。。。。。。。。。");

    }
}
