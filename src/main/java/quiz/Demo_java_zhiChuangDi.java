package quiz;

/**
 * Created by zsh on 2017/10/23.
 */
public class Demo_java_zhiChuangDi {

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    class Cat{
        String color;
        int age;
        public Cat(String color,int age){
            this.color = color;
            this.age = age;
        }
        @Override
        public String toString() {
            return "[color:"+color+" age:"+age+"]";
        }
        public void setColor(String color){
            this.color = color;
        }
        public String getColor(){
            return this.color;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(int age){
            return age;
        }
    }
    public static void main(String [] args){
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("a:"+a+" b:"+b);
    }
}
