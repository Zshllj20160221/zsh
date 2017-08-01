package reflect;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zsh on 2017/8/1.
 */
public class ReflectDemo {

    public ReflectDemo(){
        try{
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("reflect.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String classname =  properties.getProperty("class");
        Class.forName(classname).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
