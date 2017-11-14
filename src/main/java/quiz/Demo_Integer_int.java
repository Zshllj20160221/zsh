package quiz;

/**
 * Created by zsh on 2017/10/23.
 */
public class Demo_Integer_int {
    public static void main(String [] args){
        Integer a = 100;
        Integer b = 150; // 将150自动装箱成Integer类型
        Integer c = 200;
        Integer d = 300;

        Integer a1 = 100;
        Integer b1 = 150;
        Integer c1 = 200;
        Integer d1 = 300;

        System.out.println(a==a1);
        System.out.println(c==c1);


        Integer a3 = new Integer(100);
        System.out.println(a == a3);// false 两个引用没有引用同一对象

        int a3_ = 100;
        System.out.println(a3 == a3_);// true a自动拆箱成int类型再和c比较

        System.out.println("******************1111111111111");
        System.out.println("******************2222222222222");

    }
}
