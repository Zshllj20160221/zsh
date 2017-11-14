package design.daiLiMoShi.v1;

/**
 * Created by zsh on 2017/9/12.
 */
public class Proxy implements GiveGift{

    private ZhuiQiuZhe zhuiQiuZhe;

    public Proxy(SchoolGirl mm){
        zhuiQiuZhe = new ZhuiQiuZhe(mm);
    }
    @Override
    public void giveDolls() {
        zhuiQiuZhe.giveDolls();
    }

    @Override
    public void giveFlowers() {
        zhuiQiuZhe.giveFlowers();
    }
}
