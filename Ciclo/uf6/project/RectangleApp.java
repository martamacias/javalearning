package cat.itb.martamacias7e4.dam.m03.uf6.project;

import cat.itb.martamacias7e4.dam.m03.uf6.project.data.Database;
import cat.itb.martamacias7e4.dam.m03.uf6.project.data.RectangleDAO;
import cat.itb.martamacias7e4.dam.m03.uf6.project.models.Rectangle;

import java.sql.Connection;
import java.sql.SQLException;

public class RectangleApp {
    public static void main(String[] args) throws SQLException {
        Database database = new Database();
        try(Connection connection = database.connect()) {
            RectangleDAO rectangleDAO = new RectangleDAO(database);
            // insert
            //rectangleDAO.insert(new Rectangle(13, 88, 5));
            // delete
            //rectangleDAO.delete(12);
            // update
            rectangleDAO.update(new Rectangle(11, 5,5));
            // list
            rectangleDAO.list().forEach(System.out::println);
        }
    }
}
