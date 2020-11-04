package Creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main1 {

    //Stwórz nową bazę danych o nazwie products_ex. Zapytanie SQL zapisz w zmiennej query.
    //Następnie napisz kod w metodzie main, który stworzy połączenie do tej bazy danych.


    public String query = "create database product_2020";

    public static void main(String[] args){
        try{
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/product_2020?useSSL=false", "root", "coderslab");
            System.out.println("połączono");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
