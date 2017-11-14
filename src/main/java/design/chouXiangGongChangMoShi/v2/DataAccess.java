package design.chouXiangGongChangMoShi.v2;

import design.chouXiangGongChangMoShi.v1.department.IDepartment;
import design.chouXiangGongChangMoShi.v1.user.IUser;

import java.lang.reflect.Method;

/**
 * Created by zsh on 2017/10/4.
 * 通过反射技术实例化对象 反射参数可以从配置文件中读取
 *
 */
public class DataAccess {

    private static final String DB = "SqlServer";

    public static IUser createUser(){
        String className = "com.jdbc."+DB;
        Object obj = null;
        try{
            Class c = Class.forName(className);
            obj  = c.newInstance();
//            Method method = c.getMethod("insert",null);
//            method.invoke(obj,null);
        }catch(Exception exception){

        }
        return (IUser) obj;
    }

    public static IDepartment createDepartment(){
        String className = "com.jdbc."+DB;
        Object obj = null;
        try{
            Class c = Class.forName(className);
            obj = c.newInstance();
//            Method method = c.getMethod("insert",null);
//            method.invoke(obj,null);
        }catch(Exception e){

        }
        return (IDepartment)obj;
    }

}
