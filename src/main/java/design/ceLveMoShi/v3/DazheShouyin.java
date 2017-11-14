package design.ceLveMoShi.v3;

/**
 * 打折收银
 */
public class DazheShouyin extends CashSuper{

    double rate = 1;
    @Override
    public double btn_ok(double money) {
        return money*rate;
    }
}
