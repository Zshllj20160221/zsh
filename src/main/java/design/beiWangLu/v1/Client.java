package design.beiWangLu.v1;

/**
 * Created by zsh on 2017/9/30.
 * http://blog.csdn.net/zhengzhb/article/details/7697549
 */
public class Client {

    public static void main(String [] args){
        Originator originator = new Originator();
        originator.setState("state1");
        System.out.println("init state:"+originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("state2");
        System.out.println("change state:" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("resume state:"+ originator.getState());
    }
}
