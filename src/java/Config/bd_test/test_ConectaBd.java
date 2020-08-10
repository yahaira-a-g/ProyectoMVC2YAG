package Config.bd_test;

import java.sql.Connection;
import java.sql.SQLException;
import Config.bd.ConectaBd;

public class test_ConectaBd {

    public static void main(String[] args) {
        ConectaBd bd = new ConectaBd();
        try (Connection cn = bd.getConnection()) {
            System.out.println("Conexion OK..)");
        } catch (SQLException e) {
            System.out.println("Error; ");
            System.out.println(e.getMessage());
        }
    }
}
