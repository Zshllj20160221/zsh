package jvmDemo.stackUse.methodStack;

/**
 * Created by zsh on 2017/8/15.
 */
public class VMStack {

    public static void main(String[] args){
        int i = 0;
        while(true){
            i++;
            if(i<60){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(System.currentTimeMillis());
                }
            }
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(System.currentTimeMillis()+"create Thread");
                    while(true){
                    }
                }
            });
            thread.start();

        }
    }
}
