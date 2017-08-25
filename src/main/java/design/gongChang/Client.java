package design.gongChang;

import design.gongChang.service.Opetator;

/**
 * Created by zsh on 2017/8/25.
 */
public class Client {
    public static void main(String[] args){
        IFactory factory = new AddFactory();
        Opetator opetator = factory.createOperator();
        opetator.setFirst_num(8);
        opetator.setSecond_num(2);
        double result = opetator.computer();
        System.out.println("计算结果："+result);
    }
}
