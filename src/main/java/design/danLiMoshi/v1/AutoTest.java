package design.danLiMoshi.v1;

/**
 * Created by zsh on 2017/11/1.
 */
public class AutoTest {
    public static void main(String [] args){
        System.out.println(" ");
        Integer a = new Integer(3);
        Integer b = 3;//将3 自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);//
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("缓存问题：********************************************************");
        Integer f1 = 100,f2 = 100,f3 = 150,f4 = 150;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
