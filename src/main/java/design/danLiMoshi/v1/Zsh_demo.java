package design.danLiMoshi.v1;

/**
 * Created by zsh on 2017/11/1.
 */
public class Zsh_demo {

    private Zsh_demo(){};
    private static Zsh_demo singleton= null;

    public static Zsh_demo getSingleton(){
        if(singleton == null){
            synchronized(Zsh_demo.class){
                if(singleton == null){
                    singleton = new Zsh_demo();
                }
            }
        }
        return singleton;
    }



}
