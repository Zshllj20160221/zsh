package threadUse;

/**
 * http://blog.csdn.net/typename/article/details/7212512
 * way1继承Thread
 */
public class Java_thread extends Thread{
    public static void main(String args []){
        new Java_thread().run();
        System.out.println("main thread run ********************* ");
    }

    @Override
    public synchronized void run() {
        super.run();
        System.out.println("子线程run*****************");
    }
}
