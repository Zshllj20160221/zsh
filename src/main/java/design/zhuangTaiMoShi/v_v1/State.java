package design.zhuangTaiMoShi.v_v1;

/**
 * Created by zsh on 2017/9/26.
 */

//定义和context中状态相对应的行为
public interface State {
    //获取天气情况
    String getState();
}
