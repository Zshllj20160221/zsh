package tmp.staticUse;

import java.util.List;

/**
 * Created by zsh on 2017/9/1.
 */
//public class Main {
public class Main extends ClassLoader{
//    public static void main(String[] args) throws Exception{
//        System.out.println("Hello");
//        Class.forName("tmp.staticUse.DemoA");
////        Class.forName("tmp.staticUse.DemoA");
////        Class.forName("tmp.staticUse.DemoA");
////        Class.forName("tmp.staticUse.DemoA");
////        Class.forName("tmp.staticUse.DemoA");
////        Class.forName("tmp.staticUse.DemoA");
//        List<DriverDemo> list = DemoB.list;
//        System.out.println("list size:"+list.size());
//        for(DriverDemo driverDemo  :list){
//            System.out.println(driverDemo.toString());
//        }
//    }

//    public static void main(String[] args) throws Exception{
//        System.out.println("Hello");
//            new DemoA();
//
//        List<DriverDemo> list = DemoB.list;
//        System.out.println("list size:"+list.size());
//        for(DriverDemo driverDemo  :list){
//            System.out.println(driverDemo.toString());
//        }
//    }
//
//
    //        new JdbcTools().loadClass("com.mysql.jdbc.Driver");

    public static void main(String[] args) throws Exception{

        System.out.println("Hello");
        new Main().loadClass("tmp.staticUse.DemoA");
        List<DriverDemo> list = DemoB.list;
        System.out.println("list size:"+list.size());
        for(DriverDemo driverDemo  :list){
            System.out.println(driverDemo.toString());
        }
    }
}
