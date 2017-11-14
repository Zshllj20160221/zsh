package design.ceLveMoShi.v3;

/**
 * Created by zsh on 2017/9/11.
 */
public class Client {

    public void btnok(){
        CashSuper cashSuper = CashFactory.createCashAccept(0);
        double total = cashSuper.btn_ok(3000);
    }
}
