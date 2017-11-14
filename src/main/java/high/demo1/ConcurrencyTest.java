package high.demo1;

/**
 * Created by zsh on 2017/10/12.
 * 测试串和并行性能
 */
public class ConcurrencyTest {
    private static final long count = 10000l;
    public static void main(String [] args) throws Exception{
        concurrency();
        serialMethod();
    }

    private static void concurrency() throws InterruptedException{
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                int a = 0;
                for(long i = 0; i < count; i++){
                    a += 5;
                }
            }
        });
        long start = System.currentTimeMillis();
        thread.start();
        int b = 0;
        for(long i = 0; i< count; i ++){
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();//join（）方法的作用是调用线程等待该线程完成后，才能继续用下运行。
        System.out.println("concurrency:"+time +"ms,b="+b);
    }

    private static void serialMethod(){
        long start = System.currentTimeMillis();
        int a = 0;
        for(long i = 0; i <count;i++){
            a +=5;
        }

        int b = 0;
        for (long i = 0;i<count;i++){
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serialMethod:"+time+"ms,b=,"+b);
    }
}
