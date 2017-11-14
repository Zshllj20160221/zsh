package design.yuanXingMoShi;

import java.util.ArrayList;

/**
 * Created by zsh on 2017/9/12.
 */
public class Prototype {
    public static void main(String[] args) throws Exception{
        MyClone myClone = new MyClone();
        myClone.setArrayList("zsh");
        MyClone myClone1 =(MyClone) myClone.clone();
        myClone1.setArrayList("llj");
        myClone1.setArrayList("llj");
        myClone.setArrayList("test");
        System.out.println("原对象："+myClone.getArrayList());
        System.out.println("原对象："+myClone.toString());
        System.out.println("拷贝原型对象："+ myClone1.getArrayList());
        System.out.println("拷贝原型对象："+ myClone1.toString());
    }

}

class MyClone implements Cloneable{

    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    protected MyClone clone(){
        MyClone myClone = null;
        try{
            myClone = (MyClone) super.clone();
            myClone.arrayList = (ArrayList<String>) this.arrayList.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return myClone;
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public ArrayList<String> getArrayList(){
        return arrayList;
    }
    public void setArrayList(String name){
        this.arrayList.add(name);
    }
}
