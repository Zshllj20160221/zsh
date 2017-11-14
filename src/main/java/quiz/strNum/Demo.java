package quiz.strNum;

/**
 * Created by zsh on 2017/10/24.
 */
public class Demo {
    public static void main(String [] args){

        int num = Integer.parseInt("2");
        Integer integerNum = Integer.valueOf("2");

        String str = num+"";
        String str2 = String.valueOf(num);

        System.out.println("str:"+str);
        System.out.println("str2:"+str2);

    }
}
