package design.zhuangTaiMoShi.v2;

/**
 * Created by zsh on 2017/9/25.
 * 面向对象封装 方法代码过长 分支过多
 */
public class Work {
    private int hour;
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    private boolean finish = false;
    public void setFinish(Boolean finish){
        this.finish = finish;
    }
    public Boolean getiFinish(){
        return finish;
    }

    public void writeProgram(){
        if(hour<12){
            System.out.println("当前时间：" + hour + "点， 上午工作");
        }else if(hour<13){
            System.out.println("当前时间：" + hour + "点，饿了 犯困");
        }else if (hour<17){
            System.out.println("当前时间：" + hour + "点，下午状态还不错，继续努力");
        }else{
            if (finish){
                System.out.println("当前时间 :" + hour + "点，下班回家了");
            }else{
                if (hour<21){
                    System.out.println("当前时间：" + hour + "点，加班哦 疲累之极");
                }else{
                    System.out.println("当前时间：" + hour + "点，不行了，睡着了");
                }
            }
        }
    }
}
