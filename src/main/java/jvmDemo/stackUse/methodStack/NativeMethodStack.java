package jvmDemo.stackUse.methodStack;

/**
 * Created by zsh on 2017/8/17.
 */
public class NativeMethodStack {
    private void dontStop(){
        while(true){

        }
    }

    public void stackLeakByThread(){
        while(true){
            System.out.println("create---------"+System.currentTimeMillis());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String [] args){
        try{
            Thread.sleep(30000);
            System.out.println("30 秒过后************");
            NativeMethodStack nativeMethodStack = new NativeMethodStack();
            nativeMethodStack.stackLeakByThread();
        }catch (Exception e){

        }

    }
}
