package quiz.AspectJ_Demo.demo1;

import quiz.Hello;

/**
 * Created by zsh on 2017/10/29.
 * http://blog.csdn.net/javazejian/article/details/56267036#简单案例快速入门
 */
public class Helloworld {
    public void sayHello(){
        System.out.println("Hello world!");
    }
    public static void main(String args []){
        Helloworld helloworld = new Helloworld();
        helloworld.sayHello();
    }
}
