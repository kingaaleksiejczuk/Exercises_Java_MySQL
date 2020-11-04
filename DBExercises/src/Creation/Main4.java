package Creation;

public class Main4 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    String queryCreateTable1 = "CREATE TABLE Cinemas (cinema_id int AUTO_INCREMENT,cinema_name varchar(255),cinema_address varchar(255),PRIMARY KEY(cinema_id));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    String queryCreateTable2 = "CREATE TABLE Movies (movie_id int AUTO_INCREMENT,movie_name varchar(255),"
            + "movie_description varchar(255),movie_rating decimal(4,2),PRIMARY KEY(movie_id));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    String queryCreateTable3 = "CREATE TABLE Tickets (id int AUTO_INCREMENT,quantity int,price decimal(4,2),PRIMARY KEY(id));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
    String queryCreateTable4 = "CREATE TABLE Payments (id int AUTO_INCREMENT,type varchar(255),date date,PRIMARY KEY(id));";
}