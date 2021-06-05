package cat.itb.martamacias7e4.dam.m03.uf6.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.BookDAO;
import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.data.DatabaseLibrary;
import cat.itb.martamacias7e4.dam.m03.uf6.generalexam.models.Book;

import java.sql.Connection;
import java.sql.SQLException;

public class LongestBookApp {
    public static void main(String[] args) throws SQLException {
        DatabaseLibrary database = new DatabaseLibrary();
        try(Connection connection = database.connect()) {
            BookDAO bookDAO = new BookDAO(database);
            System.out.println("## Longest Book");
            Book book = bookDAO.getLongestBook();
            System.out.println(book);
        }
    }
}
