package threadUse;

/**
 * way3 匿名方式
 * <p>
 * 实现Runnable接口优势：
 * <p>
 * 1）适合多个相同的程序代码的线程去处理同一个资源
 * <p>
 * 2）可以避免Java中的单继承的限制
 * <p>
 * 3）增加程序的健壮性，代码可以被多个线程共享，代码和数据独立。
 * <p>
 * 继承Thread类优势：
 * <p>
 * 1）可以将线程类抽象出来，当需要使用抽象工厂模式设计时。
 * <p>
 * 2）多线程同步
 * <p>
 * 在函数体使用优势
 * <p>
 * 1）无需继承thread或者实现Runnable，缩小作用域。
 */
public class Java_thread_03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程run***********************");
            }
        });
        thread.start();
        System.out.println("main线程run**************************");
    }
}
