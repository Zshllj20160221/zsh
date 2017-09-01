package tmp.staticUse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh on 2017/9/1.
 */
public class DemoB {
    private String name;
    private int age;
    public static List<DriverDemo> list = new ArrayList();
    public DemoB(){
        super();
        System.out.println("create DemoB...................");
    }
    public DemoB(String name,int age){
        super();
        System.out.println("create DemoB with param........");
        this.name = name;
        this.age = age;
    }

    public static Boolean init(DriverDemo driverDemo){
        list.add(driverDemo);
        return true;
    }


}
