package sheJiMoShi;

/**
 * 懒汉式 需要时再实例化  当程序第一次访问单件模式实例时才进行创建。
 */
public class Lazy {
    private Lazy(){}
    private static Lazy instance = null;
    //同步函数 安全效率低
    public static synchronized Lazy getInstance(){
        if (instance ==null){
            instance = new Lazy();
        }
        return instance;
    }
    // 同步代码块加锁 安全高效
    public static Lazy getInstanceBlock(){
        if(instance==null){
            synchronized(Lazy.class){
                if(instance==null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}
