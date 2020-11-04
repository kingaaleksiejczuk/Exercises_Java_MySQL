package Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main3 {
    //Zapisz w poniższej zmiennej kod zapytania SQL
    String query = "create database cinemas_ex";

    public static void main(String[] args){
        try{
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false", "root", "coderslab");
            System.out.println("połączono");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}