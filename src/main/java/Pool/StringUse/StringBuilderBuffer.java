package Pool.StringUse;

/**
 * http://blog.csdn.net/a1522365779/article/details/72896871
 */
public class StringBuilderBuffer {

    StringBuilder sb=new StringBuilder();
    StringBuffer sb1=new StringBuffer();

    public StringBuilderBuffer() {
        ThreadGroup group = new ThreadGroup("testGroup");
        MyThread at=new MyThread();
        for(int i=0;i<1000;i++){
            Thread th=new Thread(group,at,String.valueOf(i));
            th.start();
        }

        while (group.activeCount() > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(sb.length());
        System.out.println(sb1.length());

    }
    public static void main(String[] args) {
        new StringBuilderBuffer();
    }

    class MyThread implements Runnable {

        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sb.append("1");
            sb1.append("1");
        }
    }
}
