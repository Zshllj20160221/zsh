package design.jianDanGongChang.service;

/**
 * 计算基类
 */
public abstract class Operator {

    protected double first_num = 0;
    protected double second_num = 0;
    public abstract  double computer();

    public void setFirst_num(double first_num){
        this.first_num = first_num;
    }

    public double getFirst_num(){
        return this.first_num;
    }

    public void setSecond_num(double second_num){
        this.second_num = second_num;
    }

    public double getSecond_num(){
        return this.second_num;
    }


}
