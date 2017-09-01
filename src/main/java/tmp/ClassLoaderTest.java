package tmp;

import design.guanchaHeWeiTuo.SeeA;
import design.guanchaHeWeiTuo.SeeB;

/**
 * Created by zsh on 2017/8/30.
 */
public class ClassLoaderTest {
    public static void main(String [] args){
//        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
//        while(loader!=null){
//            System.out.println(loader);
//            System.out.println(loader.getClass().getName());
//            System.out.println(loader);
//            loader = loader.getParent();
//        }
//        System.out.println(ClassLoaderTest.class);
//        System.out.println(SeeB.class);
//        System.out.println(SeeB.class);
//        System.out.println(SeeA.class);
//        System.out.println(ClassLoaderTest.class==new ClassLoaderTest().getClass());
//
//        System.out.println(A.class == new A().getClass());
        System.out.println(new B().getClass().equals(A.class));
        System.out.println((B.class).equals(A.class));
        System.out.println(A.class);
        System.out.println(B.class);
        System.out.println(A.class.getName());
        System.out.println(B.class.getName());
        System.out.println(A.class.getSuperclass());
        System.out.println(B.class.getSuperclass());


    }

    static class A{

    }
    static class B extends A{

    }
}
