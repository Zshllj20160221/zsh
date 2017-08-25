package Pool.StringUse;

/**
 http://blog.csdn.net/a1522365779/article/details/72896871
 */
public class ThreadTest {
    StringBuffer stringBuffer = new StringBuffer();
    StringBuilder sb = new StringBuilder();

    ThreadTest(){
        for(int i=0;i<5000;i++){
            Thread thread = new Thread(new CreateThread());
            thread.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.length());
        System.out.println(sb.length());
    }
    public static void main(String[] args){
        new ThreadTest();
    }


    class CreateThread implements Runnable{
        @Override
        public void run() {
            stringBuffer.append("a");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sb.append("b");
        }
    }


}



