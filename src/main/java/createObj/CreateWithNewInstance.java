package createObj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * http://www.cnblogs.com/yunger/p/5793632.html
 */
public class CreateWithNewInstance {
//    public static void main(String[] args) throws Exception{
////        Employee employee = new Employee();
//        Employee employee = (Employee) Class.forName("createObj.Employee").newInstance();
//        Employee employee1 = Employee.class.newInstance();
//
//        Constructor<Employee> constructor = Employee.class.getConstructor();
//        Employee employee2 =constructor.newInstance();
//
//        System.out.println(employee2);
//        Employee employee3 = employee2;
//        System.out.println(employee3);
//        System.out.println("hashcode:"+employee2.hashCode());
//        System.out.println("hashcode:"+employee3.hashCode());
//
//        employee3 = (Employee) employee2.clone();
//        System.out.println(employee3);
//        System.out.println("hashcode:"+employee3.hashCode());
//
//        Employee employee4 = new Employee();
//        employee4.setName("helo");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.obj"));
//        objectOutputStream.writeObject(employee4);
//        objectOutputStream.close();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data.obj"));
//        Employee employee5 = (Employee) objectInputStream.readObject();
//        objectInputStream.close();
////        employee5.setName("test");
//        System.out.println("name:"+employee5.getName());
//
//
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception{

//        Employee employee = new Employee();
//        Employee employee1 = employee;
//        Employee employee2 = (Employee) employee.clone();
//        System.out.println(employee==employee2);
//        System.out.println(employee.equals(employee2));
        String str = new String("h");
    }
}
