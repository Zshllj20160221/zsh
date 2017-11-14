package design.ceLveMoShi.v3;

/**
 * 正常的日常收银业务
 */
public class NormalShouYin extends CashSuper{

    @Override
    public double btn_ok(double money) {
        return money;
    }
}
