package design.jianDanGongChang.service;

/**
 * 减法
 */
public class Minus extends Operator {
    @Override
    public double computer() {
        return first_num - second_num;
    }
}
