package cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseLibrary {
    String URL = "jdbc:postgresql://rosie.db.elephantsql.com:5432/";
    String BD = "hexiosoi";
    String USER = "hexiosoi";
    String PASS = "MG09uy0LaOzmVuXlHAckXLhSD_BRaWYo";

    Connection connection;
    public Connection connect() throws SQLException {
        connection =  DriverManager.getConnection(URL + BD, USER, PASS);
        return connection;
    }
    public Connection getConnection() {
        return connection;
    }
}
