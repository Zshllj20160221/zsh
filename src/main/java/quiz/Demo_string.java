package quiz;

/**
 * Created by zsh on 2017/10/23.
 */
public class Demo_string {
    public static void main(String [] args){
        String s1 = "programming";
        String s2 = new String("programming");
        String s3 = "program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());//true
    }
}
