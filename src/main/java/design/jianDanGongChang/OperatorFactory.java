package design.jianDanGongChang;

import design.jianDanGongChang.service.Add;
import design.jianDanGongChang.service.Minus;
import design.jianDanGongChang.service.Operator;

/**
 * 简单工厂类   单独一个类创造实例
 * <p>
 * <p>
 * 准确的来说, 简单工厂方法并不是一种设计模式, 它是用一个方法来生成一个类的对象. 当实例化的的类容易发生变化时, 可以考虑用一个单独的类来执行来执行这个实例化的过程.
 * 比如说定义了一个运算类, 包含加减乘除运算, 将来还可能增加平方, 根号运算等, 这个运算类就可以考虑用简单工厂方法来实现.
 * <p>
 * 当需要扩展时, 比如说追加一个减运算. 只需要增加一个 Operator类的子类（Minus）, 然后修改 OperatorFactory 中的createOperation 方法, 客户端并不需要做修改. 也是在一定的程度上体现了开放封闭原则 .
 * 只不过并不完美.
 * <p>
 * 工厂方法模式(Factory Method Pattern)
 * 与简单工厂方法相比较, 工厂方法模式把Factory 的每个方法抽取了出来, (Factory Method) 定义了一个用于创建对象的接口, 让子类决定实例化那一个类. 工厂方法使一个类的实例化延迟到其子类进行.
 * <p>
 * 简单工厂的最大的优点就是工厂类包含了必要的逻辑判断, 根据客户端的选择来实例化具体的类, 减少了主应用程序对产品的依赖.
 * <p>
 * 但是, 对于简单工厂方法来说, 如果需要添加新的生成类, 就需要修改工厂类, 也是在一定程度上违反了开放-封闭原则 所以就引入了工厂方法模式.
 */
public class OperatorFactory {

    public static Operator createOperator(String operationalCharacter) {
        Operator operator = null;
        switch (operationalCharacter) {
            case "+":
                operator = new Add();
                break;
            case "-":
                operator = new Minus();
                break;
        }
        return operator;
    }
}
