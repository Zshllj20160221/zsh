package high.demo1.demo2;

/**
 * Created by zsh on 2017/10/12.
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";
    public static void main(String [] args){
        System.out.println("main1");
        new DeadLockDemo();
        System.out.println("main2");
    }

    private void deadLock(){
        System.out.println("jinru");
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("a");
                synchronized(A){
                    System.out.println("b");
                    try{
                        Thread.currentThread().sleep(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(B){
                        System.out.println("1");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("c");
                synchronized(B){
                    System.out.println("d");
                    synchronized(A){
                        System.out.println("2");
                    }
                }
            }
        });
        System.out.println("d1");
        t1.start();
        System.out.println("d2");
        t2.start();
        System.out.println("d3");
    }
}


