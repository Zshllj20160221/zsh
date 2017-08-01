package proxyDemo;

/**
 * 代理类  经纪人（中介）
 */
public class HouseProxy implements IHouse{

    private HouseImpl house = new HouseImpl();//房东

    @Override
    public void sellPrice() {
        System.out.println("*******你好租客，我是房东委托我代理租房业务的中介，我可以帮你找到房子。中介费我收一半");//代理前
        System.out.println("这是房东Json的房子");
        house.sellPrice();
        System.out.println("*******交易完成");//代理后
    }
}
