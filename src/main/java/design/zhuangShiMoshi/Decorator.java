package design.zhuangShiMoshi;

/**
 * Created by zsh on 2017/9/12.
 */
public class Decorator implements Component{

    protected Component component;
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component !=null){
            component.operation();
        }
    }
}
