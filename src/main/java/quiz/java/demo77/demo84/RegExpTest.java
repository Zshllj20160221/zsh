package quiz.java.demo77.demo84;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zsh on 2017/10/27.
 */
public class RegExpTest {

    public static void main(String [] args){

        String str = "北京(shengzhen)广州(shanghai)杭州";
        Pattern pattern = Pattern.compile(".*?(?=\\()");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
