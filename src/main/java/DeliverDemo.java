/**
 * Created by zsh on 2017/8/24.
 * java param deliver way
 */
public class DeliverDemo {

    public static void main(String[] args) {
        /**
         * way 1
         * value deliver for basic data type
         */
        int a = 1;
        int b = changeValue(1);
        System.out.println(a);
        /**
         * way 2
         * memory pointers for Object or Array type
         */
        Obj obj = new Obj(10, "llj");
        Obj obj2 = changeObj(obj);
        System.out.println(obj);
        System.out.println(obj2);

        System.out.println("array is the type of memory pointers:"+new int[2] instanceof Object);

        String [] strArray = new String[]{"abc","nihao","haha","hi"};
        String [] strArray2 = changeArray(strArray);
        System.out.println(strArray.toString());
        System.out.println(strArray2.toString());
        for(int i = 0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        for (int j = 0;j<strArray2.length;j++){
            System.out.println(strArray[j]);
        }

    }

    static int changeValue(int param) {
        param = 10;
        return param;
    }

    static Obj changeObj(Obj obj) {
        obj.name = "zsh";
        obj.age = 28;
        return obj;
    }

    static String [] changeArray(String [] array){
        array[0] = "Helloworld";
        return array;
    }

    static class Obj {
        int age;
        String name;

        Obj(int age, String name) {
            this.age = age;
            this.name = name;
            System.out.println("");
        }

        @Override
        public String toString() {
            return "[" + "age=" + this.age + "," + "name=" + this.name + "]";
        }
    }

}
