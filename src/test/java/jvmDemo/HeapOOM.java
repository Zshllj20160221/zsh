package jvmDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<>();
        while(true){
            list.add(new OOMObject());
            System.out.println("0");
        }
    }
}
