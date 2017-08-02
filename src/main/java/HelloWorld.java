/**
 *Mac下Java的native方法以及JNI调用C语言  见readme
 */
public class HelloWorld {
    public native void hello();
    static {
        System.setProperty("java.library.path",".");
        System.loadLibrary("hello");
    }
    public static void main(String[] args){
        new HelloWorld().hello();
    }
}
