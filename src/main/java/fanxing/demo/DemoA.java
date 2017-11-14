package fanxing.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class DemoA {
    public static void main(String [] args){
        Integer [] integers = {1,2,3,4,5,6};
        Double [] doubles = {1.1,1.2,1.3};
        Character [] character = {'a','b','c','e','f','g'};
        iteration(integers);
        System.out.println();
        iteration(doubles);
        System.out.println();
        iteration(character);
    }

    static <T> void iteration(T [] t){
        for(T element : t){
            System.out.printf("%s ",element);
        }
    }

    static void test(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Map<String,Object> map = new HashMap<>();
    }

    static void test2(){
        System.out.println("System.out.print");
    }

}
