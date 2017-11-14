package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 比较DriverManager.register和Class.forName()区别
 * http://blog.csdn.net/hjf19790118/article/details/6857012
 */
public class JdbcTools extends ClassLoader {

    public static String URL = "jdbc:mysql://192.168.10.187/privilege_design?useUnicode=true&characterEncoding=utf-8";
    public static String USER = "root";
    public static String PASSWORD = "hsmysql";
    public static Connection CONNECTIOIN;


    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        new com.mysql.jdbc.Driver();
//        new JdbcTools().loadClass("com.mysql.jdbc.Driver");
        CONNECTIOIN = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "select count(1) from t_app_user ";
        PreparedStatement preparedStatement = CONNECTIOIN.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("t_app_user size:"+resultSet.getInt(1));
        }
//
    }


}
