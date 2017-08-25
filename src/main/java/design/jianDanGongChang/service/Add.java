package design.jianDanGongChang.service;

/**
 * 加法
 */
public class Add extends Operator{
    @Override
    public double computer() {
        return first_num + second_num;
    }
}
