package tmp.staticUse;

/**
 * Created by zsh on 2017/9/1.
 */
public class DriverDemo {

    private String driverName;
    public DriverDemo(String driverName){
        System.out.println("create DriverDemo .........................");
        this.driverName = driverName;
    }
    public String getDriverName(){
        return this.driverName;
    }
    public void setDriverName(String driverName){
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "[driverName:"+this.driverName+"]";
    }
}
