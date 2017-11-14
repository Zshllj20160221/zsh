package design.zhuangShiMoshi;

/**
 * Created by zsh on 2017/9/12.
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
