package jvmDemo;

/**
 * Created by zsh on 2017/8/10.
 */
public class HeapOOM2 {
    static class OOMObject2{

    }

    public static void main(String[] args){
//        List<OOMObject2> list = new ArrayList<>();
        while(true){
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}
