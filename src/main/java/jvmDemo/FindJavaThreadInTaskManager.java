package jvmDemo;

/**
 * https://jingyan.baidu.com/article/4f34706e3ec075e387b56df2.html
 * jstack和top用法
 * java程序CPU利用率高怎么排查
 */
public class FindJavaThreadInTaskManager {
    public static void main(String [] args){
        Thread thread = new Thread(new Worker());
        thread.start();
    }

    static class Worker implements Runnable{
        @Override
        public void run() {
            while(true){
                System.out.println("Thread Name:"+Thread.currentThread().getName());
            }
        }
    }

}
