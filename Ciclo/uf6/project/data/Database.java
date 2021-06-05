package cat.itb.martamacias7e4.dam.m03.uf6.project.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    String URL = "jdbc:postgresql://tai.db.elephantsql.com:5432/";
    String BD = "zgdsykqk";
    String USER = "zgdsykqk";
    String PASS = "GfEOOLxMc8Le-XSfGVMlu1w7-7t4L64l";


    Connection connection;
    public Connection connect() throws SQLException {
        connection =  DriverManager.getConnection(URL + BD, USER, PASS);
        return connection;
    }
    public Connection getConnection() {
        return connection;
    }
}
