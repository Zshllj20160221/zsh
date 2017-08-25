package threadUse;

/**
 * way2 实现Runnable接口
 */
public class Java_thread_02 implements Runnable{
    
    public static void main(String[] args){
        (new Thread(new Java_thread_02())).start();
        System.out.println("main thread  run **********");
    }

    @Override
    public void run() {
        System.out.println("子线程run *******");
    }
}
