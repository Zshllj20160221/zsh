package quiz.java.demo77.demo84.demo94;

import java.util.Comparator;

/**
 * Created by zsh on 2017/10/27.
 */
public interface Sorter {
    public <T extends Comparable<T>> T[] sort(T[] list);

    public <T> T[] sort(T[] list,Comparator<T> comp);
}
