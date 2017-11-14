package design.ceLveMoShi.v3;

/**
 * Created by zsh on 2017/9/11.
 * 简单工厂模式
 */
public class CashFactory {
    public static CashSuper createCashAccept(int type){
        CashSuper cashSuper = null;
        switch(type){
            case 0 :
                cashSuper = new NormalShouYin();
                break;
            case 1 :
                cashSuper = new DazheShouyin();
                break;
        }
        return cashSuper;
    }
}
