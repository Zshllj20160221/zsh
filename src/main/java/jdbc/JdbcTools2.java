package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 比较DriverManager.register和Class.forName()区别
 * http://blog.csdn.net/hjf19790118/article/details/6857012
 */
public class JdbcTools2 extends ClassLoader {

    public static String URL = "jdbc:mysql://192.168.10.187/privilege_design?useUnicode=true&characterEncoding=utf-8";
    public static String USER = "root";
    public static String PASSWORD = "hsmysql";

    public static void main(String[] args) throws Exception {
        for(int i=0;i<40;i++) {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "select count(1) from t_app_user ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("t_app_user size:" + resultSet.getInt(1));
            }
        }

    }

    
}
