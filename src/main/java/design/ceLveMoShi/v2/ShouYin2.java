package design.ceLveMoShi.v2;

/**
 * 收银系统 增加打折
 */
public class ShouYin2 {

    public double btn_ok(int price,int num,int type){
        double total = 0;
        switch(type){
            case 0 :
                total = price*num;
                break;
            case 1 :
                total = price*num*0.8;
                break;
            case 2 :
                total = price*num*0.5;
                break;
            default:break;
        }
        return total;
    }

}
