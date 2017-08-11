package jvmDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh on 2017/8/10.
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<>();
        while(true){
//            try {
//                Thread.sleep(1000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
            list.add(new OOMObject());
            System.out.println(System.currentTimeMillis());
        }
    }
}
