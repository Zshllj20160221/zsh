package design.daiLiMoShi.v1;

/**
 * Created by zsh on 2017/9/12.
 */
public class Client {
    public static void main(String [] args){
        SchoolGirl xiaohong = new SchoolGirl("小红");
        Proxy proxy = new Proxy(xiaohong);
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
