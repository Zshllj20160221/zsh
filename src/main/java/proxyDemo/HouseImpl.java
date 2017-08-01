package proxyDemo;

/**
 * 委托类  房东
 */
public class HouseImpl implements IHouse {

    @Override
    public void sellPrice() {
        System.out.println("****************两房一厅/3000(月)");
    }
}
