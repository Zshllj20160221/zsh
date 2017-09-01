package tmp.staticUse;

/**
 * Created by zsh on 2017/9/1.
 */
public class DemoA {
    private String name;
    private int age;

    public DemoA(){
        super();
        System.out.println("create DemoA .........................");
    }

    public DemoA(String name,int age){
        super();
        this.name = name;
        this.age = age;
        System.out.println("create DemoA with param ...............");
    }

    static{
        System.out.println("coming static of DemoA.................");
        DemoB.init(new DriverDemo("uuuuuuuu"));
    }

}
