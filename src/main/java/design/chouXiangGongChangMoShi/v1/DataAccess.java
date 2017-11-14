package design.chouXiangGongChangMoShi.v1;

import design.chouXiangGongChangMoShi.v1.department.AccessDepartment;
import design.chouXiangGongChangMoShi.v1.department.IDepartment;
import design.chouXiangGongChangMoShi.v1.department.SqlServerDepartment;
import design.chouXiangGongChangMoShi.v1.user.AccessUser;
import design.chouXiangGongChangMoShi.v1.user.IUser;
import design.chouXiangGongChangMoShi.v1.user.SqlServerUser;

/**
 * Created by zsh on 2017/10/4.
 */
public class DataAccess {
    private static final String DB = "SqlServer";
    public static IUser createUser(){
        IUser user = null;
        switch(DB){
            case "sqlServer":
                user = new SqlServerUser();
                break;
            case "accessServer":
                user = new AccessUser();
                break;
        }
        return user;
    }

    public static IDepartment createDepartment(){
        IDepartment department = null;
        switch(DB){
            case "SqlServer":
                department = new SqlServerDepartment();
                break;
            case "access":
                department = new AccessDepartment();
                break;
        }
        return department;
    }
}
