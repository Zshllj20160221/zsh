package design.gongChang.service;

/**
 * Created by zsh on 2017/8/25.
 */
public abstract class Opetator {

    protected double first_num;
    protected double second_num;

    public abstract double computer();

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
        return second_num;
    }
}
