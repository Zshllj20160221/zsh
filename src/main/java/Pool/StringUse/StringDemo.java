package Pool.StringUse;

/**
 * 效能比较  http://www.cnblogs.com/A_ming/archive/2010/04/13/1711395.html
 */
public class StringDemo {
    public static void main(String[] args){

        long start= System.currentTimeMillis();
        String a = "hello";
        for(int i=0;i<100000;i++){
            a = a+i;
        }
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(a);
        long start2 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("helo");
        for(int j=0;j<100000;j++){
            stringBuffer.append(j);
        }
        System.out.println(System.currentTimeMillis()-start2);
        System.out.println(stringBuffer.toString());

    }

}
