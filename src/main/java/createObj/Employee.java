package createObj;

import java.io.Serializable;

/**
 * Created by zsh on 2017/9/1.
 */
public class Employee implements Cloneable,Serializable{
    public Employee(){
        super();
    }
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }

}
