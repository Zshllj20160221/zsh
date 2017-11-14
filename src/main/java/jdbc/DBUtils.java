package jdbc;

import java.sql.*;

/**
 * Created by zsh on 2017/11/8.
 */
public class DBUtils {

    public static String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8";
    public static String USER = "root";
    public static String PASSWORD = "root";

    public static Connection connection;

    public static void main(String [] args){
        String sql  = "SELECT * FROM USER";
        try{
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
    }



}
