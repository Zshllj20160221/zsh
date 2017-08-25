package Pool;

/**
 *
 *
 *
 *
 * 这段代码在JDK1.6中运行，会得到两个false，
 * 而在JDK1.7中运行，会得到一个true和一个false。
 *
 * 产生差异的原因是：在JDK1.6中，intern()方法会首次遇到的字符串实例复制到永久代中，
 * 返回的也是永久代中这个字符串实例的引用，
 * 而由StringBuilder创建的字符串实例在Java堆上，所以必然不是同一个引用，将返回false。
 *
 *
 * 而在JDK1.7（以及部分其它虚拟机，例如JRockit）的intern()实现不会再复制实例，
 * 只是在常量池中记录首次出现的实例引用，
 * 因此intern()返回的引用和由StringBuilder创建的那个字符串实例是同一个。
 *
 * 对于str2比较返回false是因为“java”这个字符串在执行StringBuilder.toString()之前已经出现s过，
 * 字符串常量池中已经有它的引用了，不符合“首次出现”的原则，而“计算机软件”这个字符则是首次出现的，因此返回true。
 *
 *
 *方法区用于存放Class的相关信息，如类名、访问修饰符、常量池、字段描述、方法描述等。对于这些区域的测试，基本的思路是运行时产生大量的类去填满方法区，直到溢出。虽然直接使用Java SE API也可以动态产生类（如反射时的GeneratedConstructorAccessor和动态代理等），但在本次试验中操作起来比较麻烦。在下列代码中，笔者借助CGLib直接操作字节码运行时生成了大量的动态类。
 *当前的很多主流框架，如spring、hibernate，在对类进行增强是，都会使用到CGLib这类字节码技术，增强的类越多，就需要越大的方法区来保证动态生成的Class可以加载入内存。JVM上的动态语言（例如Groovy等）通常都会持续创建类来实现语言的动态性。
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args){
        String str1 = new StringBuilder("计算机").append("软件").toString();
                System.out.println(str1.intern()==str1);

        String str2 = new StringBuilder("ja").append("va").toString();
                System.out.println(str2.intern()==str2);
    }


}
