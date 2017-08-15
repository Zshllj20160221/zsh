package jvmDemo.memory;

/**
 * 物理机运行长时间后会抛出内存溢出  那么很可能是内存泄漏引起的
 */
public class Leak {

    public static void main(String[] args){

        {
            A a = new A();
        }


    }
}
