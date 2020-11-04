package Creation;

public class Main2 {

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public String queryCreateTable1 = "CREATE TABLE Products (product_id int AUTO_INCREMENT,product_name varchar(255),"
            + "product_description varchar(255),product_price decimal(4,2),PRIMARY KEY(product_id));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public String queryCreateTable2 = "CREATE TABLE Orders (order_id int AUTO_INCREMENT,order_description varchar(255),PRIMARY KEY(order_id));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public String queryCreateTable3 = "CREATE TABLE Clients(client_id int AUTO_INCREMENT,client_name varchar(255), PRIMARY KEY(client_id));";

}
