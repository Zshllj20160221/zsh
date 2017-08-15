package jvmDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh on 2017/8/10.
 */
public class HeapOOM {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            List<OOMObject> list = new ArrayList<>();
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    list.add(new OOMObject());
                    System.out.println(System.currentTimeMillis());
                }
            }
        });
        thread.start();
    }
}
