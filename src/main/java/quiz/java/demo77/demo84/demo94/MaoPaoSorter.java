package quiz.java.demo77.demo84.demo94;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 冒泡排序发 策略模式
 */
public class MaoPaoSorter implements Sorter{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] list) {
        System.out.println("进入冒泡排序..................");
        int length = list.length;
        for(int i = 1; i < length; i++){
            for(int j = 0; j< length; j++){
                if(list[j].compareTo(list[i])>0){
                    T temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return list;
    }

    public <T> T[] sort(T[] list, Comparator<T> comp) {
        System.out.println("..............");
        int length = list.length;
        for (int i = 1; i < length; i++){
            for (int j = 0;j<length;j++){
                if (comp.compare(list[j],list[i])>0){
                    T temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String [] args){
        Sorter sorter = new MaoPaoSorter();
        Integer num [] = {100,21,23,45,99,83,12};
        System.out.println(Arrays.toString(sorter.sort(num)));
        System.out.println(Arrays.toString(sorter.sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        })));
    }
}
