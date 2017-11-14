package quiz.java.demo77.demo84.demo95;

import java.util.Comparator;

/**
 * Created by zsh on 2017/10/27.
 * low + (high – low) / 2
 */
public class ErfenFa {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{12, 23, 90, 10, 56, 34, 67,100};
        System.out.println(array[sort(array, 56, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        })]);
        System.out.println();
    }

    public static <T> int sort(T[] t, T value, Comparator<T> comparator) {
        int low = 0;
        int high = t.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (comparator.compare(t[low], value) == 0) {
                return low;
            } else if (comparator.compare(t[high], value) == 0) {
                return high;
            } else if (comparator.compare(t[mid], value) == 0) {
                return mid;
            } else if (comparator.compare(t[mid], value) > 0) {
                if(high%2 != 0){
                    mid = mid + 1;
                }
                high = mid;
            } else if (comparator.compare(t[mid], value) < 0) {
                if(high%2 != 0){
                    mid = mid - 1;
                }
                low = mid;
            }
        }
        return -1;
    }
}
