package design.danLiMoshi.v1;

/**
 * Created by zsh on 2017/11/1.
 */
public class ZshSingleTon2 {
    private ZshSingleTon2(){};
    private static final ZshSingleTon2 singleTon = new ZshSingleTon2();
    public static ZshSingleTon2  getSingleton(){
        return singleTon;
    }
}
