package design.zhuangTaiMoShi.v1;

/**
 * Created by zsh on 2017/9/25.
 * 面向过程
 */
public class Coder {
    static int hour = 0;//钟点
    static boolean finishedStatus = false;//任务完成标记

    public static void writeProgram(){
        if(hour<12){
            System.out.println("当前时间："+hour+" 上午工作，精神饱满");
        }else if(hour<13){
            System.out.println("当前时间： "+hour+" 饿了，犯困");
        }else if(hour<17){
            System.out.println("当前时间："+hour+" 下午状态还不错，继续努力");
        }else{
            if(finishedStatus){
                System.out.println("当前时间："+hour+" 下班回家了");
            }else{
                if(hour<21){
                    System.out.println("当前时间："+ hour + "加班哦，疲累之极");
                }else{
                    System.out.println("当前时间："+ hour + "不行了，睡着了");
                }
            }
        }
    }

    public static void main(String [] args){
        writeProgram();
    }
}
