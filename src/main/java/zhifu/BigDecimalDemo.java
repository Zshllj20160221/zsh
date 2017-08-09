package zhifu;

import java.math.BigDecimal;

/**
 * java  如何保留指定精度
 *
 * http://blog.csdn.net/salahelx/article/details/49069113
 * http://www.cnblogs.com/chenssy/archive/2012/09/09/2677279.html
 * https://zhidao.baidu.com/question/1706259968572815780.html
 */
public class BigDecimalDemo {

    public static void main(String[] args){
        double f = 111231.5585;
        BigDecimal b = new BigDecimal(f);
        double f1 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);//111231.56
    }
}
