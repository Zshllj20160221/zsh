package design.gongChang;

import design.gongChang.service.Add;
import design.gongChang.service.Opetator;

/**
 * Created by zsh on 2017/8/25.
 */
public class AddFactory implements IFactory{
    //AddFactory和Opetator是依赖关系  适用工厂模式 author:zsh
    @Override
    public Opetator createOperator() {
        return new Add();
    }

/**
 * 下面构造函数方式 是拥有关系  不适合工厂模式 author:zsh
 */
//    private Opetator opetator = null;
//    public AddFactory(){
//        opetator = new Add();
//    }
//    public Opetator getOpetator(){
//        return opetator;
//    }



}
