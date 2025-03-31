

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();
        db.createTable("RentCar");
        db.addTable("Rent", 1, "BMW", 1000);
        db.addTable("Rent", 2, "Maclaren", 1000);
        db.addTable("Rent", 3, "Ford", 1000);
        db.addTable("Rent", 4, "Tesla", 1000);
        db.addTable("Rent", 5, "BMW", 1000);
        db.addTable("Rent", 6, "BMW", 1000);
        db.addTable("Rent", 7, "BMW", 1000);
        db.addTable("Rent", 8, "BMW", 1000);
        db.addTable("Rent", 9, "BMW", 1000);
        db.addTable("Rent", 10, "BMW", 1000);

        db.selectTable("RentCar");


    }

}
