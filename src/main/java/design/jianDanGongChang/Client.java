package design.jianDanGongChang;

import design.jianDanGongChang.service.Operator;

/**
 * 客户端
 */
public class Client {

//    public static void main(String[] args){
//        Operator operator = null;
//        operator = OperatorFactory.createOperator("+");
//        operator.setFirst_num(2);
//        operator.setSecond_num(4);
//        double result = operator.computer();
//        System.out.println("the result of computer:"+result);
//    }

    public static void main(String[] args){
        Operator operator = null;
        operator = OperatorFactory.createOperator("-");
        operator.setFirst_num(2);
        operator.setSecond_num(4);
        double result = operator.computer();
        System.out.println("the result of computer:"+result);
    }

    
}
