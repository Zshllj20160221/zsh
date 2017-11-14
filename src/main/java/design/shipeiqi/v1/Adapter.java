package design.shipeiqi.v1;

/**
 * Created by zsh on 2017/9/29.
 * 适配器
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.request();
    }
}
