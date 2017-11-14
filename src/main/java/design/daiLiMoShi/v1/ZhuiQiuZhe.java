package design.daiLiMoShi.v1;

/**
 * Created by zsh on 2017/9/12.
 */
public class ZhuiQiuZhe implements GiveGift{

    private SchoolGirl mm;

    public ZhuiQiuZhe(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃.......");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你鲜花........");
    }
}
