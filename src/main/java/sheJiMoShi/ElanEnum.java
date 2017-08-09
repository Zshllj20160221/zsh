package sheJiMoShi;

/**
 * 饿汉式 （枚举法）
 */
public enum ElanEnum {
    ElanEnum;
    private ElanEnum(){

    }
    public void say(){
        System.out.println("HelloWorld");
    }
}
