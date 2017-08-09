package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 性能比较  http://blog.csdn.net/salahelx/article/details/48490307
 */
public class MapDemo {

    public static void lsMap1(Map<String,String> map){
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
        }
    }
    public static void lsMap2(Map<String,String> map){
        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            String value = entry.getValue();
        }
    }

    public static void main(String[] args){

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        for(int i = 0; i<1000000; i++){
            map1.put(""+i,"keySet");
        }
        for(int i = 0; i<1000000; i++){
            map2.put(""+i,"entrySet");
        }

        long startTime = System.currentTimeMillis();
        lsMap1(map1);
        System.out.println("keySet:"+(System.currentTimeMillis()-startTime));

        long startTime2 = System.currentTimeMillis();
        lsMap2(map2);
        System.out.println("entrySet:"+(System.currentTimeMillis()-startTime2));
    }

}
