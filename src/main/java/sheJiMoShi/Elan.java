package sheJiMoShi;

/**
 * 饿汉式 类加载时就创建
 */
public class Elan {

    private Elan(){

    }
    private static Elan elan = new Elan();

    public static Elan getInstance(){
        return elan;
    }
}
