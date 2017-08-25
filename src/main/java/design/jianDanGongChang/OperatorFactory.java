package design.jianDanGongChang;

import design.jianDanGongChang.service.Add;
import design.jianDanGongChang.service.Operator;

/**
 * 简单工厂类   单独一个类创造实例
 */
public class OperatorFactory {

    public static Operator createOperator(String operationalCharacter){
        Operator operator = null;
        switch(operationalCharacter){
            case "+":
                operator = new Add();
                break;
        }
        return operator;
    }
}
