package tmp.demo;

/**
 * Created by zsh on 2017/9/11.
 */
public class Test01 {
    public static void main(String[] args){

        long start = System.currentTimeMillis();
        int s = 0;
        for(int i=0;i<=1000000000;i++){
            s=s+i;
        }
        System.out.println(s);

        System.out.println("time:"+(System.currentTimeMillis() - start));


        long start1 = System.currentTimeMillis();
        int s1 = 0;
        s1 = (1000000000+1)*(1000000000/2);
        System.out.println(s1);
        System.out.println("time2:"+(System.currentTimeMillis() - start1));
    }
}
