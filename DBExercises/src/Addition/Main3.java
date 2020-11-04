package Addition;

import java.sql.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

    int id=0;
    String name="";
    String address="";

    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj id nowego kina: ");
    id = scan.nextInt();
    System.out.println("Podaj nazwę: ");
    name = scan.next();
    System.out.println("Podaj adres: ");
    address = scan.next();
    addCinema(id,name,address);
    scan.close();

}
    static void addCinema(int id, String name, String address){
        String urlCinemas = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false";
        String user = "root";
        String password = "coderslab";

        try (Connection conn = DriverManager.getConnection(urlCinemas, user, password)){
            Statement stmt = conn.createStatement();
            PreparedStatement preStm = conn.prepareStatement("INSERT INTO Cinemas (cinema_id, cinema_name, cinema_address) VALUES (?,?,?)");// insert into pozwala na nowy zapis
            preStm.setInt(1, id);
            preStm.setString(2, name);
            preStm.setString(3, address);
            preStm.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
