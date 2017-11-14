package fanxing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zsh on 2017/9/5.
 */
public class GenericTest {

    public static void main(String[] args){
        Object object = new GenericTest().test();
        System.out.println(object);
        Map map = new GenericTest().test();
        System.out.println(map);

        String str = new GenericTest().test2("ee");
        System.out.println(str);

        System.out.println(Object.class);
    }

    public <T> T test(){
        Map map = new HashMap();
        map.put("dd","d");
        return (T)map;
    }

    public <T> T test2(T t){

        return t;
    }
    //Class<?> 相当于 Class<? extends Object> ?是个通配符，可以用任何由Object派生的类型代替
    public Class getColumnClass(int columnIndex) {
        return Object.class;
    }

    public Map<String,Object> test4(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("22",new Integer(9));
        return map;
    }

}
