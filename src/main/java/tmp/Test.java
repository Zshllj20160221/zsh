package tmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by zsh on 2017/8/21.
 */
public class Test {
    public static void main(String[] args){
//        ClassLoader loader = Test.class.getClassLoader();
//        System.out.println(loader.toString());
//        System.out.println(loader.getParent().toString());
//        System.out.println(loader.getParent().getParent());
//        System.out.println(new Test());
//        System.out.println(new Test());

        String [] array = new String [] {"a","b"};
        String printString = Arrays.toString(array);
        System.out.println(printString);
        System.out.println(array);

        ArrayList list = new ArrayList();
        list.add("a");

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);



    }
}
